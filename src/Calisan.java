public class Calisan {

    private String name;
    private String surname;
    private int id;

    public void bilgileriGoster() {
        System.out.println("Çalışan Bilgileri...");
        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + surname);
        System.out.println("ID: " + id);
    }

    public Calisan(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
