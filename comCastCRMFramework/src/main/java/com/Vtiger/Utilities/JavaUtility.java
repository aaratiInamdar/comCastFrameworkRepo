package com.Vtiger.Utilities;

import java.util.Random;

public class JavaUtility {

	
	public int randomNumber(int upperLimit )
	{
		Random random=new Random();
		int randomnumber = random.nextInt(upperLimit);
		return randomnumber;
	}
}
