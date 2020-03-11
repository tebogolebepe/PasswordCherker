import org.junit.Assert;
import org.junit.Test;



public class PasswordCheckTest {

@Test
 public void PasswordIsOk() {
    PasswordCheck pcheck = new PasswordCheck();
     boolean expected = true;
    //passord = " tebogo@201F";
    Assert.assertEquals(expected,pcheck.PasswordIsOk("Tebogolebepe@33"));

}

}