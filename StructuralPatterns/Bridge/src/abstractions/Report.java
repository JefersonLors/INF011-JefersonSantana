package abstractions;

import implementors.ReportImplementor;

public abstract class Report {
    protected ReportImplementor reportImplementor;

    protected Report(ReportImplementor reportImplementor){
        this.reportImplementor = reportImplementor;
    }
    public abstract String generate();
    public abstract Report assign(String assigner);
}
