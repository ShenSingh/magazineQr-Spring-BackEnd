package org.zenveus.magazineqr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VisitorDTO {

    private  String visitor_id;
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
