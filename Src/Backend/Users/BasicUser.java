package Backend.Users;

import Backend.Accounts.AccountInt;
import java.util.List;

public class BasicUser implements UserInt {

  private String firstName;
  private String lastName;
  private List<AccountInt> accounts;

  public BasicUser(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    //TODO include a method of adding this user to a database and creading a unique id.
  }

  @Override
  public List<AccountInt> accounts() {
    return accounts;
  }

  //This method gets this users accounts from the database.
  private void getAccounts() {

  }
}
