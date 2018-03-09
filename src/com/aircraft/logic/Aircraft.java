package com.aircraft.logic;

/**Самолет*/

public abstract class Aircraft {
    private final String aircraftManufacturer; //ПРОИЗВОДИТЕЛЬ
    private final String aircraftModel;        //МОДЕЛЬ
    private final int flightRange;      //дальность полета
    private final int fuelConsumption; //топливо

    public Aircraft(String aircraftManufcturer, String aircraftModel, int flightRange, int fuelConsumption) {
        this.aircraftManufacturer = aircraftManufcturer;
        this.aircraftModel = aircraftModel;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract int getSeatingCapacity();//кол-во сидячих мест
    public abstract int getCargoCapacity(); //грузоподъемность

    public int getFlightRange() {
        return flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getAircraftManufcturer() {
        return aircraftManufacturer;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    @Override
    public String toString(){
        return  "Aircraft [производитель = " + aircraftManufacturer
                + ", модель = " + aircraftModel + ", количество сидячих мест = "
                + getSeatingCapacity() + ", грузоподъемность = " + getCargoCapacity()
                + ", дальность полета = " + flightRange + ", потребление топлива = "
                + fuelConsumption + "]";
    }
}

enum  AirType{ Boueing33, Type123};