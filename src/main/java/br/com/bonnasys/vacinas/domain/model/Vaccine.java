package br.com.bonnasys.vacinas.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "vaccines")

public class Vaccine {
    @Id
    @Column(length = 36)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String producer;
    private OffsetTime createdAt;
    private OffsetDateTime updatedAt;



}
