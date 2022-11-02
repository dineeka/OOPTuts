package Tutorial5.q5;

public class Passport extends Card{
    String birthLocation;
    private int expirationYear;

    @Override
    public boolean isExpired() {
        return false;
    }
}
