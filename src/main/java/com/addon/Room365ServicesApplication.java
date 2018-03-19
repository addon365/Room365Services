package com.addon;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.addon.models.Customer;
import com.addon.models.Proof;
import com.addon.models.ProofType;
import com.addon.services.CustomerRepository;

@SpringBootApplication
public class Room365ServicesApplication implements CommandLineRunner{

	private static final Logger logger=LoggerFactory.getLogger(Room365ServicesApplication.class);
	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Room365ServicesApplication.class, args);
	}
	@Override
	@Transactional
	public void run(String...strings) throws Exception
	{
		Customer customer=new Customer();
		customer.setAddress1("19/2, this street");
		customer.setName("Him");;
		customer.setCity("Chennai");;
		customer.setDob(new Date(2010,3,3));
		customer.setCustomerId(new Long(1));
		Proof proof=new Proof();
		proof.setCustomer(customer);
		proof.setProofId(new Long(2));
		proof.setProofType(ProofType.AADHAR);
		customer.getProof().add(proof);
		Customer saved=customerRepository.save(customer);
		for(Proof p : saved.getProof())
			logger.info(p.getProofType().toString());
	}
	
}
