

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

/**
 * Created by ezo on 17-Sep-16.
 */
public class WelcomeMessageTest {
    @org.junit.Test
    public void setPartOfDay() throws Exception {
        WelcomeMessage test = new WelcomeMessage();
        assertThat(test.setPartOfDay(), isA(String.class));
    }

    @org.junit.Test
    public void setMessage() throws Exception {
        WelcomeMessage test = new WelcomeMessage();
        String text = "Hello bro!";
        assertNotEquals(text, test.setMessage());
    }

    @org.junit.Test
    public void setTime() throws Exception {
        WelcomeMessage test = new WelcomeMessage();
        String text = new SimpleDateFormat("HH:mm").format(new Date());
        assertEquals(text,test.setTime());
    }



}