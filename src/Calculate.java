
public class Calculate {
	
	public static int Compare(int firstNum, int secondNum) {
		int Result;
		if ((firstNum & secondNum) > 21 ) {
			return Result = 0;
		}
		else if(firstNum > 21 && secondNum <= 21) {
			return secondNum;
		}
		else if(secondNum > 21 && firstNum <= 21) {
			return firstNum;
		}
		else if(firstNum > secondNum) {
			return firstNum;
		}
		return secondNum;


	}
	
}
