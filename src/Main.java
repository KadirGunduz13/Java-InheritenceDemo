import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");

        String islemler = "İslemler...\n"
                            +"1. Yazılımcı İşlemleri\n"
                            +"2. Yönetici İşlemleri\n"
                            +"Çıkış için q'ya basınız";

        System.out.println("**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");

        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = input.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {

                System.out.println("Yazılımcı İşlemlerine Hoşgeldiniz...");
                
                Yazilimci yazilimci = new Yazilimci("Kadir","Gündüz",13,"Java, Python, C#");
                String yazilimciIslemler = "1. Format At\n"
                                        +"2. Bilgileri Göster\n"
                                        +"Çıkış için q'ya basınız...";

                System.out.println("**************************************");
                System.out.println(yazilimciIslemler);
                System.out.println("**************************************");

                while (true) {

                    System.out.println("İşlemi Seçiniz : ");
                    String yazilimciIslem = input.nextLine();
                    
                    if (yazilimciIslem.equals("q")) {
                        System.out.println("Yazılımcı İşelemlerinden Çıkılıyor...");
                        break;
                    } else if (yazilimciIslem.equals("1")) {
                        System.out.println("İşletim sistemi giriniz : ");
                        String isletimSistemi = input.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    } else if (yazilimciIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz İşlem!..");
                    }

                }

            } else if (islem.equals("2")) {

                System.out.println("Yönetici İşlemlerine Hoşgeldiniz...");

                Yonetici yonetici = new Yonetici("Azad","Bedir",65,10);
                String yoneticiIslemler = "1. Zam Yap\n"
                        +"2. Bilgileri Göster\n"
                        +"Çıkış için q'ya basınız...";

                System.out.println("**************************************");
                System.out.println(yoneticiIslemler);
                System.out.println("**************************************");

                while (true) {

                    System.out.println("İşlemi Seçiniz : ");
                    String yoneticiIslem = input.nextLine();


                    if (yoneticiIslem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    } else if (yoneticiIslem.equals("1")) {

                        System.out.println("Zam miktarı : ");
                        int miktar = input.nextInt();
                        input.nextLine();
                        yonetici.zamYap(miktar);
                    } else if (yoneticiIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz İşlem!..");
                    }

                }


            } else {
                System.out.println("Geçersiz İşlem!..");
            }
        }

    }
}