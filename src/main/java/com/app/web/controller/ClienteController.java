package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Cliente;
import com.app.web.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/clientes")
	public String listarClientes(Model modelo) {
		modelo.addAttribute("clientes", service.listarTodosLosClientes());
		return "clientes"; // RETORNA AL ARCHIVO ESTUDIANTES
	}

	@GetMapping("/clientes/nuevo")
	public String mostrarFormularioRegistro(Model modelo) {
		Cliente cliente = new Cliente();
		modelo.addAttribute("cliente", cliente);
		return "crear_cliente";
	}

	@PostMapping("/clientes")
	public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
		service.guardarCliente(cliente);
		return "redirect:/clientes";
	}

	@GetMapping("/clientes/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cliente", service.buscarPorId(id));
		return "editar_cliente";
	}

	@PostMapping("/clientes/{id}")
	public String actualizarCliente(@PathVariable Long id, @ModelAttribute("cliente") Cliente cliente, Model modelo) {
		Cliente clienteExistente = service.buscarPorId(id);
		clienteExistente.setId(id);
		clienteExistente.setNombre(cliente.getNombre());
		clienteExistente.setApellido(cliente.getApellido());
		clienteExistente.setCorreo(cliente.getCorreo());
		service.actualizarCliente(clienteExistente);
		return "redirect:/clientes";
	}

	@GetMapping("/clientes/{id}")
	public String eliminarCliente(@PathVariable Long id) {
		service.eliminarCliente(id);
		return "redirect:/clientes";
	}

}
