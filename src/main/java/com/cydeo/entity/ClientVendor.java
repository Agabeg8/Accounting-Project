package com.cydeo.entity;

import com.cydeo.enums.ClientVendorType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "clients_vendors")
public class ClientVendor extends BaseEntity{

    private String clientVendorName;
    private String phone;
    private String website;
    @Enumerated(EnumType.STRING)
    private ClientVendorType clientVendorType;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Company company;
}
