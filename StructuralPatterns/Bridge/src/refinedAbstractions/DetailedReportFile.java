package refinedAbstractions;

import implementors.ReportImplementor;

public class DetailedReportFile extends ReportFile {
    public DetailedReportFile(ReportImplementor reportImplementor,
                              String header, String body, String footer) {
        super(reportImplementor, header, body, footer);
    }
    public DetailedReportFile setDateTimeReport(String dateTimeReport){
        this.reportImplementor.setHeader( "Date:" + dateTimeReport + this.reportImplementor.getHeader());
        return this;
    }
}
