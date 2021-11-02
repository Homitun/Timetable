/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Walter White
 */

/**
 * Simple timeslot abstraction -- just represents a timeslot (like "Wed 9:00am-11:00am").
 *  
 * @author bkanber
 *
 */
public class Timeslot {
    private final int timeslotId;
    private final String timeslot;

    /**
     * Initalize new Timeslot
     * 
     * @param timeslotId The ID for this timeslot
     * @param timeslot The timeslot being initalized
     */
    public Timeslot(int timeslotId, String timeslot){
        this.timeslotId = timeslotId;
        this.timeslot = timeslot;
    }
    
    /**
     * Returns the timeslotId
     * 
     * @return timeslotId
     */
    public int getTimeslotId(){
        return this.timeslotId;
    }
    
    /**
     * Returns the timeslot
     * 
     * @return timeslot
     */
    public String getTimeslot(){
        return this.timeslot;
    }
}


