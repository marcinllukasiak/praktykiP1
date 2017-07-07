
package org.carrental.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Car {
    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private Long id;

    @NotNull
    @Column(name = "car_model")
    private String model;

    @NotNull
    @Column(name = "car_brand")
    private String brand;

    @NotNull
    @Column(name = "car_reg_num")
    private String registrationNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }
}

