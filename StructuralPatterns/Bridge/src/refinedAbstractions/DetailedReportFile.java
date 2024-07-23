package refinedAbstractions;

import implementors.ReportImplementor;

public class DetailedReportFile extends ReportFile {
    public DetailedReportFile(ReportImplementor reportImplementor) {
        super(reportImplementor);
    }
    public DetailedReportFile setDateTimeReport(String dateTimeReport){
        this.reportImplementor.setHeader( "Date:" + dateTimeReport + this.reportImplementor.getHeader());
        return this;
    }
}
