package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            if (name.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "Number not found";
    }
    public List<String> printAllNames(Map<String, String> contacts) {
        return new ArrayList<>(new TreeMap<>(contacts).keySet());
    }
}
