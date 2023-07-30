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
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            if(number.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return "Name not found";
    }
    public String findByName(String name, Map<String, String> contacts) {
        return null;
    }
}
