package com.davi.demo.infrastucture.repository;

import com.davi.demo.infrastucture.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryUsuario extends JpaRepository <Usuario , Long>{

@Transactional
    void deleteByID (long Id);

}
