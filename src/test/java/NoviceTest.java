import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

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

   @Test
   void squareTestForNegativeNumber(){
      // GIVEN
      int n = -15;

      // WHEN
      int actual = Novice.square(n);

      // THEN
      assertEquals(225, actual);
   }

   @Test
   void squareTestForZero(){
      // GIVEN
      int n = 0;

      // WHEN
      int actual = Novice.square(n);

      // THEN
      assertEquals(0, actual);
   }

   @Test
   void sayHelloTest(){
      // GIVEN

      String Name = "Joon";



      // WHEN
      String actual = Novice.sayHello(Name);

      // THEN
      assertEquals("Hallo, " + Name + ", wie geht es dir?", actual);
   }


}
