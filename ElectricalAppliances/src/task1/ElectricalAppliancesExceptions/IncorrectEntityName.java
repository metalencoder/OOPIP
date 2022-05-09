package task1.ElectricalAppliancesExceptions;
import java.lang.Exception;

public class IncorrectEntityName extends Exception {
    public IncorrectEntityName(String errorMessage) {
     super(errorMessage);
    }
}

