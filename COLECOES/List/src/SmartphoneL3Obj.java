import java.util.Objects;

public class SmartphoneL3Obj {

      private String serialNumber;
      private String marca;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        SmartphoneL3Obj smartphone = (SmartphoneL3Obj) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, marca);
    }

    @Override
    public String toString() {
        return "SmartphoneL3Obj{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';

    }

    public SmartphoneL3Obj(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
}

