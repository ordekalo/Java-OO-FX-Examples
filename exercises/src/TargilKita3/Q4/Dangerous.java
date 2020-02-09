package TargilKita3.Q4;

import java.util.GregorianCalendar;

public interface Dangerous {
    int YEAR = new GregorianCalendar().get(GregorianCalendar.YEAR);

    boolean isDangerous();
}
