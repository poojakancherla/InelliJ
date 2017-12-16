package com.company;
import java.util.*;

public class PScramble
{
	public static void main(String[] args)
	{
		createDicts dicts = new createDicts();
		Scanner s = new Scanner(System.in);

		int testcases = Integer.parseInt(s.nextLine());
		String line = "", message = "";
		char task = '\0';

		encrypt e = new encrypt();
		decrypt d = new decrypt();
		String cipher = "", plain = "";

		for (int i = 0; i< testcases; i++)
		{
			line = s.nextLine();

			task = line.charAt(0);

			message = line.substring(2);

			if(task == 'e')
			{
				cipher = e.encryptt(dicts, message);

				System.out.println("Result is: " + cipher);
			}
//			else if(task == 'd')
//			{
//				plain = d.decryptt(dicts, message);
//			}

//			System.out.println(message);



		}
	}
}