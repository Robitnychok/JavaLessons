package start.lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 6;
        int sum = n1+n2;
        System.out.println(sum);

        int minus = n1 - n2;
        System.out.println(minus);

        float devide = (float) n1/n2;
        System.out.println(devide);

        int ext = n1*n1;
        System.out.println(ext);

        n1++;
        int sum2= n1+n2;
        System.out.println(sum2);

        n2 +=4;
        System.out.println(n2);


        double highM = 1.6;
        int weight = 47;
        double bodyWeight = weight / (highM*highM);
        System.out.println(bodyWeight);
    }
}
