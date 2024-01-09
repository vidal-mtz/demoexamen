package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Producto;

@Repository
public interface ProductoData extends JpaRepository<Producto, Long> {

}
