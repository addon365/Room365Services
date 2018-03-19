package com.addon.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Proof {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long proofId;
	
	
	@Enumerated(EnumType.STRING)
	private ProofType proofType;
	private String value;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	@JsonBackReference
	private Customer customer; 
	
	public Long getProofId() {
		return proofId;
	}
	public void setProofId(Long proofId) {
		this.proofId = proofId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ProofType getProofType() {
		return proofType;
	}
	public void setProofType(ProofType proofType) {
		this.proofType = proofType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Proof [proofId=" + proofId + ", customerId=" + customer + ", proofType=" + proofType + ", value="
				+ value + "]";
	}
	
	
	
}
