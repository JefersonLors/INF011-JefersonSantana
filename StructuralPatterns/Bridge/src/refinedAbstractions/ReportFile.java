package refinedAbstractions;

import abstractions.Report;
import implementors.ReportImplementor;

public class ReportFile extends Report {
    public ReportFile(ReportImplementor reportImplementor){
        super(reportImplementor);
    }
    @Override
    public Report insertHead(String content) {
        this.reportImplementor.setHeader(this.reportImplementor.getHeader() + content);
        return this;
    }

    @Override
    public Report insertFooter(String content) {
        this.reportImplementor.setFooter(this.reportImplementor.getFooter() + content);
        return this;
    }

    @Override
    public Report insertBodyContent(String content) {
        this.reportImplementor.setBodyContent(this.reportImplementor.getBodyContent() + content);
        return this;
    }

    @Override
    public void clearContent() {
        this.reportImplementor.clearReport();
    }

    @Override
    public Report assign(String assigner) {
        String lastAssigner = this.reportImplementor.getAssigning();
        lastAssigner += lastAssigner.isEmpty() ? "" : ", ";
        this.reportImplementor.setAssigning(lastAssigner + assigner);
        return this;
    }

    @Override
    public String get() {
        return this.reportImplementor.getReport();
    }
}
