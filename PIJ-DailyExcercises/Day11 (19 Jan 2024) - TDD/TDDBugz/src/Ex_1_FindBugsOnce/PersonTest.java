package Ex_1_FindBugsOnce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testGetInitials_NormalName() {
        String input = "Derek Robert Yeast";
        Person p = new Person(input);
        String actual = p.getInitials();
        String expected = "DRY";
        assertEquals(expected, actual);
    }

    @Test
    public void testNameWithMoreSPaces(){
        String name = "George Kort";
        Person p = new Person (name);
        String initials = p.getInitials();
        String expected = "GK";
    }
}