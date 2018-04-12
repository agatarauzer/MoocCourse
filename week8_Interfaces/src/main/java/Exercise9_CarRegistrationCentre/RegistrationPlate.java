package Exercise9_CarRegistrationCentre;

import java.util.Objects;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString() {
        return country + " " + regCode;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;

        if (otherObject == null)
            return false;

        if (this.getClass() != otherObject.getClass())
            return false;

        RegistrationPlate other = (RegistrationPlate) otherObject;

        if (country.equals(other.country) && regCode.equals(other.regCode))
            return true;

        return false;
    }

    public int hashCode() {
        return Objects.hash(country, regCode);
    }
}
