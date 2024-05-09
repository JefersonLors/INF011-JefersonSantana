package protection;

import protection.others.Permission;
import protection.others.User;
import protection.proxies.PDFProxyFile;
import protection.realSubjects.PDFFile;
import protection.subjects.XFile;

public class Client {
    public static void main(String[] args) {
        XFile pdfFile = new PDFFile("pdfTestFile", "C:/users/jeferson.santana/documents");
        User userTeste = new User("Carlucho cabeção", Permission.ADMIN);
        XFile pdfProxyFile = new PDFProxyFile(pdfFile, userTeste);
        new Client().fileManipulator(pdfProxyFile);
    }

    public void fileManipulator(XFile file){
        try{
            file.open();
            file.write("O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto\n" +
                                "\t\tou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original,\n" +
                                "\t\tpermitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.");
            System.out.println(file.read());
            file.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}