package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Cliente;
import com.app.web.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listarTodosLosClientes() { // CREACION DEL METODO DE SERVICIO
		return repository.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public Cliente eliminarCliente(Long id) {
		repository.deleteById(id);
		return null;
	}

}
