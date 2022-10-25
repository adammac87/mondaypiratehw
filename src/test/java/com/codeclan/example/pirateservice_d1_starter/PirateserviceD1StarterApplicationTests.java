package com.codeclan.example.pirateservice_d1_starter;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceD1StarterApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Test
	public void contextLoads() {
		//NB: ONLY used for testing purposes to clear the DB, not to be used in production code
		//Note you must delete in order ( Pirates, Ships, Raids) to main the referential integrity of the DB
		pirateRepository.deleteAll();
	}
	@Test
	public void createPirateAndShip() {
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);
	}

	@Test
	public void createSinglePirateAndSave(){

		Pirate pirate = new Pirate("Jack", "Sparrow", 32,ship);
		pirateRepository.save(pirate);
	}

}
