package main;

import angels.Angel;
import angels.AngelVisitor;
import gameplan.LookingForPlayersInTheSameSpot;
import gameplan.Move;
import magician.Magician;
import readinput.StartGame;
import players.Player;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;


public final class Main {
    private Main() { }

    public static void main(final String[] args) throws IOException {
        String input = args[0];
        PrintStream file = new PrintStream(new File(args[1]));
        System.setOut(file);
         //start reading data from file
        StartGame startGame = new StartGame();
        startGame.readInput(input);

        ArrayList<Player> players = startGame.getPlayers();
        int participants = startGame.getParticipants();
        int rounds = startGame.getRounds();
        ArrayList<String> movesRounds = startGame.getMoves();
        Move moves = new Move();
        LookingForPlayersInTheSameSpot theyFight = new LookingForPlayersInTheSameSpot();
        ArrayList<Angel> angels = startGame.getAngels();
        ArrayList<Integer> numberAngelPerRound = startGame.getNumberAngelsEachRound();

        /* for each round, each player moves
            only if he is not affected by inability to move */
        for (int i = 0; i < rounds; i++) {
            System.out.println("~~ Round " + (i + 1) + " ~~");
            for (int j = 0; j < participants; j++) {
                if (players.get(j).getIncapacityOfMovement() == 0) {
                    moves.makeMove(players.get(j), movesRounds.get(i).charAt(j));
                } else {
                    players.get(j).setIncapacityOfMovement(players.get(j).getIncapacityOfMovement()
                            - 1);
                }
            }
            // each player receives the damage from the last round
            // if it is the case
            for (int w = 0; w < participants; w++) {
                players.get(w).poisonDamage(players.get(w));
                if (players.get(w).getHp() <= 0) {
                    players.get(w).setDead(1);
                }
            }

            // two players in thw same spot will fight
            theyFight.lookingForPlayersInTheSameSpot(players);
            /* the wasFighting variable is to prevent a player
               not to fight twice in a round */
            // when is 0, he did not fight
            // when is 1, he fought
            for (Player x : players) {
                x.setWasFighting(0);
            }
            int angelThisRound = numberAngelPerRound.get(i);
            Magician magician = new Magician();
            int count = 0;
            while (angelThisRound > 0) {
                magician.setAngel(angels.get(0));
                angels.get(0).addObserver(magician);
                for (Player play : players) {
                    if (play.getLineMap() == angels.get(0).getLinePosition()) {
                        if (play.getColumnMap() == angels.get(0).getColumnPosition()) {
                            angels.get(0).setActualPlayer(play);
                            //magician.update();
                            angels.get(0).notifyObserver();
                            play.accept((AngelVisitor) angels.get(0));
                        }
                    }
                }
                angelThisRound--;
                angels.remove(0);
            }
            System.out.println("");
        }
        System.out.println("~~ Results ~~");
        for (Player x : players) {
            if (x.getDead() == 0) {
                System.out.print(x.getType() + " ");
                System.out.print(x.getLevel());
                System.out.print(" ");
                System.out.print(x.getXp());
                System.out.print(" ");
                System.out.print(x.getHp());
                System.out.print(" ");
                System.out.print(x.getLineMap());
                System.out.print(" ");
                System.out.print(x.getColumnMap());
            } else {
                System.out.print(x.getType() + " ");
                System.out.print("dead");
            }
            System.out.println("");
        }

    }
}
