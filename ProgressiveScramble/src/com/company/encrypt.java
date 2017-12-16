package com.company;

import java.util.ArrayList;
import java.util.List;

public class encrypt
{
    String cipher = "";

    public String encryptt(createDicts dicts, String message)
    {
        List num = new ArrayList();
        List NumMod = new ArrayList();

        for (int i = 0; i < message.length(); i++)
        {
            num.add((int)dicts.AlphatoNum.get(message.charAt(i)));
        }



        for (int i = 1; i < num.size(); i++)
        {
            num.set(i,(int)num.get(i) + (int)num.get(i-1));
        }

        for (int i = 0; i < num.size(); i++)
        {
            System.out.print(num.get(i) + " ");
        }

        for (int i = 0; i < num.size(); i++)
        {
            NumMod.add((int)num.get(i) % 27);
        }

        for (int i = 0; i < NumMod.size(); i++)
        {
            System.out.print(NumMod.get(i) + " ");
        }

        for (int i = 0; i < NumMod.size(); i++)
        {
            cipher += (char)dicts.NumtoAlpha.get(NumMod.get(i));
        }

        return cipher;
    }
}
