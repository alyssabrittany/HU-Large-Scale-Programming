package org.howard.edu.assignment7.tollbooth;

import static org.junit.jupiter.api.Assertions.*;


class Test extends Toll {

	@org.junit.jupiter.api.Test
	void testTruckCount() {
		assertTrue(this.truckcount == 0);
	}
	@org.junit.jupiter.api.Test
	void testArrayAize() {
		assertEquals(2000,this.list.length);
	}
	@org.junit.jupiter.api.Test
	void testListTrucks() {
		assertEquals(null,this.listTrucks()[0]);
	}
	@org.junit.jupiter.api.Test
	void testCalculateTolls() {
		DaewooTruck testTruck = new DaewooTruck(50, 50);
		assertEquals(250, this.calculateToll(testTruck));
	}
	
	@org.junit.jupiter.api.Test
	void testReset() {
		DaewooTruck testTruck = new DaewooTruck(50,50);
		this.calculateToll(testTruck);
		this.reset();
		assertEquals(0,this.truckcount);
	
	}
	

}
