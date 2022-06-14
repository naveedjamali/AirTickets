/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canada.air;

/**
 *
 * @author sprince
 */
public class Seat {

    private int rowNum;
    private String aisle;
    private String seat;
    private String firstName;
    private String lastName;
    private boolean occupied;

    Seat() {

        rowNum = 0;
        aisle = "";
        seat = "";
        firstName = "";
        lastName = "";
        occupied = false;

    }

    public Seat(int rowNum, String aisle){

        this.rowNum = rowNum;
        this.aisle = aisle;
        seat = "";
        firstName = "";
        lastName = "";
        occupied = false;

    }

    public void addPassenger(String first, String last){

        firstName = first;
        lastName = last;
        occupied = true;

    }

    public String getAisle(){
        return aisle;}

    public String getName() {

        if(occupied) {
            return "this seat is booked by "+firstName + " " + lastName;
        } else {
            return "Empty Seat"; }

    }

    public int getRowNum(){
        return rowNum;}

    public String getSeat(){
        return seat;}

    public boolean hasPassenger(){
        return occupied;}

    public void removePassenger(){

        firstName = "";
        lastName = "";
        occupied = false;

    }

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plan().setVisible(true);
            }
        });
    }
}