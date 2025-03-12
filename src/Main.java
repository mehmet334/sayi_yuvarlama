import java.util.Scanner;
//Sayı Yuvarlama (OPSİYONEL)
//Kullanıcının girdiği ondalıklı bir sayıyı aşağı, yukarı ve en yakın tam sayıya yuvarlayarak ekrana yazdıran kodu yazma
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double ondalikli_sayi;
        while (true){
            System.out.println("Ondalıklı sayı giriniz: ");
            if(scanner.hasNextDouble()){
                ondalikli_sayi= scanner.nextDouble();
                System.out.println("---------Geçerli----------");
                int asagiyuvarla=(int)Math.floor(ondalikli_sayi);
                int yukariyuvarla=(int)Math.ceil(ondalikli_sayi);
                int enyakintamsayi=(int)Math.round(ondalikli_sayi);
                System.out.println("Aşağı Yuvarlama : "+ asagiyuvarla);
                System.out.println("Yukarı Yuvarlama : " + yukariyuvarla);
                System.out.println("En Yakın Tam Sayı : " + enyakintamsayi);
                break;
            }else {
                System.out.println("Hata : Lütfen ondalıklı sayı giriniz!");
                scanner.next();
            }
        }
    }
}