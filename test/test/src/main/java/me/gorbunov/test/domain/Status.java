package me.gorbunov.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "status")
@SequenceGenerator(name = "status_seq_gen", sequenceName = "status_seq", allocationSize = 1)
public class Status extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "status_seq")
    private Long id;

    @Column(name = "name")
    private String name;

}
