package com.schema.app.repository;

import java.util.List;
import java.util.Optional;

import com.schema.app.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

//Conexão JPA: entity/database
public interface UserRepository extends JpaRepository<User, Integer> {

    //CRUD:
    //find by id:
    Optional<User> findById(Integer id);
    
    //find userS (collection) by name
    List<User> findByName(String name);

    //find useR (email deve ser único - unique key )
    Optional<User> findByEmail(String email);

    //OBS.: todos os demais itens do CRUD já existem e são herdados da classe extendida "JpaRepository"...

}