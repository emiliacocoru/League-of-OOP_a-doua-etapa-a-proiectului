package readinput;

import angels.Angel;
import angels.AngelFactory;
import gameplan.Map;
import fileio.implementations.FileReader;
import magician.Magician;
import players.Player;
import players.PlayerFactory;

import java.io.IOException;
import java.util.ArrayList;

public final class StartGame {
    private int participants;
     private int rounds;
     private ArrayList<Player> players = new ArrayList<>();
     private ArrayList<String> moves = new ArrayList<>();

     private ArrayList<Integer> numberAngelsEachRound = new ArrayList<>();
     private ArrayList<Angel> angels = new ArrayList<>();

    public ArrayList<Integer> getNumberAngelsEachRound() {
        return numberAngelsEachRound;
    }

    public ArrayList<Angel> getAngels() {
        return angels;
    }

    public int getParticipants() {
        return participants;
    }

     public int getRounds() {
        return rounds;
    }

     public ArrayList<Player> getPlayers() {
        return players;
    }

     public ArrayList<String> getMoves() {
        return moves;
    }


    public void readInput(final String input) throws IOException {
         // fetches the data from the input file
         // each variable is assigned the necessary information
         FileReader fileReader = new FileReader(input);
        int numberLines = fileReader.nextInt();
        int numberColumns = fileReader.nextInt();
        // numberLines + numberColumns = the dimensions of the map
        char[][] game = null;
        game = new char[numberLines][numberColumns];
         for (int i = 0; i < numberLines; i++) {
            String typeGround = fileReader.nextWord();
            for (int j = 0; j < numberColumns; j++) {
                game[i][j] = typeGround.charAt(j);
            }
         }
         Map gameMap = Map.getInstance();
         gameMap.setMap(game);
         participants = fileReader.nextInt(); // number of players
         Player player = null;
         Angel angel = null;
         AngelFactory angelCategory = new AngelFactory();
         PlayerFactory playerCategory = new PlayerFactory();
         for (int i = 0; i < participants; i++) {
            String typePlayer = fileReader.nextWord();
            player = playerCategory.createPlayer(typePlayer.charAt(0));
            if (player !=  null) {
                player.setLineMap(fileReader.nextInt());
                player.setColumnMap(fileReader.nextInt());
                player.setId(i);
                players.add(player);
            }
         }
         rounds = fileReader.nextInt(); // number of rounds
         for (int i = 0; i < rounds; i++) {
             String roundMoves = fileReader.nextWord();
             moves.add(roundMoves);
         }
         for (int i = 0; i < rounds; i++) {
             int numberAngelThisRound = fileReader.nextInt();
             numberAngelsEachRound.add(numberAngelThisRound);
             while (numberAngelThisRound > 0) {
                 String line = fileReader.nextWord();
                 String angelType = null;
                 int position = 0;
                 for (int w = 0; w < line.length(); w++) {
                     if (line.charAt(w) == ',') {
                        angelType = line.substring(0, w);
                        position = w + 1;
                        w = line.length() + 1;
                     }
                 }
                 int lineMapAngel = 0;
                 int columnMapAngel = 0;
                 for (int w = position + 1; w < line.length(); w++) {
                     if (line.charAt(w) == ',') {
                         lineMapAngel = Integer.parseInt(line.substring(position, w));
                         position = w + 1;
                         w = line.length() +  1;
                     }
                 }
                 columnMapAngel = Integer.parseInt(line.substring(position, line.length()));
                 if (angelType != null) {
                     angel = angelCategory.createAngel(angelType);
                 }
                 if (angel != null) {
                     angel.setType(angelType);
                     angel.setLinePosition(lineMapAngel);
                     angel.setColumnPosition(columnMapAngel);

                     angels.add(angel);
                 }
                 numberAngelThisRound--;
             }
         }
    }
}

