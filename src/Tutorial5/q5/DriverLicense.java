package Tutorial5.q5;

public class DriverLicense extends Card{
    private int expirationYear;

    @Override
    public boolean isExpired() {
        return false;
    }
}
