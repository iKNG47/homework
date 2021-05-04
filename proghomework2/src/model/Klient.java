package model;

public class Klient {
    private String firstName, lastName, addressStreet, addressHouseNo, addressApartmentNo, addressCity,addressPostcode, registeredAddress, registeredAddressStreet, registeredAddressApartmentNo,registeredAddressCity,registeredAddressPostcode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressHouseNo() {
        return addressHouseNo;
    }

    public void setAddressHouseNo(String addressHouseNo) {
        this.addressHouseNo = addressHouseNo;
    }

    public String getAddressApartmentNo() {
        return addressApartmentNo;
    }

    public void setAddressApartmentNo(String addressApartmentNo) {
        this.addressApartmentNo = addressApartmentNo;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getRegisteredAddressStreet() {
        return registeredAddressStreet;
    }

    public void setRegisteredAddressStreet(String registeredAddressStreet) {
        this.registeredAddressStreet = registeredAddressStreet;
    }

    public String getRegisteredAddressApartmentNo() {
        return registeredAddressApartmentNo;
    }

    public void setRegisteredAddressApartmentNo(String registeredAddressApartmentNo) {
        this.registeredAddressApartmentNo = registeredAddressApartmentNo;
    }

    public String getRegisteredAddressCity() {
        return registeredAddressCity;
    }

    public void setRegisteredAddressCity(String registeredAddressCity) {
        this.registeredAddressCity = registeredAddressCity;
    }

    public String getRegisteredAddressPostcode() {
        return registeredAddressPostcode;
    }

    public void setRegisteredAddressPostcode(String registeredAddressPostcode) {
        this.registeredAddressPostcode = registeredAddressPostcode;
    }

    public Klient(String firstName, String lastName, String addressStreet, String addressHouseNo, String addressApartmentNo, String addressCity, String addressPostcode, String registeredAddress, String registeredAddressStreet, String registeredAddressApartmentNo, String registeredAddressCity, String registeredAddressPostcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressStreet = addressStreet;
        this.addressHouseNo = addressHouseNo;
        this.addressApartmentNo = addressApartmentNo;
        this.addressCity = addressCity;
        this.addressPostcode = addressPostcode;
        this.registeredAddress = registeredAddress;
        this.registeredAddressStreet = registeredAddressStreet;
        this.registeredAddressApartmentNo = registeredAddressApartmentNo;
        this.registeredAddressCity = registeredAddressCity;
        this.registeredAddressPostcode = registeredAddressPostcode;
    }
}
