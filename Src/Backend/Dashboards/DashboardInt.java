package Backend.Dashboards;


import Backend.Accounts.AccountInt;
import Backend.Metrics.MetricInt;
import java.util.List;

/**
 * This is an interface for the many user dashboards. The relevant information will be stored here
 * like all of the accounts that a user has. The information needed will be stored in and accessed
 * from a databse.
 */
public interface DashboardInt {

  /**
   * The dashboard gains access to the user's accounts via a call to the user.
   *
   * @return the List of accounts that the users currently holds with us.
   */
  List<AccountInt> userAccounts();

  /**
   * The dashboard returns the list of available metrics. This is information such as performance
   * allocation, and other relevant information. These metrics are again stored within the databse.
   *
   * @return The List of MetricInts that are relevant to this user.
   */
  List<MetricInt> userMetrics();

}
