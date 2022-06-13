/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canada.air;

import javax.swing.JOptionPane;

/**
 *
 * @author sprince
 */
public class Passenger {

    private String firstName;
    private String lastName;
    private String seatNum;
    private String aisle;
    private String name;
    private int rowNum;
    int SORT_BY_NAME;
    int SORT_BY_SEAT;
    int sortValue;


    Passenger() {

        this.firstName = "";
        this.lastName = "";
        this.seatNum = "";
        this.aisle = "";
        this.name = "";
        this.rowNum = 0;

    }

    // Parameterised constructor
    // Used to initialize first and last name
    Passenger(String first, String last)
    {
        this.firstName = first;
        this.lastName = last;
        this.name = first + last;
    }

    // Parameterized constructor
    // Used to initialize first and last name and row and aisle
    Passenger(String first, String last, int row, String aisle)
    {
        this.firstName = first;
        this.lastName = last;
        this.rowNum = row;
        this.aisle = aisle;
        this.name = first + last;
    }

    // Compare 2 objects
    int compareTo(Passenger p)
    {
        if (this == p)
            return 1;
        return 0;
    }

    // Getters
    String getAisle()
    {
        return this.aisle;
    }

    String getFirstname()
    {
        return this.firstName;
    }

    String getLastName()
    {
        return this.lastName;
    }

    String getName()
    {
        return name;
    }

    int getRowNum()
    {
        return this.rowNum;
    }

    String getSeatNum()
    {
        return this.seatNum;
    }

    // Setters
    void setAisle(String letter)
    {
        this.aisle = letter;
    }

    void setFirstName(String first)
    {
        this.firstName = first;
    }

    void setLastName(String last)
    {
        this.lastName = last;
    }

    void setName(String first, String last)
    {
        this.name = this.firstName + this.lastName;
    }

    void setRowNum(int num)
    {
        this.rowNum = num;
    }

    void setSeatNum(String seatNum)
    {
        this.seatNum = seatNum;
    }

    // return in String
    public String toString()
    {
        return "Name : " + this.getName() + " Aisle : " + this.getAisle() + " Row No. : " + this.getRowNum() + " Seat No. : " + this.getSeatNum();

    }

}