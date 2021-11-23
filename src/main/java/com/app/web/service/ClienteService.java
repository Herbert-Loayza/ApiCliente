package com.app.web.service;

import java.util.List;

import com.app.web.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarTodosLosClientes();
	
	public Cliente guardarCliente(Cliente cliente);
	
	public Cliente buscarPorId(Long id);
	
	public Cliente actualizarCliente (Cliente cliente);
	
	public Cliente eliminarCliente(Long id);

}
