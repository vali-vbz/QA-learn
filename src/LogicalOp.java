public class LogicalOp {

int s=3;

int checkBiggerNumber(int num1, int num2){
	if (num1<num2) {
		return num2;
	}
	else {
		return num1;
	}
}

    public  String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return ""+ number + text;
        } else {
            return "";
        }
    }

	public  String verifyEX6( int number){
		if (number>8 || number == 6) {
			return  "The amount of snow this winter was(cm): " + number;
		} else  {
			return "The forecast snow is(cm): " + number;
		}
	}
	public  String verifyEX7( int number){
		if (number>3 && number != 4) {
			return  "The number is greater than 3 and not equal to 4";
		} else if (number == 4)  {
			return "The number is equal to 4";
		} else if (number < 3)  {
			return "The number is lower than 3";
		} else {
			return "";
		}
	}

	public  void verifySwitch(int number){
		switch(number) {
			case 1:
				System.out.println("Numarul primit este 1");
				break;
			case 2:
				System.out.println("Numarul primit este 2");
				break;
			case 3:
				System.out.println("Numarul primit este 3");
				break;
			case 4:
				System.out.println("Numarul primit este 4");
				break;

			default:
				System.out.println("Numarul primit este bine primit");;
		}
	}

// numar par-impar
boolean isNumberEven(int x){
	if (x%2==0){
		return true; // par
	} 
	else {
		return false; //impar
	}
}


boolean isEligibleToVote(int age){
	if (age>=18 ) {
		return true; 
	}
	else {
		return false;
	}
}


int max3(int num1, int num2, int num3){
	int maxNum;
	
	if (num1 < num2 ) {
		maxNum= num2;
		if (num2 < num3 ) {
			maxNum= num3;
		} else{
			maxNum= num2;
		}
	}
	else if (num1<num3){
		maxNum=num3;
		if (num2 < num3 ) {
			maxNum= num3;
		} else{
			maxNum= num2;
		}
	}
	else {
		maxNum=num1;
	}

	return maxNum;
}


}
