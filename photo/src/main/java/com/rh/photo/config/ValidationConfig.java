package com.rh.photo.config;

public class ValidationConfig {
	
	private String email;
	private String password;
    private boolean isValid;
    private StringBuilder errors;

    public ValidationConfig(String email, String password) {
    	this.email = email;
        this.password = password;
        this.isValid = true;
        this.errors = new StringBuilder();
    }

    public boolean validateEmailAndPassword(String email, String password) {
    	if (!containsEmail()) {
    		isValid = false;
    		errors.append("아이디가 이메일 형식이어야 합니다..");
		}
    	
        if (!containsUppercase()) {
            isValid = false;
            errors.append("비밀번호에 영어 대문자가 포함되어야 합니다.");
        }

        if (!containsLowercase()) {
            isValid = false;
            errors.append("비밀번호에 영어 소문자가 포함되어야 합니다.");
        }

        if (!containsSpecialCharacter()) {
            isValid = false;
            errors.append("비밀번호에 특수문자가 포함되어야 합니다.");
        }
		return isValid;
    }
    

    private boolean containsUppercase() {
        return password.matches(".*[A-Z].*");
    }

    private boolean containsLowercase() {
        return password.matches(".*[a-z].*");
    }

    private boolean containsSpecialCharacter() {
        return password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }
    
    private boolean containsEmail() {
    	return email.matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$");
    }
    
    public boolean isValid() {
        return isValid;
    }

    public String getErrors() {
        return errors.toString();
    }
	    
}
