package solidprinciples.openclosed;

public class Main {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();

        Report balanceReport = new BalanceReport();
        Report incomeReport = new IncomeReport();

        reportService.printReport(balanceReport);
        reportService.printReport(incomeReport);
    }
}
