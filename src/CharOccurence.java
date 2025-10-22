//import java.sql.SQLOutput;
//import java.util.HashMap;
//import java.util.Map;
//
///*
//public class CharOccurence {
//
//    public static void main(String[] args) {
//        String str = "Hello World";
//        Map<Character,Integer> map = new HashMap<>();
//
//        for(char c : str.toCharArray()){
//            if(c != ' '){
//                map.put(c,map.getOrDefault(c,0)+ 1);
//
//            }
//        }
//        System.out.println("Character Frequencies : ");
//
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + "-->" + entry.getValue());
//
//        }
//
//        for( char c : str.toCharArray()){
//            if(c != ' '){
//                map.put(c,map.getOrDefault(c,0)+1);
//            }
//        }
//
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+ "-->" + entry.getValue());
//        }
//
//        for(char c : str.toCharArray()){
//            if(c!=' '){
//                map.put(c,map.getOrDefault(c,0)+1);
//            }
//        }
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+ "--->" + entry.getValue());
//        }
//    }
//
//}
//*/
//
//public class CharOccurence {
//    public static void main(String[] args) {
//        String str = "RAMESHCHANDRAPRASAD DIVENDRAPPA DEVARAHALLY";
//        Map<Character,Integer> map = new HashMap<>();
//
//
//        for(char c : str.toCharArray()){
//            if(c != ' '){
//                map.put(c,map.getOrDefault(c,0)+1);
//
//            }
//        }
//
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+ "-->" + entry.getValue());
//        }
//
//        Map<Character,Integer> maps= new HashMap<>();
//
//        for(char c : str.toCharArray()){
//            if(c != ' '){
//                maps.put(c,maps.getOrDefault(c,0)+1);
//            }
//        }
//        for(Map.Entry<Character,Integer> entry : maps.entrySet()){
//            System.out.println(entry.getKey()+ "===>" + entry.getValue());
//        }
//    }
//
//
//    }
//}