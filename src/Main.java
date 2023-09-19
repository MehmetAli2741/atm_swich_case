import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right = 3;
        int balance = 1500;
        int select;
        int total;

        while (right > 0){
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if ((userName.equals("mehmet")) && (password.equals("ali123"))) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("Lütfen Yapmak İstediginiz İşlemi Seçiniz.");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediginiz Miktarı Giriniz: ");
                            int deposited = input.nextInt();
                            balance += deposited;
                            System.out.println("Bakiyeniz: " + balance + "TL");
                            break;

                        case 2:
                            System.out.print("Çekmek İstediginiz Miktarı Giriniz: ");
                            int requested = input.nextInt();
                            if (balance >= requested) {
                                balance -= requested;
                                System.out.println("Bakiyeniz: " + balance + "TL");
                            } else {
                                System.out.println("Yetersiz Bakiye\nBakiyeniz: " + balance + "TL");
                            }break;

                        case 3:
                            System.out.println("Bakiyeniz: "+balance +"TL");
                            break;

                        case 4:
                            System.out.println("Çıkış Yapılıyor...");
                            break;
                    }

                }while (select != 4);
                break;

            }else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre.Tekrar Deneyiniz");
                if (right == 0) {
                    System.out.println("Hesbınız Bloke Olmuştur Lütfen Bankanız İle İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }

    }
}