package br.com.caelum.estoque.ws;

public class PublicaWebService {
	
	public static void main(String[] args) {
		
		EstoqueWS service = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		
		System.out.println("EstoqueWS rodando: " + url);
		
		Endpoint.publish(url, service);
		
	}
}
