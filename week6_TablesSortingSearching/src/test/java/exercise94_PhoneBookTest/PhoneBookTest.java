package exercise94_PhoneBookTest;


import exercise94_PhoneBook.Phonebook;
import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void testSearchNumber_WasFound() {
        //Given
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        //When
        String number = phonebook.searchNumber("Pekka Mikkola");

        //Then
        Assert.assertEquals("040-123123", number);
    }

    @Test
    public void testSearchNumber_WasNotFound() {
        //Given
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");

        //When
        String number = phonebook.searchNumber("Martti Tienari");

        //Then
        Assert.assertEquals("number not known", number);
    }
}
