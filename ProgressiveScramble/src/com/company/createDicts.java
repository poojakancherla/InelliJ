package com.company;

import java.util.HashMap;

public class createDicts
{
    HashMap AlphatoNum = new HashMap();
    HashMap NumtoAlpha = new HashMap();

    String str = " abcdefghijklmnopqrstuvwxyz";
    public  createDicts()
    {
        for(int i = 0; i < str.length(); i++)
        {
            AlphatoNum.put(str.charAt(i), i);
            NumtoAlpha.put(i, str.charAt(i));
        }
    }
}
