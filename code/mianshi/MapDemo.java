package mianshi;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        changeMap(map);
        System.out.println(map);
    }

    private static  void  changeMap(HashMap<String, String> map) {
        map.put( "A", "B" );
    }
}
