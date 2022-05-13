import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p;
    @BeforeEach
    void setUp() {
        p = new Person();
    }

    @Test
    void setDni() {

    }

    @Test
    void setMail() {
        p.setMail("asdadsa");
        assertEquals("", p.getMail());

        p.setMail("paco@gmail.com");
        assertEquals("paco@gmail.com", p.getMail());

        p.setMail(null);
        assertEquals("", p.getMail());
    }
}