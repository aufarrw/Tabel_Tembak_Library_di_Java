import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import java.util.Scanner;

class test{
    public interface SharedObject extends Library{
        public double parabol_asin (double a, double b);
    }

    public static void main(String[] args) {
        SharedObject lib = (SharedObject) Native.loadLibrary("ParabolMortar.dll", SharedObject.class);
        Scanner myObj = new Scanner(System.in);
        
        char c = 'y';
        while (c == 'y'){
            System.out.println("Masukkan jarak: ");
            double a = myObj.nextDouble();

            if (a < 100){
                System.out.println("Jarak terlalu dekat dengan mortar");
            }

            else if (a <= 450){
                double b = 67.08204;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 0");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 800){
                double b = 89.44272;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 1");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 1350){
                double b = 116.18951;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 2");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 2600){
                double b = 161.24516;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 3");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 3700){
                double b = 192.35385;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 4");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 4700){
                double b = 216.79484;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 5");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 5600){
                double b = 236.643193;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 6");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 6300){
                double b = 250.99801;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 7");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else if (a <= 6500){
                double b = 254.95098;
                System.out.println("jarak: " + a);
                System.out.println("kecepatan: " + b);
                System.out.println("isian: 8");
                System.out.println("sudut elevasi: " + lib.parabol_asin(a, b));
            }

            else{
                System.out.println("Jarak tidak dapat tercapai");
            }

            System.out.println("membidik lagi?(y/n)");
            c = myObj.next().charAt(0);
            if (c == 'n') {
                break;
            }
            else if (c!='y' && c!='n'){
                System.out.println(c + "tidak terdaftar, harap input 'y' atau 'n'");
                while(c!='y' && c!='n'){
                    System.out.println("membidik lagi?(y/n)");
                    c = myObj.next().charAt(0);
                        if (c == 'n') {
                            break;
                        }
                        else if (c!='y' && c!='n'){
                            System.out.println(c + "tidak terdaftar, harap input 'y' atau 'n'");
                        }
                }
            }
        }
    }
}