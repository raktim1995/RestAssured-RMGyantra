package GenericLibrary;

import java.util.Random;

public class JavaUtility {
	
	
	/**
	 * This method is used to get Random number
	 * @author RAKTIM
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran =new Random();
		int random = ran.nextInt(10000);
		return random;
	}

}
