package com.rh.photo.config;

public class ValidationConfig {
	
	private String password;
    private boolean isValid;
    private StringBuilder errors;

    public ValidationConfig(String password) {
        this.password = password;
        this.isValid = true;
        this.errors = new StringBuilder();
    }

    public void validatePassword() {
        if (!containsUppercase()) {
            isValid = false;
            errors.append("비밀번호에 영어 대문자가 포함되어야 합니다.\n");
        }

        if (!containsLowercase()) {
            isValid = false;
            errors.append("비밀번호에 영어 소문자가 포함되어야 합니다.\n");
        }

        if (!containsSpecialCharacter()) {
            isValid = false;
            errors.append("비밀번호에 특수문자가 포함되어야 합니다.\n");
        }
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

    public boolean isValid() {
        return isValid;
    }

    public String getErrors() {
        return errors.toString();
    }
	    
}
