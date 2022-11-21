package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Solution(){

    }

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<magazine.length();i++){

            char character = magazine.charAt(i);

            if(map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }else{

                map.put(character,1);
            }
        }
        for(int i = 0;i<ransomNote.length();i++){

            char character = ransomNote.charAt(i);

            if(!map.containsKey(character) || map.get(character) <= 0){

                return false;

            }else{

                map.put(character,map.get(character)-1);
            }
        }

        return true;
    }
}