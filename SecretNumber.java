public class SecretNumber{
int secretNumber;
int userGuess;
public SecretNumber(){
  secretNumber = new secretNumber(2);
  userGuess = new userGuess(5);
}
  public void getUserGuess(){
return userGuess;
  }
  public void getSecretNumber(){
    return secretNumber;
  }
  public void setSecretNumber(int secretNumber){
    this.secretNumber = secretNumber;
  }


public String GuessCheck(){
  if userGuess == secretNumber{
    return "You go it!";
  }else{
    if userGuess > secretNumber{
      return "too high!";
    }

  }else{
    if userGuess < secretNumber{
      return "Too low";
    }
  }
  public void secretNumberIsEven{
    if secretNumber /2;
    return "SecretNumber is even";
  }else{
    return "secretNumber is odd";
  }
}


}