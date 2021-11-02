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
public class Professor {
  
/**
 * Simple Professor abstraction.
 */

    private final int professorId;
    private final String professorName;

    /**
     * Initalize new Professor
     * 
     * @param professorId The ID for this professor
     * @param professorName The name of this professor
     */
    public Professor(int professorId, String professorName){
        this.professorId = professorId;
        this.professorName = professorName;
    }
    
    /**
     * Get professorId
     * 
     * @return professorId
     */
    public int getProfessorId(){
        return this.professorId;
    }
    
    /**
     * Get professor's name
     * 
     * @return professorName
     */
    public String getProfessorName(){
        return this.professorName;
    }
}


