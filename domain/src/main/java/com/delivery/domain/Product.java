package com.delivery.domain;

import com.delivery.domain.enums.Category;
import com.delivery.domain.enums.Measure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cinema")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer number;
    @Column
    private Measure measure;
    @Column
    private Category category;
    @Column
    private Integer cost;
    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;
}
