package concreteImplementors;

import implementors.ReportImplementor;

public class HTMLImplementor implements ReportImplementor {
    private StringBuilder document;
    private String headerContent = "";
    private String bodyContent = "";
    private String footerContent = "";
    private String assigner = "unsigned";
    public HTMLImplementor(){}
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
        return "HTML Report";
    }

    @Override
    public String getReport() {
        document = new StringBuilder();
        document.append("<html>\n");
        document.append("\t<head>\n");
        document.append("\t\t<title>\n");
        document.append("\t\t\t" + this.getHeader());
        document.append("\t\t</title>\n");
        document.append("\t</head>\n");
        document.append("\t<body>\n");
        document.append("\t\t" + this.getBodyContent());
        document.append("\t</body>\n");
        document.append("\t<footer> ");
        document.append("\t\t" + "Assigned by:" + this.getAssigning());
        document.append("\t</footer>\n");
        document.append("</html>\n");
        return document.toString();
    }

}
