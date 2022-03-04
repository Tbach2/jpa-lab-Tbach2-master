package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name="photo", schema="recipe")
public class RecipePhoto {

    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="photo_recipe_id")
    private Recipe recipe;

    @Column(name="photo_filename")
    private String filename;

    @Column(name="photo_caption")
    private String caption;

    @Column(name="photo_datestamp")
    private LocalDateTime datestamp;

    @Column(name="photo_visible")
    private char visible;
}