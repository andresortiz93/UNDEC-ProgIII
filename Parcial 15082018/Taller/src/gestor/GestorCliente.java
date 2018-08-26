package gestor;

import java.util.LinkedList;

import clases.Cliente;

public class GestorCliente {
	private LinkedList<Cliente> clientes = new LinkedList<>();

	public GestorCliente(LinkedList<Cliente> linkedList) {
		
	}

	public void crearCliente(Cliente factoryCliente) {
		clientes.add(factoryCliente);
		
		
	}

	public LinkedList<Cliente> getColeccionClientes() {
		
		return clientes;
	}

}
