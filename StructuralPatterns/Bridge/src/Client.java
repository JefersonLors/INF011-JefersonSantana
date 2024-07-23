import concreteImplementors.HTMLImplementor;
import concreteImplementors.PDFImplementor;
import implementors.ReportImplementor;
import refinedAbstractions.DetailedReportFile;
import refinedAbstractions.ReportFile;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        makeReports(new HTMLImplementor());
    }
    private static void makeReports(ReportImplementor reportImplementor){
        ReportFile report = new ReportFile(reportImplementor);
        report.insertHead("\n\t\t\t\t\t\t\t\tRelatório Semestral de Lucros\n\n");
        report.insertBodyContent("\tID | Mês       | Receita (R$) | Despesas (R$) | Lucro Bruto (R$) | Lucro Líquido (R$)\n" +
                "\t-------------------------------------------------------------------------------------\n" +
                "\t1  | Janeiro   | 150,000      | 80,000        | 70,000           | 50,000\n" +
                "\t2  | Fevereiro | 160,000      | 85,000        | 75,000           | 55,000\n" +
                "\t3  | Março     | 170,000      | 90,000        | 80,000           | 60,000\n" +
                "\t4  | Abril     | 180,000      | 95,000        | 85,000           | 65,000\n" +
                "\t5  | Maio      | 190,000      | 100,000       | 90,000           | 70,000\n" +
                "\t6  | Junho     | 200,000      | 105,000       | 95,000           | 75,000\n" +
                "\t7  | Julho     | 210,000      | 110,000       | 100,000          | 80,000\n" +
                "\t8  | Agosto    | 220,000      | 115,000       | 105,000          | 85,000\n" +
                "\t9  | Setembro  | 230,000      | 120,000       | 110,000          | 90,000\n" +
                "\t10 | Outubro   | 240,000      | 125,000       | 115,000          | 95,000\n" +
                "\t11 | Novembro  | 250,000      | 130,000       | 120,000          | 100,000\n" +
                "\t12 | Dezembro  | 260,000      | 135,000       | 125,000          | 105,000\n" +
                "\t13 | Janeiro   | 270,000      | 140,000       | 130,000          | 110,000\n" +
                "\t14 | Fevereiro | 280,000      | 145,000       | 135,000          | 115,000\n" +
                "\t15 | Março     | 290,000      | 150,000       | 140,000          | 120,000\n");
        report.insertFooter("Conclusão" +
                "\n\tA análise do relatório semestral mostraum crescimento consistente nas\n" +
                "\treceitas e lucros da empresa ao longo dos quinze meses. com receitas e lucros\n" +
                "\tlíquidos aumentando gradualmente a cada mês, a empresa demonstra gestão \n" +
                "\tuma sólida trajetória de expansão financeira, refletindo uma\n" +
                "\teficaz de custos e uma forte capacidade de geração de lucro.");
        report.assign("Jeferson Lors");

        System.out.println(report.get());

        report.clearContent();

        DetailedReportFile detailedReportFile = new DetailedReportFile(reportImplementor);
        detailedReportFile.insertHead("\n\t\t\t\t\t\t\t\tRelatório Semestral de Lucros\n\n");
        detailedReportFile.insertBodyContent("\tID | Mês       | Receita (R$) | Despesas (R$) | Lucro Bruto (R$) | Lucro Líquido (R$)\n" +
                "\t-------------------------------------------------------------------------------------\n" +
                "\t1  | Janeiro   | 150,000      | 80,000        | 70,000           | 50,000\n" +
                "\t2  | Fevereiro | 160,000      | 85,000        | 75,000           | 55,000\n" +
                "\t3  | Março     | 170,000      | 90,000        | 80,000           | 60,000\n" +
                "\t4  | Abril     | 180,000      | 95,000        | 85,000           | 65,000\n" +
                "\t5  | Maio      | 190,000      | 100,000       | 90,000           | 70,000\n" +
                "\t6  | Junho     | 200,000      | 105,000       | 95,000           | 75,000\n" +
                "\t7  | Julho     | 210,000      | 110,000       | 100,000          | 80,000\n" +
                "\t8  | Agosto    | 220,000      | 115,000       | 105,000          | 85,000\n" +
                "\t9  | Setembro  | 230,000      | 120,000       | 110,000          | 90,000\n" +
                "\t10 | Outubro   | 240,000      | 125,000       | 115,000          | 95,000\n" +
                "\t11 | Novembro  | 250,000      | 130,000       | 120,000          | 100,000\n" +
                "\t12 | Dezembro  | 260,000      | 135,000       | 125,000          | 105,000\n" +
                "\t13 | Janeiro   | 270,000      | 140,000       | 130,000          | 110,000\n" +
                "\t14 | Fevereiro | 280,000      | 145,000       | 135,000          | 115,000\n" +
                "\t15 | Março     | 290,000      | 150,000       | 140,000          | 120,000\n");

        detailedReportFile.insertFooter("Conclusão" +
                "\n\tA análise do relatório semestral mostraum crescimento consistente nas\n" +
                "\treceitas e lucros da empresa ao longo dos quinze meses. com receitas e lucros\n" +
                "\tlíquidos aumentando gradualmente a cada mês, a empresa demonstra gestão \n" +
                "\tuma sólida trajetória de expansão financeira, refletindo uma\n" +
                "\teficaz de custos e uma forte capacidade de geração de lucro.");

        detailedReportFile.assign("Jeferson Lors");
        detailedReportFile.assign("João Victor");

        detailedReportFile.setDateTimeReport(LocalDateTime.now().toString());
        System.out.println(detailedReportFile.get());
    }
}