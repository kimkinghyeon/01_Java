package com.ohgiraffer.api.object.car;

public class Car {
        private String carName;
        private String carColor;
        private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public int hashCode() {
        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.carName.hashCode();
        result = PRIME * result + this.carColor.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return this.carName.equals(car.carName) &&
                this.carColor.equals(car.carColor);



    }
}
