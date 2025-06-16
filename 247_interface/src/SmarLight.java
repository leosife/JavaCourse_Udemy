public class SmarLight implements ControllableDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Light is turned ON!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Light is turned OFF!");

    }

    @Override
    public void getStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("Smart Light status: " + status);
    }
}
