public class Technique {
    private String name;
    private String brand;
    private String version;


    public Technique(String name, String brand, String version) {
        this.name = name;
        this.brand = brand;
        this.version = version;
    }

    public String getName() {
        return name;
    }


    public String turnOnOff() {
        return name+ " включен";
    }

    @Override
    public String toString() {
        return "Название: " + name + ",  Бренд: " + brand + ",  Версия: " + version;
    }
}
