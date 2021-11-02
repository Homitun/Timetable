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
public class Group {
    private final int groupId;
    private final int groupSize;
    private final int moduleIds[];

    public Group(int groupId, int groupSize, int moduleIds[]){
        this.groupId = groupId;
        this.groupSize = groupSize;
        this.moduleIds = moduleIds;
    }
    
    /**
     * Get groupId
     * 
     * @return groupId
     */
    public int getGroupId(){
        return this.groupId;
    }
    
    /**
     * Get groupSize
     * 
     * @return groupSize
     */
    public int getGroupSize(){
        return this.groupSize;
    }
        
    /**
     * Get array of group's moduleIds
     * 
     * @return moduleIds
     */
    public int[] getModuleIds(){
        return this.moduleIds;
    }
}
