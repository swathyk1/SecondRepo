package example;

public class Bank {

	
	private int pin;  // user-entered pin

    // Method to set pin from user
    public void setPin(int pin) {
        this.pin = pin;
    }
    

    // Method to validate pin
    public boolean validatePin() {
        // valid pins
        int validPins[] = {1001, 1234, 1212};
        for (int validPin : validPins) {
            if (pin == validPin) {
                return true;
            }
        }
        return false;
    }

	
}
