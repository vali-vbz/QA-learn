public class Lab3 {

    public static void main(String[] args) {
        String text = "FastTrack";
        int number = 6;

        System.out.println(verifyTextAndNumber(text,number));


        //ex3 slides: Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
        number= 1;
        System.out.println("Verificare ex3: " + ex3(number));

        //ex5 slides: Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”



    }
//.......................

    public static int ex3(int x) {
        if (x>=2  && x<8){
            return x;
        } else {
            return 0;
        }
    }

    public static String ex5(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

        public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public static String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

}
