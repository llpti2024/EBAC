import java.util.Objects;

public class SmartphoneSortingList {

      private String serialNumber;
      private String marca;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        SmartphoneSortingList smartphone = (SmartphoneSortingList) obj;
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

    public SmartphoneSortingList(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
}

