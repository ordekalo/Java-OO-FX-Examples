package TargilKita3.Q3;

import java.util.GregorianCalendar;

public interface Dangerous {
    int YEAR = new GregorianCalendar().get(GregorianCalendar.YEAR);

    boolean isDangerous();
}
