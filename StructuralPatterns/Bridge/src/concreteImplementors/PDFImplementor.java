package concreteImplementors;

import implementors.ReportImplementor;

public class PDFImplementor implements ReportImplementor {
    private StringBuilder document;
    private String headerContent = "";
    private String bodyContent = "";
    private String footerContent = "";
    private String assigner = "";
    public PDFImplementor(){}
    @Override
    public ReportImplementor setHeader(String content) {
        this.headerContent = content;
        return this;
    }

    @Override
    public ReportImplementor setFooter(String content) {
        this.footerContent = content;
        return this;
    }

    @Override
    public ReportImplementor setBodyContent(String content) {
        this.bodyContent = content;
        return this;
    }

    @Override
    public ReportImplementor setAssigning(String assigner) {
        this.assigner = assigner;
        return this;
    }

    @Override
    public void clearReport() {
        this.bodyContent = "";
        this.headerContent = "";
        this.footerContent = "";
        this.assigner = "";
    }

    @Override
    public String getHeader() {
        return this.headerContent;
    }

    @Override
    public String getFooter() {
        return this.footerContent;
    }

    @Override
    public String getBodyContent() {
        return this.bodyContent;
    }

    @Override
    public String getAssigning() {
        return this.assigner;
    }

    @Override
    public String getReportType() {
        return "PDF Report";
    }

    @Override
    public String getReport() {
        this.document = new StringBuilder();
        document.append("<-------------------------------------| " + this.getReportType() + " |------------------------------------->\n");
        document.append(this.headerContent + "\n");

        document.append(this.bodyContent + "\n");

        document.append(this.footerContent + "\n");
        document.append("\n\t\t\t\t\t\t\t\tAssigned by: " + this.assigner + "\n");
        document.append("|----------------------------------------------------------------------------------------|\n");
        return document.toString();
    }
}
