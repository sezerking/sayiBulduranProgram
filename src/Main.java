import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,sayac=0;
        Scanner scn= new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        k=scn.nextInt();

        int sum=0;
        for (int i=0; i<=k;i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
                sayac++;
                sum+=i;
            }

        }

        System.out.println("Ortalama: "+sum/sayac);
    }
}
