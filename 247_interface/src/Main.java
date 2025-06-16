public class Main {
    public static void main(String[] args) {
        ControllableDevice light = new SmarLight();
        ControllableDevice thermo = new SmartThermostat();

        light.turnOn();
        light.getStatus();

        thermo.turnOn();
        thermo.getStatus();
        ((SmartThermostat) thermo).setTemperature(20.0);
    }
}