package com.southwind.phone_store_demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AddressVO {
    private Integer id;
    private String areaCode;
    private String name;
    private String tel;
    private String address;

    public AddressVO(Integer id, String areaCode, String name, String tel, String address) {
        this.id = id;
        this.areaCode = areaCode;
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
