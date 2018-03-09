package com.airline;
import com.aircraft.logic.Aircraft;
import com.aircraft.logic.AircraftCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**АВИАКОМПАНИЯ*/
public class Airline {

    private String airlineName;
    private List<Aircraft> aircrafts = new ArrayList<Aircraft>();

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.add(aircraft);
    }

    public void calculateTotalCargoPassengerCapacity(){ //рассчитать общую грузоподъемность пассажиров
        int totalPassengerCapacity = 0; //общая масса пасажиров
        int totalCargoCapacity = 0;     //общая грузоподъемность
        for (int i = 0; i < aircrafts.size(); ++i){
            totalPassengerCapacity += aircrafts.get(i).getSeatingCapacity();
            totalCargoCapacity += aircrafts.get(i).getCargoCapacity();
        }
        System.out.println("общая масса пасажиров " + totalPassengerCapacity);
        System.out.println("общая грузоподъемность " + totalCargoCapacity);
    }

    public void sortPlanesByFlightRange(){ //сортировка по дальности полета
        Collections.sort(this.aircrafts, new AircraftCompare());
    }

    //фильтр по потреблению топлива
    public ArrayList<Aircraft> filterAircraftsByFuelConsumption(int min, int max, boolean showResult){
        ArrayList<Aircraft> resultList = new ArrayList<Aircraft>();
        for(int i = 0; i < this.aircrafts.size(); ++i){
            int planeConsumption = aircrafts.get(i).getFuelConsumption();
            if(planeConsumption >= min && planeConsumption <= max){
                resultList.add(aircrafts.get(i));
            }
        }
        if(showResult == true){
            showAircraftList(resultList);
        }
        return resultList;
    }
    private void showAircraftList(List<Aircraft> a1){          //показать список самолетов
        System.out.println("====== " + this.getAirlineName() + " =====");
        for(int i = 0; i <a1.size(); ++i){
            System.out.println(a1.get(i));
        }
    }

    public void showAirlineAircrafts(){     //Показать Авиакомпании
        showAircraftList(this.aircrafts);
    }
}
