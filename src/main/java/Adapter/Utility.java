package Adapter;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class Utility {

    public static Vector copy(Vector<Copyable> vector) {

        Vector<Copyable> newVector = new Vector<Copyable>();
        Enumeration elements = vector.elements();

        while (elements.hasMoreElements()) {
            Copyable e = (Copyable) elements.nextElement();

            if (e.isCopyable()) {
                newVector.add(e);
            }
        }

        return newVector;
    }

}
