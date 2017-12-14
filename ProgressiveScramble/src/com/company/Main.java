package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class Main {

    public static void main(String[] args)
	{
	String s = " abcdefghijklmnopqrstuvwxyz";
	List<String> alphabet = new ArrayList<String>(Arrays.asList(s.split("")));
	Map<Array, Array> AlphatoNum = new HashMap<Array, Array>();
	Map<Array, Array> NumtoAlpha = new HashMap<Array, Array>();
	for(int i = 0; i < alphabet.size(); i++)
	{
		AlphatoNum.put(alphabet[i], i);
		NumtoAlpha.put(i, alphabet[i]);

	}
		System.out.println(AlphatoNum.get(2));
    }
}
