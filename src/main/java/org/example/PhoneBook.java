package org.example;

import java.util.Map;

public class PhoneBook {
    public int add(String name, String number, Map<String, String> contacts) {
        if (contacts.containsKey(name)) {
            return contacts.size();
        }
        contacts.put(name, number);
        return contacts.size();
    }
    public String findByNumber(String number, Map<String, String> contacts) {
        return null;
    }
}
