package gameplan;

public final class Map {
   private static Map instance = null;
   private char[][] map;

    public char[][] getMap() {
        return map;
    }

    public void setMap(final char[][] map) {
        this.map = map;
    }

    private Map() {
    }
   public static Map getInstance() {
       if (instance == null) {
           instance = new Map();
       }
       return instance;
   }
}
