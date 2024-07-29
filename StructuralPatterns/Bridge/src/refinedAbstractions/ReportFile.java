package refinedAbstractions;

import abstractions.Report;
import implementors.ReportImplementor;

public class ReportFile extends Report {
    private String header;
    private String body;
    private String footer;
    private String assigner;
    public ReportFile(ReportImplementor reportImplementor,
                      String header, String body, String footer){
        super(reportImplementor);
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.assigner = "";
    }

    @Override
    public String generate() {
        this.reportImplementor.clearReport();
        this.reportImplementor.setHeader(this.reportImplementor.getHeader() + this.header);
        this.reportImplementor.setBodyContent(this.reportImplementor.getBodyContent() + this.body);
        this.reportImplementor.setFooter(this.reportImplementor.getFooter() + this.footer);
        this.reportImplementor.setAssigning(this.assigner.isEmpty() ? "____________________________" : this.assigner);

        return this.reportImplementor.getReport();
    }
    @Override
    public Report assign(String assigner) {
        this.assigner = assigner;
        return this;
    }
}
