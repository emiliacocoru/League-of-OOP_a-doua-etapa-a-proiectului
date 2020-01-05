package gameplan;

public final class Map {
   /* private static char[][] map;
    public Map() {

    }
    public Map(final int line, final int column) {
        map = new char[line][column];
    }

    public void updateMap(final int  line, final int column, final char type) {
        map[line][column] = type;
    }
    public char[][] getMap() {
        return map;
    }*/
   private static Map instance = null;
   private char[][] map;

    public char[][] getMap() {
        return map;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    private Map () { }
   public static Map getInstance() {
       if (instance == null) {
           instance = new Map();
       }
       return instance;
   }
}
