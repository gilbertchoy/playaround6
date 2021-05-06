package com.bort.playaround6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}