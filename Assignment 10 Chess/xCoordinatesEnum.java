import java.util.HashMap;
class xCoordinatesEnum {

    private static final HashMap<Character, Integer> xCoordinateSI = new HashMap<Character, Integer>();
    private static final HashMap<Integer, String> xCoordinateIS = new HashMap<Integer, String>();

    private static void initHashMap(){
        xCoordinateSI.put('A', 1);
        xCoordinateSI.put('B', 2);
        xCoordinateSI.put('C', 3);
        xCoordinateSI.put('D', 4);
        xCoordinateSI.put('E', 5);
        xCoordinateSI.put('F', 6);
        xCoordinateSI.put('G', 7);
        xCoordinateSI.put('H',8);

        xCoordinateIS.put(1, "A");
        xCoordinateIS.put(2, "B");
        xCoordinateIS.put(3, "C");
        xCoordinateIS.put(4, "D");
        xCoordinateIS.put(5, "E");
        xCoordinateIS.put(6, "F");
        xCoordinateIS.put(7, "G");
        xCoordinateIS.put(8, "H");
    }
    
    public static String getKey(int key){
        initHashMap();
        return xCoordinateIS.get(key);
    }

    public static int getKey(char key){
        initHashMap();
        return xCoordinateSI.get(key);
    }
}
