public class Yonetici extends Calisan{

    private int numberOfResponsiblePeople;

    public Yonetici(String name, String surname, int id, int numberOfResponsiblePeople) {
        super(name, surname, id);
        this.numberOfResponsiblePeople = numberOfResponsiblePeople;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + numberOfResponsiblePeople);
    }

    public void zamYap(int amount) {
        System.out.println(getName() + " çalışanlara " + amount + " kadar zam yapıyor.");
    }

}
