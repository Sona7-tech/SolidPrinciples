package solidprinciples.openclosed;

public class IncomeReport implements Report{
    @Override
    public String generateReport() {
        return "Income report: The customer's monthly income is 200 AZN.";
    }
}
