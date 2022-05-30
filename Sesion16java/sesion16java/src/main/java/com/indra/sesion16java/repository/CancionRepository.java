package com.indra.sesion16java.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import com.indra.sesion16java.models.*;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, Integer> {

}
