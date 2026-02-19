import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = StringUtils.reverseString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // O EvoSuite força o erro de NullPointerException
      try { 
        StringUtils.reverseString((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         // Exceção capturada com sucesso pela ferramenta
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = StringUtils.isPalindrome("A man a plan a canal Panama");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = StringUtils.countVowels("EvoSuite");
      assertEquals(4, int0);
  }
}
