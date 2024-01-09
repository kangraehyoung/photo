package com.rh.photo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoryVo {
	
	private int storyNo;
	
	private int memberNo;
	
	private String writer;
	
	private String title;
	
	private String content;
	
	private int likeCnt;
	
	private String createDate;
	
	private String updateDate;
	
}
