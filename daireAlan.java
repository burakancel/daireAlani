import java.util.Scanner;

public class daireAlan {

    public static void main(String[] args) {

        int r ,a;
        double alan,pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("R giriniz :");
        r=input.nextInt();
        System.out.print("A açısı giriniz : ");
        a=input.nextInt();


        alan=  (pi * (r*r) * a) / 360;
        alan = (a>361) ?  0 : alan;
        System.out.println("Alan : "+alan);



    }

}
