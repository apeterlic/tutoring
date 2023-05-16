package dev.beenary;

import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientRequestImpl;

import java.net.URI;
import java.net.URL;
import java.util.Scanner;
import java.util.Vector;

public class JavaClient {
    public static void main (String [] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert city:");
            String city = scanner.nextLine();

            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("https://vrijeme.hr/hrvatska_n.xml"));
            //config.setUserAgent("jdon.com");

            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);
            Object[] params = new Object[] { "GradIme", city};
            String pMethodName = "struct";

            Object result = client.execute(pMethodName, params);

            System.out.println(result);

        } catch (Exception exception) {
            System.err.println("JavaClient: " + exception);
        }
    }
}
