package com.srbruninho.apirestdemo.RestComSwagger.repository;

import com.srbruninho.apirestdemo.RestComSwagger.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente,Long> {

    Cliente findById( long id );
}
