public class SmartWatch extends Technique {
    private boolean isWaterResistant;

    public SmartWatch(String name, String brand, String version, boolean isWaterResistant) {
        super(name, brand, version);
        this.isWaterResistant = isWaterResistant;
    }

    @Override
    public String turnOnOff() {
        return super.turnOnOff();
    }

    @Override
    public String toString() {
        return super.toString() + ", Водостойкость: " + (isWaterResistant ? "Да" : "Нет");
    }

}
