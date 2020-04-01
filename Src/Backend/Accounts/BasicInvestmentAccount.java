package Backend.Accounts;

import Backend.Metrics.MetricInt;
import java.util.List;

/**
 * this is a class for a very basic investment account. This account will be allocated
 * based off of the user's data.
 */
public class BasicInvestmentAccount implements AccountInt {

  private List<MetricInt> metrics;

  //TODO should the account "know" who owns it?
  public BasicInvestmentAccount() {

  }

}
