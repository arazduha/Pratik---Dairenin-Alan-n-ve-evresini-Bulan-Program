import java.util.Scanner;
public class test {
    public static void main(String[] args) {
      //değişkenler tanımlandı
      double r, a, pi = 3.14, alanfor, cevfor, dairefor;

      Scanner inp = new Scanner(System.in);
      //değer gir - yarıçap
      System.out.print("yaricap gir= ");
      r = inp.nextInt();

      System.out.print("merkez aci gir= ");
      a = inp.nextInt();
      // formüller
      alanfor = pi * r * r;
      cevfor = 2 * pi * r;
      dairefor = (pi * (r*r) * a) / 360;

      System.out.println("alan= " + alanfor);
      System.out.println("cevre= " + cevfor);
      System.out.println("daire diliminin alani= " + dairefor);
    }
}
