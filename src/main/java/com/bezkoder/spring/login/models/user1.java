package com.bezkoder.spring.login.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "add_product")
public class user1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     int proid;
	@Column(name = "pro_name")
	 String proname;
	@Column(name = "short_line")
	 String shortline;
	@Column(name = "detail_des")
	 String detaildes;
	public user1(int proid, String proname, String shortline, String detaildes) {
	}
	public user1(String proname, String shortline, String detaildes) {
		this.proname = proname;
		this.shortline = shortline;
		this.detaildes = detaildes;
	}
}