import others.Permission;
import others.User;
import proxies.protectionXFileProxy.PDFProtectionProxy;
import proxies.virtualXFileProxy.PDFVirtualProxy;
import realSubjects.PDFFile;
import subjects.XFile;

public class Client {
    public static void main(String[] args) {
        XFile pdfFile = new PDFFile("pdfTestFile", "C:/users/jeferson.santana/documents");
        User userTeste = new User("Carlucho cabeção", Permission.ADMIN);
        XFile pdfProxyFile = new PDFProtectionProxy(pdfFile, userTeste);
        new Client().protectionProxyFileManipulator(pdfProxyFile);

        //O objeto PDFFile não deve ser criado aqui.
        XFile pdfFileB = new PDFVirtualProxy("OtherPdfTestFile", "C:/users/jeferson.santana/documents");
        new Client().virtualProxyFileManipulator(pdfFileB);

    }

    public void protectionProxyFileManipulator(XFile file){
        try{
            //Apenas deve permitir a manipulação de arquivos por parte do ADMIN.
            file.open();
            file.write("O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto\n" +
                                "\t\tou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original,\n" +
                                "\t\tpermitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.");
            System.out.println(file.read());
            System.out.println(file.read());
            file.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void virtualProxyFileManipulator(XFile file){
        try{
            //Deve ser criado aqui.
            file.open();
            file.write(" Um novo tipo de conteúdo para testar a virtualização do objeto.");

            //A solicitação de leitura deve ser enviada aqui
            System.out.println(file.read());
            //mas não aqui.
            System.out.println(file.read());

            file.write(" Mudando de novo para testar a virtualização do objeto. ");
            //A solicitação de leitura deve ser enviada aqui
            System.out.println(file.read());
            //mas não aqui.
            System.out.println(file.read());

            file.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}