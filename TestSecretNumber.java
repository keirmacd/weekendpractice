import static org.junit.Assert.assertEquals;

public class TestSecretNumber{

  @Before
  public void before{
    secretNumber = new secretNumber;
    userGuess = new userGuess;

    @Test
    public void TestthatUserhasguess(){
    assertEquals(5, secretNumber.getUserGuess);
    }
    @Test
    public void TestthatUserhasguess(){
    assertEquals(3, secretNumber.getSecretNumber);
    }
  }
}