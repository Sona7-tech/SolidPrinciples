package solidprinciples.openclosed;

public class ReportService {
    public void printReport(Report report) {
        System.out.println(report.generateReport());
    }

}
