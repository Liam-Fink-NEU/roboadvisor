package Backend;

import Backend.Accounts.AccountInt;
import java.util.List;

/**
 * This is an interface for the User. The users information is stored in a database. The user will
 * determine what is displayed in the dashboard.
 */
public interface UserInt {

  /**
   * This function is called to find the AccountInts that the user holds with us. The information
   * that this returns is gained from our database.
   *
   * @return The List of AccountInts that this user holds.
   */
  List<AccountInt> accounts();

}
