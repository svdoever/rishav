/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import pc.*;
import dag.*;
import java.io.*;
import javax.xml.bind.*;

/**
 *
 * @author Administrator
 */
public class TEST {
public TEST()throws Exception{
     //JAXBContext jc = JAXBContext.newInstance("pc",this.getClass().getClassLoader());
JAXBContext jc = JAXBContext.newInstance(TARGET.class);
            Unmarshaller u = jc.createUnmarshaller ();

           File f = new File ("TEST1.xml");
           //JAXBElement element = (JAXBElement) u.unmarshal (f);
           //System.out.print(element.getValue().getClass());
           //POWERMART pm = (POWERMART) element.getValue ();

TARGET pm=(TARGET)u.unmarshal (f);


//System.out.print(pm.getREPOSITORY().get(0).getFOLDER().get(0).getMAPPING().get(0).getNAME()+"\n");

//CONFIG config=pm.getREPOSITORY().get(0).getFOLDER().get(0).getCONFIG().get(0);
//           CONFIG config=(CONFIG)u.unmarshal (f);
//List<ATTRIBUTE> atr=config.getATTRIBUTE();
//
//Iterator itr = atr.iterator();
//while(itr.hasNext()) {
//
//    ATTRIBUTE atri = (ATTRIBUTE)itr.next();
//    System.out.print(atri.getNAME() + ":"+atri.getVALUE()+"\n");
//    if(atri.getVALUE().equals("")){
//        System.out.print("Value Null \n");
//    }
//
//}
        
    Marshaller m = jc.createMarshaller();

    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    //m.setProperty(Marshaller.JAXB_ENCODING, new String("ISO-8859-1"));
    //System.out.print(u.getSchema());
    m.setProperty(Marshaller.JAXB_FRAGMENT, true);
//File out = new File ("out1.xml");
PrintWriter out = new PrintWriter("TEST.xml");
out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
out.println("<!DOCTYPE POWERMART SYSTEM \"powrmart.dtd\">");
m.marshal(pm, out);



}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{

        new TEST();

    }

}
