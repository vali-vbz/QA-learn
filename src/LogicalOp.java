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
