package com.cydeo.entity;

import com.cydeo.enums.CompanyStatus;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "companies")
public class Company extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String title;
    private String phone;
    private String website;

    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;

}
