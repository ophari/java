import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     boolean ulang = true;
            while(ulang){
                            System.out.println("menu makanan");
                            System.out.println("------------------------------------------------------");
                            System.out.println("NO      NAMA            HARGA");
                            System.out.println("1.      SIOMAY          RP 5000,00");
                            System.out.println("2.      BATAGOR         RP 7000,00");
                            System.out.println("3.      BAKSO           RP 8000,00");
                            System.out.println("masukan nomor pesanan anda ");
                            String pilihan = input.next();
                            String balik;
                            
                                switch(pilihan){
                                    case "1":
                                    System.out.println("pilihan anda nomo pesanan anda 1 adalah Siomay");
                                    System.out.println("apakah anda mau melanjutkan y/t");
                                    String a = input.next();
                                    if(a.equalsIgnoreCase("y")){
                                        System.out.println("siomay harganya 5000,00");
                                        System.out.println("masukan uang cash");
                                        Double duit = input.nextDouble();
                                        Double kalkulator = duit - 5000.00;
                                        System.out.println(kalkulator);
                                        System.out.println("terimakasih");
                                        break;
                                    }
                                } 
                                System.out.println("melanjutkan atau tidak y/t");
                                pilihan = input.next();

                                ulang = !pilihan.equalsIgnoreCase("t");

                        }
    }
}
