/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package air.canada;

/**
 *
 * @author sprince
 */
class Seat {
    private int rowNumber;
    private String aisle;
    private String seat;
    private String firstName;
    private String lastName;
    private boolean occupied;

    public Seat() {
        rowNumber = 0;
        aisle = "";
        seat = "";
        firstName = "";
        lastName = "";
        occupied = false;
    }

    public Seat(int rowNumber, String aisle) {
        this.rowNumber = rowNumber;
        this.aisle = aisle;
        seat = "";
        firstName = "";
        lastName = "";
        occupied = false;
    }

    public void addPassenger(String first, String last) {
        firstName = first;
        lastName = last;
        occupied = true;
    }

    public String getAisle() {
        return aisle;
    }

    public String getName() {
        if(occupied) {
            return "this seat is booked by "+firstName + " " + lastName;
        }
        else {
            return "Empty Seat";
        }
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public String getSeat() {
        return seat;
    }

    public boolean hasPassenger() {
        return occupied;
    }

    public void removePassenger() {
        firstName = "";
        lastName = "";
        occupied = false;
    }
}