package com.bodriahina;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Tralfamadorian {

    private Tralfamadorian(){}

    private static final Map<Character,Integer> DICTIONARY = Map.of(
            'α', 1,
            'β', 2,
            'γ', 3,
            'δ', 4,
            'ε', 5,
            'ζ', 6,
            'η', 7,
            'θ', 8,
            'ι', 9);

    public static Long convertToLong(String input){
        Long output = 0L;
        for(String s: splitter(input)){
            output += greekToNumber(s.charAt(0)) * digitToNumber(s.substring(1));
        }
        return output;
    }

    private static List<String> splitter(String tralfamadorian){
        String regex = "([αβγδεζηθι]\\+*x*\\|*)";
        Matcher matcher = Pattern.compile(regex).matcher(tralfamadorian);
        List<String> result = new ArrayList<>();
        while (matcher.find()){
            result.add(matcher.group());
        }
        return result;
    }

    private static Integer greekToNumber(Character greek){
        return DICTIONARY.get(greek);
    }

    private static Long digitToNumber(String digit){
        Integer number = 0;
        for(int i = 0; i<digit.length(); i++) {
            char charAtI = digit.charAt(i);
            if (charAtI == '+') number += 1;
            else if (charAtI == 'x') number += 2;
        }
        return (long) Math.pow(10, number);
    }
}
