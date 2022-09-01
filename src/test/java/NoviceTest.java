import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoviceTest {

   @Test
   void whatIsYourNameTest(){
      // GIVEN
      String firstname = "Hunjoon";
      String lastname = "Rhee";

      // WHEN
      String actual = Novice.whatIsYourName(firstname, lastname);

      // THEN
      assertEquals("Hunjoon Rhee", actual);
   }

}
