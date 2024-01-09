package com.rh.photo.service;

import java.util.HashMap;
import java.util.List;

public interface MemberService {

	int insertMember(HashMap<String, String> paraMap);

	int memberExistChk(HashMap<String, String> paraMap);

	HashMap<String, String> getMemberById(HashMap<String, String> paraMap);

	int deleteMemberByNo(HashMap<String, String> sessionMap);

}
