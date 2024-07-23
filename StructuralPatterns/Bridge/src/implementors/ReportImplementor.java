package implementors;

public interface ReportImplementor {
    ReportImplementor setHeader(String content);
    ReportImplementor setFooter(String content);
    ReportImplementor setBodyContent(String content);
    ReportImplementor setAssigning(String assigner);
    void clearReport();
    String getHeader();
    String getFooter();
    String getBodyContent();
    String getAssigning();
    String getReportType();
    String getReport();
}
