package org.launchcode.java.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String HiddenFigures = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. So if " +
                "you move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> count = new HashMap<>();
        char[] characterCount = HiddenFigures.toLowerCase().toCharArray();
//loop through the string
        for (char i : characterCount) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> list : count.entrySet()) {
            System.out.println(list.getKey() + ":" + list.getValue() );
        }

    }
}