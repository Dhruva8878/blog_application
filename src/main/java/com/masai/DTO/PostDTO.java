package com.masai.DTO;

import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;

import com.masai.model.Category;
import com.masai.model.Comments;
import com.masai.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
	
	private Integer postId;
	private String title;
	private String content;
	private String imageUrl;
	private Date addedDate;
	
    private Category category;
	
	private User user;
	
	private List<Comments> comments;

}
