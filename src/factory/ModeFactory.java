package factory;

import model.Mode;

public class ModeFactory {
    public static Mode getMode(String mode) {
        if (mode.equals("heat")) {
            return Mode.HEAT;
        } else {
            return Mode.COOL;
        }
    }
}

