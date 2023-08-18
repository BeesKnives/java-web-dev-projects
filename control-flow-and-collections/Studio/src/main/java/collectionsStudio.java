import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class collectionsStudio {
    public static void main(String[] args){

        HashMap < String, Integer > letters = new HashMap<>(); // HashMap called "letters"
        char[] word = "Supercallifragilisticexpialidocious".toCharArray(); // a long word in a char array
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); // the alphabet in a char array


        for(char i : word){ //iterate through word
            for(char k : alphabet){ //iterate through alphabet

                if(String.valueOf(i).equals(String.valueOf(k))){ //if they equal

                    if(letters.containsKey(String.valueOf(i))){//if my hashmap contains the word's letter

                        letters.put(String.valueOf(k),  (letters.get(String.valueOf(k)) + 1)); //add 1 to that value

                    }else{
                        letters.put(String.valueOf(k), 1); //else make a new key/value pair in the hashmap
                    }
                }
            }
        }
        for(Map.Entry <String,Integer> letter: letters.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue()); //print "key: value"
        }






    }
}
