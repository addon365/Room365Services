package com.addon.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	private String name;
	private String address1;
	private String address2;
	private String city;
	private String mobile;

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date dob;
	private Long tenantId;
	private Long customId;
	private Long voucherId;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
	private Set<Proof> proof=new HashSet<Proof>();

	public Set<Proof> getProof() {
		return proof;
	}

	public void setProof(Set<Proof> proof) {
		this.proof = proof;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "Customer [customerId=" + customerId + ", name=" + name + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", mobile=" + mobile + ", dob=" + dob + ", tenantId=" + tenantId
				+ ", customId=" + customId + ", voucherId=" + voucherId + proof.size() + "]";
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public Long getCustomId() {
		return customId;
	}

	public void setCustomId(Long customId) {
		this.customId = customId;
	}

	public Long getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(Long voucherId) {
		this.voucherId = voucherId;
	}

}
