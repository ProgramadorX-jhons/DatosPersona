package com.jhons.myapp.respository;

import com.jhons.myapp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona,Long > {

    //esto base se usara en el serivico
}
