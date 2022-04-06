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

        /*System.out.println("3.  "+z);

        System.out.println("4. ");
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9 );
        System.out.println(20 + -(float)3*5 / 8 );
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );*/

        long y2= 932222222222L;

        //System.out.println(x+ y +" rez diferit: " + x + y);

        //System.out.println("long: "+y2);

        System.out.println("\n"+"Part 2");

        Calculator callc = new Calculator();

        x = 10;
        y=4;

        ///
        // 1.1.
        hello("Valentin");

        // 1.2.
        System.out.println("1.2.  "+ callc.adunare(x,y));

        // 1.3.
        System.out.println("1.3.  "+callc.impartire(x,y));

        // 1.4.

        // 2.
        System.out.println("2. rez= "+callc.adunare(4,5));
        System.out.println("2. rez= "+callc.scadere(4,5));

        System.out.println("3. model text: ");
        textModel3();

        System.out.println("5. model text: ");
        textModel5();

        System.out.println("4. media= "+callc.media(4,5,9));

        System.out.println("6. restul impartirii = "+callc.rest(16,9));

        int in_temp=78;
        System.out.println("Temperatura "+in_temp+" Fahrenheit = "+ callc.celsius(in_temp) + " celsius"  );

        int in_inch=17;

        System.out.println("Distanta de "+in_inch+" inch = "+ callc.inchToCm(in_inch) + " cm"  );


        callc.distantaViteza(170,0,0,12);

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