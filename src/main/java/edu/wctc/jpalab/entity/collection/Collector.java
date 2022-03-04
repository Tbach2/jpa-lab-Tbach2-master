package edu.wctc.jpalab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="collector", schema="collection")
public class Collector {
    @Id
    @Column(name="collector_id")
    private int id;

    @Column(name="collector_firstname")
    private String firstname;

    @Column(name="collector_lastname")
    private String lastname;

    @Column(name="collector_avatar")
    private String avatar;
}