package br.com.diego.spring.crudhttp.outbound.json;

public class PingJson {

	private String status;
	
	public PingJson(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
