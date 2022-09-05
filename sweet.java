import java.util.Scanner;
public class sweet{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pilih nomor yg di inginkan");
        System.out.println("1. lihat hasil mu");
        int i = input.nextInt();
        switch(i){
              case 1:
              System.out.println("masukan nilai kamu");
              int b = input.nextInt();
              if(b<60) {
                System.out.println("kamu gagal");
              }else if(b>100) {
                System.out.println("eror");
              }
              if(b>60) {
                System.out.println("kamu lulus");
              }  
        }
    }
}