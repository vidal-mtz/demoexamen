package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Detalle;
import com.example.demo.entity.DetalleId;

@Repository
public interface DetalleData extends JpaRepository<Detalle, DetalleId> {

}
