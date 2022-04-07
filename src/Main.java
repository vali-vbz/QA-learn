public class Main {

    public static void main(String[] args) {

        //1
        //System.out.println("Hello \nValentin");

        //2
        int x = 10;
        int y =4;

        x=x+y;
        // System.out.println("2.  "+ x);

        float z;
        z=(float)x/y;

        long y2= 932222222222L;

        /*System.out.println("3.  "+z);

        System.out.println("4. ");
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9 );
        System.out.println(20 + -(float)3*5 / 8 );
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );*/



        //System.out.println(x+ y +" rez diferit: " + x + y);

        //System.out.println("long: "+y2);

        System.out.println("\n"+"Part 2");

        Calculator callc = new Calculator();

        x = 10;
        y=4;

        ///
        // 1.1.
        hello("Valentin");

//        System.out.println("3. model text: ");
//        textModel3();
//
//        System.out.println("5. model text: ");
//        textModel5();
//
        // 1.2.
        System.out.println("1.2.  "+ callc.adunare(x,y));

        // 1.3.
        System.out.println("1.3.  "+callc.impartire(x,y));

        // 1.4.

        // 2.
        System.out.println("2. rez= "+callc.adunare(4,5));
        System.out.println("2. rez= "+callc.scadere(4,5));



        System.out.println("4. media= "+callc.media(4,5,9));

        System.out.println("6. restul impartirii = "+callc.rest(16,9));

        int in_temp=78;
        System.out.println("Temperatura "+in_temp+" Fahrenheit = "+ callc.celsius(in_temp) + " celsius"  );

        int in_inch=17;

        System.out.println("Distanta de "+in_inch+" inch = "+ callc.inchToCm(in_inch) + " cm"  );


        callc.distantaViteza(170,0,0,12);

        /// ----------------
        System.out.println("\n"+"Part LAB 11");

        LogicalOp opp= new LogicalOp();

        int x3=55;
        if (opp.isNumberEven(x3)) {
            System.out.println("Numarul "+x3+" este par!");
        }else
        {
            System.out.println("Numarul "+x3+" este impar!");
        }

        int x2=3;
        opp.verifySwitch(x2);
        x2=6;
        opp.verifySwitch(x2);

        System.out.println("Numarul mai mare este: "+opp.checkBiggerNumber(x2,x3)+" !");

        System.out.println(opp.verifyTextAndNumber("FastTr",4));

        System.out.println(opp.verifyEX6(4));

        System.out.println(opp.verifyEX7(4));

        String name1="Marinica";
        int agex=40;
        if ( opp.isEligibleToVote(agex) ){
            System.out.println("Cetateanul "+name1+" are varsta legala de vot!");
        }
        else{
            System.out.println("Cetateanul "+name1+" nu poate vota!");
        }



    }  //////////////////  end main


//   FUNCTII:::

    public static void hello(String name) {
        System.out.println("Hello \n"+name);
    }


    public static void textModel3(){
        System.out.println("   J    a   v      v   a ");
        System.out.println("   J   a a   v    v   a a ");
        System.out.println("J  J  aaaaa   V V    aaaaa");
        System.out.println(" JJ  a     a   V    a     a");

    }

    public static void textModel5(){
        System.out.println("  +\"\"\"\"\"+  ");
        System.out.println(" [| o o |]      ");
        System.out.println("  |  ^  |       ");
        System.out.println("  | \'_\' |    ");
        System.out.println("  +-----+      ");


    }


}