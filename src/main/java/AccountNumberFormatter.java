import org.apache.commons.lang3.StringUtils;

public class AccountNumberFormatter {

  public String formatAccountNumber(int literalAccountNumber) {

    String accNumber = Integer.toString(literalAccountNumber);

    String result = StringUtils.leftPad(accNumber, 6, "0");

    return StringUtils.right(result, 6);

  }

}
