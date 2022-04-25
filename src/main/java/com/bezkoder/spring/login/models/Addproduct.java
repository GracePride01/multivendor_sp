package com.bezkoder.spring.login.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
// Annotations
@Entity
@Table(name = "add_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 
 
public class Addproduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     int pro_id;
	@Column(name = "pro_name")
	 String pro_name;
	@Column(name = "short_line")
	 String short_line;
	@Column(name = "detail_des")
	 String detail_des;
    
}
