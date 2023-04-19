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
    String title;
    String phone;
    String website;
    CompanyStatus companyStatus;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    Address address;

}
