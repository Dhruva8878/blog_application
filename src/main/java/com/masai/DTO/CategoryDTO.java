package com.masai.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
   
	private Integer cateId;
	
	private String catDesc;
	
	private String catType;
}
