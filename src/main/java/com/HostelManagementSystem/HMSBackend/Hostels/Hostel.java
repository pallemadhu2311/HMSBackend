package com.HostelManagementSystem.HMSBackend.Hostels;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "hostels_data")
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String hostelname;
    private String ownername;
    private String hosteltype;
    private String phoneno;
    private String email;
    private String feetype;
    private Double oneshare;
    private Double twoshare;
    private Double threeshare;
    private Double fourshare;
    private Double fiveshare;
    private Double advanceamount;
    private Double monthlyflatprice;
    private Boolean alphabets;
    private Boolean numbers;
    private Boolean combinationtype;
    private String hostelphotos;
    private String flat;
    private String street;
    private String city;
    private String district;
    private String state;
    private Integer pincode;
    private Boolean ac;
    private Boolean nonac;
    private Boolean washingmachine;
    private Boolean geyser;
    private Boolean gym;
    private Boolean parking;
    private Boolean hostelbus;
    private String instructions;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHostelname() {
        return hostelname;
    }

    public void setHostelname(String hostelname) {
        this.hostelname = hostelname;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getHosteltype() {
        return hosteltype;
    }

    public void setHosteltype(String hosteltype) {
        this.hosteltype = hosteltype;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public Double getOneshare() {
        return oneshare;
    }

    public void setOneshare(Double oneshare) {
        this.oneshare = oneshare;
    }

    public Double getTwoshare() {
        return twoshare;
    }

    public void setTwoshare(Double twoshare) {
        this.twoshare = twoshare;
    }

    public Double getThreeshare() {
        return threeshare;
    }

    public void setThreeshare(Double threeshare) {
        this.threeshare = threeshare;
    }

    public Double getFourshare() {
        return fourshare;
    }

    public void setFourshare(Double fourshare) {
        this.fourshare = fourshare;
    }

    public Double getFiveshare() {
        return fiveshare;
    }

    public void setFiveshare(Double fiveshare) {
        this.fiveshare = fiveshare;
    }

    public Double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(Double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public Double getMonthlyflatprice() {
        return monthlyflatprice;
    }

    public void setMonthlyflatprice(Double monthlyflatprice) {
        this.monthlyflatprice = monthlyflatprice;
    }

    public Boolean getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(Boolean alphabets) {
        this.alphabets = alphabets;
    }

    public Boolean getNumbers() {
        return numbers;
    }

    public void setNumbers(Boolean numbers) {
        this.numbers = numbers;
    }

    public Boolean getCombinationtype() {
        return combinationtype;
    }

    public void setCombinationtype(Boolean combinationtype) {
        this.combinationtype = combinationtype;
    }

    public String getHostelphotos() {
        return hostelphotos;
    }

    public void setHostelphotos(String hostelphotos) {
        this.hostelphotos = hostelphotos;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public Boolean getNonac() {
        return nonac;
    }

    public void setNonac(Boolean nonac) {
        this.nonac = nonac;
    }

    public Boolean getWashingmachine() {
        return washingmachine;
    }

    public void setWashingmachine(Boolean washingmachine) {
        this.washingmachine = washingmachine;
    }

    public Boolean getGeyser() {
        return geyser;
    }

    public void setGeyser(Boolean geyser) {
        this.geyser = geyser;
    }

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getHostelbus() {
        return hostelbus;
    }

    public void setHostelbus(Boolean hostelbus) {
        this.hostelbus = hostelbus;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}
