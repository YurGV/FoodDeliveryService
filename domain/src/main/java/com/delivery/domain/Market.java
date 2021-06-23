package com.delivery.domain;


import com.delivery.domain.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "market")
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column(unique = true)
    private String email;
    @Column
    private String address;
    @Column
    private Size size;


    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> products;

    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Order> orders;


}
