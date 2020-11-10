package com.srbruninho.apirestdemo.RestComSwagger.resources;

import com.srbruninho.apirestdemo.RestComSwagger.exception.CustomException;
import com.srbruninho.apirestdemo.RestComSwagger.models.Cliente;
import com.srbruninho.apirestdemo.RestComSwagger.repository.IClienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
@Api("API Rest com Swager Exemplo")
public class ClienteResource {

    @Autowired
    private IClienteRepository _IClienterepository;

    @GetMapping("/exibirClientes")
    @ApiOperation(value = "Exibe todos os clientes")
    public List<Cliente> exibirClientes(){
        Optional<List<Cliente>> l_ListClienteOp = Optional.of(_IClienterepository.findAll());
        return l_ListClienteOp.orElseThrow( () -> new CustomException("Não há dados na base de dados referente a Cliente"));
    }

    @PostMapping("/exibirCliente/{id}")
    @ApiOperation(value = "Exibe o cliente via ID ")
    public Cliente exibirClientePorId(@PathVariable long id){

        Optional<Cliente> l_cliente = Optional.ofNullable( _IClienterepository.findById( id ) );

        return l_cliente.orElseThrow( () -> new CustomException("Não foi encontrado nenhum cliente com o id:" + id ) );

    }

    @DeleteMapping("/deleteCliente/{id}")
    @ApiOperation(value = "Deleta os cliente via ID")
    public void deletarClientePorId(@PathVariable long id){
         _IClienterepository.deleteById( id );
    }

    @PatchMapping("/atualizarCliente/{cliente}")
    @ApiOperation(value = "Atualiza um cliente via Request")
    public Cliente atualizarCliente(@RequestBody Cliente cliente){
        return _IClienterepository.save( cliente );
    }
}
