public class Yazilimci extends Calisan {

    private String languages;

    public Yazilimci(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
    }

    public void formatAt(String operatingSystem) {
        System.out.println(getName() + " " + operatingSystem + " 'ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller: " + languages);
    }



}
