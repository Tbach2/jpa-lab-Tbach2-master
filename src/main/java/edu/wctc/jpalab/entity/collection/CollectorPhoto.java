package edu.wctc.jpalab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name="photo", schema="collection")
public class CollectorPhoto {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="photo_collector_id")
    private Collector collector;

    @Column(name="photo_filename")
    private String filename;

    @Column(name="photo_datestamp")
    private LocalDateTime datestamp;

    @Column(name="photo_visible")
    private char visible;
}