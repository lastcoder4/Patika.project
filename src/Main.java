import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Turkce notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Muzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik +kimya +turkce +tarih+ muzik);
        double sonuc= toplam / 6.0;
        System.out.print("SONUC : %.2f : " + sonuc);

            }
        }