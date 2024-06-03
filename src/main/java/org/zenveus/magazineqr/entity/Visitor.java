package org.zenveus.magazineqr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Visitor")
public class Visitor {
    @Id
    private String visitor_id;
    private String visitor_f_name;
    private String visitor_l_name;
    private Date visitor_dob;
    private String visitor_nic;
    private int visitor_number;
    private String visitor_address;
    private String visitor_type;
    private String gender;
    private byte[] imageData;
}
