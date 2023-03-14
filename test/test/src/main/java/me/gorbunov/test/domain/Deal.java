package me.gorbunov.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "deal")
@SequenceGenerator(name = "deal_seq_gen", sequenceName = "deal_seq", allocationSize = 1)
public class Deal extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deal_seq")
    private Long id;

    @Column(name = "title")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "client_type")
    private DealType dealType;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;
}
