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

        BinarySearchTree bst = new BinarySearchTree;
        bst.insert(5);
        bst.insert(2);
        Log.d("berttest", "BST output");
        bst.inorderTraversal(bst.root);



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

        int[] arr  = new int[9];
        arr[0]=8;
        arr[1]=5;
        arr[2]=6;
        arr[3]=2;
        arr[4]=3;
        arr[5]=9;
        arr[6]=1;
        arr[7]=10;
        arr[8]=4;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    arr = swap(arr,j,j+1);
                }
            }
        }
        Log.d("berttest","bubblesort");
        printValues(arr);



    }

    public static int[] swap(int[] arr ,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public void printValues(int a[]){
        for(int i=0; i<a.length; i++){
            Log.d("berttest", "print values: " + a[i]);
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