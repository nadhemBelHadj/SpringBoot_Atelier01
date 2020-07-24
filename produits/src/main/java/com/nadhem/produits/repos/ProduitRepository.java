package com.nadhem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
