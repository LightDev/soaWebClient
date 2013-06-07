package rsi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import rsi.RSI_JDG_WS;

//@WebServiceClient(name = "CalculatorWSService",
//        targetNamespace = "http://calculator.me.org/",
//        wsdlLocation = "http://localhost:8081/axis2/services/RSI/RSI_JDG_WSService?wsdl")
@WebServiceClient(
        wsdlLocation = "http://localhost:8081/axis2/services/RSI/RSI_JDG_WSService?wsdl")
public class webClient {

    //...
    //@WebEndpoint(name = "CalculatorWSPort")
    @WebEndpoint
    public RSI_JDG_WS getHandle() throws MalformedURLException {
        QName qname = new QName("http://rsi_jdg_ws/", "RSI_JDG_WSService");
        Service proxy = Service.create(new URL("http://localhost:8081/axis2/services/RSI/RSI_JDG_WSService?wsdl"), qname);
        RSI_JDG_WS port = proxy.getPort(RSI_JDG_WS.class);
        return port;
    }
    //    public CalculatorWS getCalculatorWSPort() {
//        return super.getPort(new QName("http://calculator.me.org/", "CalculatorWSPort"), CalculatorWS.class);
//    }
    //...
}
