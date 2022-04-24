package com.bezkoder.spring.login.models;

import javax.persistence.*;
@Entity
@Table(name = "add_pro")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pro_id;
	@Column(name = "pro_name")
	private String title;
	@Column(name = "short_line")
	private String description;
	@Column(name = "detail_des")
	private String published;
	public Tutorial() {}
	public Tutorial(String title, String description, String published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	public int getId() {
		return pro_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published =published;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + pro_id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}
}