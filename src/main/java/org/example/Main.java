package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Julia", "+79211254897", contacts);
    }
}