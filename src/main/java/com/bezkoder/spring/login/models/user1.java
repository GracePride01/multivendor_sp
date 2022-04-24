package com.bezkoder.spring.login.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user1")
public class user1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int pro_id;
	@Column(name = "pro_name")
	String title;
	@Column(name = "short_line")
	String description;
	@Column(name = "detail_des")
	 String published;
    public user1() {}
    public user1(String title, String description, String published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
}