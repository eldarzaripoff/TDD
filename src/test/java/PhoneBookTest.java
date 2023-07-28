import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookTest {
    @Test
    public void AddTest() {
        //Arrange
        String name = "Archi";
        String number = "+79322154695";
        Map<String, String> map = new HashMap<>();
        PhoneBook phoneBookTest = Mockito.mock(PhoneBook.class);

        //Act
        int expercted = phoneBookTest.add(name, number, map);
        if (!map.containsKey(name)) {
            map.put(name, number);
        }
        int result = map.size();

        //Assert
        Assertions.assertEquals(expercted, result);



    }
}
