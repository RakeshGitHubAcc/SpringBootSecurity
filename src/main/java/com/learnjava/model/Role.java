package com.learnjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private Integer roleId;
	@Column(name = "role_name")
	private String role;

	public Role() {
	}

	public Role(Integer roleId, String role) {
		this.roleId = roleId;
		this.role = role;
	}
}
