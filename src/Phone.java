import java.util.Scanner;

public class Phone extends Technique{

    private String phoneNumber;

    public Phone(String name, String brand, String version, String phoneNumber) {
        super(name, brand, version);
        this.phoneNumber = phoneNumber;
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
        return super.toString() + ", Номер телефона: " + phoneNumber;
    }
}
