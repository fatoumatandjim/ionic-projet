package com.OdkApprenant.demo.model;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Apprenant implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Integer id;
	@Column(length = 25)
	private String prenom;
	@Column(length = 25)
	private String nom;        
	private int age;
	private int telephone;
	@Column(length = 40)
	private String email;
	@Column(unique = true)
	private String login;
	private String password;
	private String genre;
	@Enumerated(EnumType.STRING)
	private ApprenantStatus apprenantStatus;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateModification;

}
