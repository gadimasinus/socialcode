package com.hackathon.social.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * UserResponse
 */
@Validated
public class UserResponse {
    @JsonProperty("userId")
    private Long userId = null;

    @JsonProperty("userType")
    private String userType = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("address1")
    private String address1 = null;

    @JsonProperty("address2")
    private String address2 = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("zip")
    private String zip = null;

    @JsonProperty("country")
    private String country = null;

    @JsonProperty("phone")
    private String phone = null;

    @JsonProperty("email")
    private String email = null;

    public UserResponse userId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     **/
    @Schema(example = "10", required = true, description = "")
    @NotNull

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserResponse userType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get userType
     *
     * @return userType
     **/
    @Schema(example = "Admin | Teacher | Learner", required = true, description = "")
    @NotNull

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public UserResponse firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/
    @Schema(example = "FirstName", required = true, description = "")
    @NotNull

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserResponse lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    @Schema(example = "LastName", required = true, description = "")
    @NotNull

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserResponse address1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Get address1
     *
     * @return address1
     **/
    @Schema(example = "123 Some St", required = true, description = "")
    @NotNull

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public UserResponse address2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * Get address2
     *
     * @return address2
     **/
    @Schema(required = true, description = "")
    @NotNull

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public UserResponse city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/
    @Schema(example = "Some City", required = true, description = "")
    @NotNull

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UserResponse state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @Schema(example = "ST", required = true, description = "")
    @NotNull

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UserResponse zip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Get zip
     *
     * @return zip
     **/
    @Schema(example = "12345", required = true, description = "")
    @NotNull

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public UserResponse country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     *
     * @return country
     **/
    @Schema(example = "USA", required = true, description = "")
    @NotNull

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserResponse phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    @Schema(example = "1234567890", required = true, description = "")
    @NotNull

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserResponse email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(example = "someone@socialcoding.com", required = true, description = "")
    @NotNull

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserResponse userResponse = (UserResponse) o;
        return Objects.equals(this.userId, userResponse.userId) &&
                Objects.equals(this.userType, userResponse.userType) &&
                Objects.equals(this.firstName, userResponse.firstName) &&
                Objects.equals(this.lastName, userResponse.lastName) &&
                Objects.equals(this.address1, userResponse.address1) &&
                Objects.equals(this.address2, userResponse.address2) &&
                Objects.equals(this.city, userResponse.city) &&
                Objects.equals(this.state, userResponse.state) &&
                Objects.equals(this.zip, userResponse.zip) &&
                Objects.equals(this.country, userResponse.country) &&
                Objects.equals(this.phone, userResponse.phone) &&
                Objects.equals(this.email, userResponse.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userType, firstName, lastName, address1, address2, city, state, zip, country, phone, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserResponse {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
        sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
