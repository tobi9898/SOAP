package webservice;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService(name="AlexWebServices")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class MyWebService {

	@WebMethod(operationName="rechne")
	public int rechne(String operation, int zahl1, int zahl2){

		if(operation.equals("+"))
		{
			return zahl1 + zahl2;
		}
		if(operation.equals("-"))
		{
			return zahl1 - zahl2;
		}
		if(operation.equals("/"))
		{
			return zahl1 / zahl2;
		}
		if(operation.equals("*"))
		{
			return zahl1 * zahl2;
		}

		return 0;
	}
}
