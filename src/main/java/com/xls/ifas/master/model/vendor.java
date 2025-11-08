package com.xls.ifas.master.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "vendor")
public class vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AuditPatchesId")
    private Long vendorId;

    @Column(name = "VendorCode")
    private String vendorCode;

    @Column(name = "VendorName")
    private String vendorName;

    @Column(name = "VendorCity")
    private String VendorCity;

    @Column(name = "VendorCountry")
    private String VendorCountry;


    @Column(name = "VendorAddress")
    private String vendorAddress;

    @Column(name = "VendorPhNo")
    private String VendorPhNo;

    @Column(name = "PANNo")
    private String PANNo;

    @Column(name = "GSTNo")
    private String GSTNo;

    @Column(name = "uploadPath")
    private String uploadPath;


    @Column(name = "PatchDate")
    private LocalDateTime patchDate;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

}
