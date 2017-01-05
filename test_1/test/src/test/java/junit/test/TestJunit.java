package junit.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   App messageUtil = new App(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
   @Test
   public void testLength(){
	   assertEquals(message.length(), messageUtil.printMessage().length());
   }
}