package com.practicalunittesting;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Client {
    private final List<Phone> phones = new ArrayList<Phone>();
    
    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public boolean hasMobile() {
        for (Phone phone : phones) {
            if (phone.isMobile()) {
                return true;
            }
        }
        return false;
    }
}
