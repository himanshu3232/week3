package org.capgemini.problem_3;

public class CompareStringClasses {

    public static String concatStringsUsingString(String[] strings){
        String result = "";

        for(String s : strings) result = result.concat(s);

        return result;
    }

    public static String concatStringsUsingStringBuilder(String[] strings){
        StringBuilder result = new StringBuilder();

        for(String s : strings) result.append(s);

        return result.toString();
    }

    public static String concatStringsUsingStringBuffer(String[] strings){
        StringBuffer result = new StringBuffer();

        for(String s : strings) result.append(s);

        return result.toString();
    }
}
