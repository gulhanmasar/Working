import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){

        String[] myStringArray = new String[3];

        myStringArray[0] = "miray";
        myStringArray[1] = "aybuke";
        myStringArray[2] = "omergokalp";

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        int[] myInetgerArray = new int[3];
        myInetgerArray[0] = 5;
        myInetgerArray[1] = 5;
        myInetgerArray[2] = 3;
        System.out.println(myInetgerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6};
        System.out.println(myNumberArray[2]);

        //Lists

        ArrayList<String> myMusicians = new ArrayList<>();
        myMusicians.add("sercan");
        myMusicians.add("gulhan");
        myMusicians.add(1,"omer");
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.size());

        //Set
        HashSet<String> mySet = new HashSet<>();
        mySet.add("gulhan");
        mySet.add("gulhan");
        System.out.println(mySet.size());

        //HashMap
        HashMap<String,String> myHashMap = new HashMap<String,String>();
        myHashMap.put("name", "music");
        myHashMap.put("instrument","guitar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String,Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball",200);
        System.out.println(mySecondMap.get("run"));



    }
}
