package abstractions;

import implementors.ReportImplementor;

import java.time.LocalDateTime;

public abstract class DetailedReport extends Report {
    protected DetailedReport(ReportImplementor reportImplementor) {
        super(reportImplementor);
    }
    public abstract DetailedReport setDateTimeReport(String dateTimeReport);
}
