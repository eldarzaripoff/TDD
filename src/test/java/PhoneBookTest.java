import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookTest {
    @Test
    public void addTest() {
        //Arrange
        String name = "Archi";
        String number = "+79322154695";
        Map<String, String> map = new HashMap<>();
        map.put("Archi", "+79322154695");
        PhoneBook phoneBook = new PhoneBook();

        //Act
        int expected = phoneBook.add(name, number, map);
        if (!map.containsKey(name)) {
            map.put(name, number);
        }
        int result = map.size();

        //Assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void findByNumberTest() {
        //Arrange
        String name = "Michael";
        String number = "+9631257564";
        Map<String, String> map = new HashMap<>();
        map.put(name, number);
        PhoneBook phoneBook = new PhoneBook();

        //Act
        String expected = phoneBook.findByNumber(number, map);
        String result = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (number.equals(entry.getValue())) {
                result = entry.getKey();
            }
        }

        //Assert
        Assertions.assertEquals(expected, result);
    }
}
