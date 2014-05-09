
public class Factorials
{
	public static void main(String[] args)
	{
		int factorial = GetInfo.getSlider("Enter the factorial!" , 0, 20);
		
		int lastNum = factorial;
		
		if(lastNum == 0) lastNum = 1;
		
		while(factorial > 1){
			lastNum *= (factorial-=1);
		}
		
		GetInfo.showMessage( "The answer to you factorial is : " + lastNum);
	}
}
