package abstractions;

import implementors.ReportImplementor;

public abstract class Report {
    protected ReportImplementor reportImplementor;

    protected Report(ReportImplementor reportImplementor){
        this.reportImplementor = reportImplementor;
    }

    public abstract Report insertHead(String content);
    public abstract Report insertFooter(String content);
    public abstract Report insertBodyContent(String content);
    public abstract void clearContent();
    public abstract Report assign(String assigner);
    public abstract String get();
}
