package com.backendswf.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "Registros")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class registro {
 @Id
 @GeneratedValue (strategy = GenerationType. IDENTITY)
private Long idregistro;
private String nombreproducto; private int cantidadproducto; private String descripcionproducto;
 


}
