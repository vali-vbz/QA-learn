public class Calculator {



    public  int adunare(int a, int b) {
    	int result;
        result=a+b;
        return result;
  	}

public  int scadere(int a, int b) {
    	int result;
        result=a+b;
        return result;
  	}

public  int inmultire(int a, int b) {
    	int result;
        result=a+b;
        return result;
  	}
    
public  float impartire(int a, int b) {
    	float result;
        result=(float)a/b;
        return result;
  	}

// media 3 numere
public float media(int a, int b, int c) {
    return (float)(a+b+c)/3;
}

// sa returneze restul impartirii a doua numere
public int rest(int a, int b) {
	return a%b;

}

// sa returneze temperatura in Celsius
public float celsius(float gradF)
{
	return (float)5/9 * (gradF -32);


}

// inch to cm
public double inchToCm(double num)
{
	return (double)num*2.54;
}


public  void distantaViteza(float dist, int ore, int min, int sec){
double totalSec, vitezaSec, vitezaKM, vitezaMILE;
totalSec=ore*60*60+ min*60+ sec;

vitezaSec=dist/totalSec;
vitezaKM= (dist/1000)/(totalSec/(60*60));
vitezaMILE= (double)vitezaKM /1.609;

System.out.println("Viteza in metri/sec = "+ vitezaSec);

System.out.println("Viteza in KM/h = "+ vitezaKM);

System.out.println("Viteza in MILE/h = "+ vitezaMILE);

}




}