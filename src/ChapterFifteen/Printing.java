package ChapterFifteen;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;
import java.io.FileInputStream;
import java.io.IOException;

public class Printing {
    public static void main(String[] args)throws PrintException, IOException{

        PrintService printService= PrintServiceLookup.lookupDefaultPrintService();
        DocPrintJob job=printService.createPrintJob();
        job.addPrintJobListener(new PrintJobAdapter() {
            public void printDataTransferComplete(PrintJobEvent event){
                System.out.println("data transfer successfully");

            }
            public void printJobNoMoreEvents(PrintJobEvent event){
                System.out.println("receive no more events");
            }
        });
        FileInputStream fis=new FileInputStream("C:/test.jpg");
        Doc doc = new SimpleDoc(fis, DocFlavor.INPUT_STREAM.AUTOSENSE, null);

        PrintRequestAttributeSet attrib = new HashPrintRequestAttributeSet();
        attrib.add(new Copies((1)));
        job.print(doc, attrib);
    }
}
