package task1.ElectricalAppliancesExceptions;

import java.lang.Exception;

public class PowerException extends Exception {
    public PowerException(String errorMessage) {
        super(errorMessage);
    }
}