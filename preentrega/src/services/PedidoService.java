package services;

import java.util.ArrayList;

import preentrega.model.Pedido;

public class PedidoService {
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	public void agregarPedido(Pedido p) {
		pedidos.add(p);
	}
	
	public ArrayList<Pedido> listarPedidos() {
		return pedidos;
	}
	
}
