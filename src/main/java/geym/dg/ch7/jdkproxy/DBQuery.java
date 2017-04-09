package geym.dg.ch7.jdkproxy;

public class DBQuery implements IDBQuery{
	@Override
	public String request(String id) {
		return "request string";
	}
}
