package Backend.Metrics;

import Backend.Accounts.AccountInt;

/**
 * this class represents the overall performance of the account. This is represented as a
 * percentage.
 */
public class AccountPerformanceMetric implements MetricInt {

  private AccountInt account;

  public AccountPerformanceMetric(AccountInt account) {
    this.account = account;
  }

  //TODO add in a call to the database to gain access to relevant data.

}
