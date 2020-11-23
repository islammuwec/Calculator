public class Calculation {
    public static void main(String [] args)
    {
        Calculation objCalc=new Calculation();
        double sum=objCalc.Sum(2.00,3.00);

//        System.out.println("the sum is: "+sum);

    }

    public double Sum(double a, double b)
    {
        return a+b;
    }

    public double Deduct(double a, double b)
    {
        return a-b;
    }
}
