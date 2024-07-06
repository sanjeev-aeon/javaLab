package httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test {
	public static void main(String[] args) {
		try {
//			URL url = new URL("https://tcra.germanywestcentral.cloudapp.azure.com/awc/tc/micro/svc_registry/ping");
//			URL url = new URL("https://tcra.germanywestcentral.cloudapp.azure.com/awc/tc/services");
			URL url = new URL("http://10.22.134.82:3000/tc/micro/svc_registry/ping");
//			URL url = new URL("http://10.22.134.82:3000/tc/services");
//			URL url = new URL("http://10.22.134.82:3000/tc/micro");
//			URL url = new URL("https://tcra.germanywestcentral.cloudapp.azure.com/awc/tc/controller/test");
//			URL url = new URL("https://test03.cloud.teamcenter.com/tc/micro/svc_registry/ping");
			URLConnection openConnection = url.openConnection();
			openConnection.setRequestProperty("Accept", "*/*");
			openConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
			openConnection.connect();
			InputStream inputStream = openConnection.getInputStream();
			inputStream.transferTo(System.out);
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
