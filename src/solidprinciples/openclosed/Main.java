package solidprinciples.openclosed;

public class Main {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();

        Report balanceReport = new BalanceReport();
        Report incomeReport = new IncomeReport();

        reportService.printReport(balanceReport);
        reportService.printReport(incomeReport);
    }

    public class Main {

    public void calculate(Report report) {

        if (report instanceof IncomeReport) {
            IncomeReport income = (IncomeReport) report;
        } else if (report instanceof BalanceReport) {
            BalanceReport balance = (BalanceReport) report;
        }
    }
}
}
