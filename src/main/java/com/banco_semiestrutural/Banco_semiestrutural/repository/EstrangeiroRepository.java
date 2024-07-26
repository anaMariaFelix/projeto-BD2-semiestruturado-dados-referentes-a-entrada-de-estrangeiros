package com.banco_semiestrutural.Banco_semiestrutural.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco_semiestrutural.Banco_semiestrutural.entity.Estrangeiro;

@Repository
public interface EstrangeiroRepository extends JpaRepository<Estrangeiro, Long> {

}
