package com.repaso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.repaso.modelo.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

    @Query(value="SELECT * FROM usuario WHERE nombre = ?1 and clave=?2", nativeQuery=true)
    public List<Usuario> findByNombreAndClave(String nombre, String clave);
}
