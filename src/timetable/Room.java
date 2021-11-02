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
 * Simple Room abstraction -- used to store the room capacity and compare against the student Group's size.
 */
public class Room {
	private final int roomId;
	private final String roomNumber;
	private final int capacity;

	/**
	 * Initialize new Room
	 * 
	 * @param roomId
	 *            The ID for this classroom
	 * @param roomNumber
	 *            The room number
	 * @param capacity
	 *            The room capacity
	 */
	public Room(int roomId, String roomNumber, int capacity) {
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.capacity = capacity;
	}

	/**
	 * Return roomId
	 * 
	 * @return roomId
	 */
	public int getRoomId() {
		return this.roomId;
	}

	/**
	 * Return room number
	 * 
	 * @return roomNumber
	 */
	public String getRoomNumber() {
		return this.roomNumber;
	}

	/**
	 * Return room capacity
	 * 
	 * @return capacity
	 */
	public int getRoomCapacity() {
		return this.capacity;
	}

}
