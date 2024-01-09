package com.rh.photo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVo {
	
	private int no;
	
	private String userId;
	
	private String password;
	
	private String email;
	
	private String userName;
	
	private String createDate;
	
	private String updateDate;
	
}
