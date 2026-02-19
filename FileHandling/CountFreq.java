package FileHandling;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountFreq {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new TreeMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))) {
            String line =br.readLine();
            String[] nums=line.split(" ");
            for (String i:nums){
                int no=Integer.parseInt(i);
                map.put(no,map.getOrDefault(no,0)+1);
            }
        }catch (IOException e){
            System.out.println(e.getMessage()+"error hai C");
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
