import java.util.Scanner;

public class Computer extends Technique{
    private String operatingSystem;

    public Computer(String name, String brand, String version, String operatingSystem) {
        super(name, brand, version);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String turnOnOff() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль для включения " + getName() + ": ");
        String password = scanner.nextLine();
        if (!password.equals("1234")) {
            return "Неверный пароль для " + getName() + "!";
        }
        return super.turnOnOff();
    }

    @Override
    public String toString() {
        return super.toString() + ", Операционная система: " + operatingSystem;
    }
}
