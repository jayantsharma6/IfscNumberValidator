package com.example.IfscNumberValidator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankDetails {
    @JsonProperty("BANK")
    private String bank;
    @JsonProperty("BANKCODE")
    private String bankCode;
    @JsonProperty("IFSC")
    private String ifsc;
    @JsonProperty("BRANCH")
    private String branch;
    @JsonProperty("ADDRESS")
    private String address;
    @JsonProperty("CONTACT")
    private String contact;
    @JsonProperty("CITY")
    private String city;
    @JsonProperty("STATE")
    private String state;
    @JsonProperty("CENTRE")
    private String centre;
    @JsonProperty("DISTRICT")
    private String district;
    @JsonProperty("MICR")
    private String micr;
    @JsonProperty("SWIFT")
    private String swift;
    @JsonProperty("ISO3166")
    private String iso3166;
    @JsonProperty("RTGS")
    private boolean rtgs;
    @JsonProperty("IMPS")
    private boolean imps;
    @JsonProperty("UPI")
    private boolean upi;
    @JsonProperty("NEFT")
    private boolean neft;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMicr() {
        return micr;
    }

    public void setMicr(String micr) {
        this.micr = micr;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getIso3166() {
        return iso3166;
    }

    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    public boolean isRtgs() {
        return rtgs;
    }

    public void setRtgs(boolean rtgs) {
        this.rtgs = rtgs;
    }

    public boolean isImps() {
        return imps;
    }

    public void setImps(boolean imps) {
        this.imps = imps;
    }

    public boolean isUpi() {
        return upi;
    }

    public void setUpi(boolean upi) {
        this.upi = upi;
    }

    public boolean isNeft() {
        return neft;
    }

    public void setNeft(boolean neft) {
        this.neft = neft;
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "bank='" + bank + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", branch='" + branch + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", centre='" + centre + '\'' +
                ", district='" + district + '\'' +
                ", micr='" + micr + '\'' +
                ", swift='" + swift + '\'' +
                ", iso3166='" + iso3166 + '\'' +
                ", rtgs=" + rtgs +
                ", imps=" + imps +
                ", upi=" + upi +
                ", neft=" + neft +
                '}';
    }
}
