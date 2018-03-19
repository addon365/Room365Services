package com.addon.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addon.models.Proof;

@Repository
public interface ProofRepository extends JpaRepository<Proof,Long> {

}
