package org.indra.clasedieciseis.repositories;

import org.indra.clasedieciseis.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CancionRepository extends JpaRepository<Cancion,Integer> {

}
