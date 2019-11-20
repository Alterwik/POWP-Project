package car.exceptions;

public class CarTypeNotFoundException extends RuntimeException {
    public CarTypeNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}