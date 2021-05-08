package com.bort.playaround6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, Integer> map = new HashMap<>();
        map.put("test",0);
        map.put("test1",1);
        map.put("test2",2);
        map.put("test3",3);
        map.put("test4",4);


        map.remove("test3");

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            entry.getValue();
            entry.getKey();
            Log.d("berttest", "hashmap key:" + entry.getKey() + " value:" + entry.getValue());
        }

        String string = "felfjelgjeoigreog";

        Set<Character> set = new HashSet<Character>();

        for(int i=0; i<string.length(); i++){
            set.add(string.charAt(i));
        }

        for(char temp : set){
            Log.d("berttest","current char:" + temp);
        }



    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for(String temp:magazine){
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }
            else{
                map.put(temp, 1);
            }
        }

        for(String temp:note){
            if(map.containsKey(temp)){
                if(map.get(temp)>1){
                    map.put(temp,map.get(temp)-1);
                }
                else{
                    map.remove(temp);
                }
            }
            else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }

    public static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for(int i=0; i<s1.length(); i++){
            set1.add(s1.charAt(i));
        }
        for(int i=0; i<s2.length(); i++){
            set2.add(s2.charAt(i));
        }
        for(char temp1:set1){
            for(char temp2:set2){
                if(temp1==temp2){
                    return "YES";
                }
            }
        }
        return "NO";

    }

}