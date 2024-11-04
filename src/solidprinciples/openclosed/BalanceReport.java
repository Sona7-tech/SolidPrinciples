package solidprinciples.openclosed;

public class BalanceReport implements Report{
    @Override
    public String generateReport() {
       return "Balance report: The customer's total balance is 1000 AZN.";
    }
}
