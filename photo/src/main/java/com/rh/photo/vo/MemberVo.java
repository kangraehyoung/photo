package com.rh.photo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVo {
	
	private int memberNo;
	
	private String memberId;
	
	private String password;
	
	private String email;
	
	private String memberNickName;
	
	private String createDate;
	
	private String updateDate;
	
}
