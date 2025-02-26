package com.calygam.back.dtos;

import java.math.BigInteger;

import com.calygam.back.enums.UserRankEnum;
import com.calygam.back.enums.UserRoleEnum;

public class RegisterDTO {
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userTelefone;
	private String userCpf;
	private BigInteger userMoney;
	private UserRankEnum userRank;
	private UserRoleEnum userRole;
	public RegisterDTO(String userName, String userEmail, String userPassword, String userTelefone, String userCpf,
			BigInteger userMoney, UserRankEnum userRank, UserRoleEnum userRole) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userTelefone = userTelefone;
		this.userCpf = userCpf;
		this.userMoney = userMoney;
		this.userRank = userRank;
		this.userRole = userRole;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserTelefone() {
		return userTelefone;
	}
	public void setUserTelefone(String userTelefone) {
		this.userTelefone = userTelefone;
	}
	public String getUserCpf() {
		return userCpf;
	}
	public void setUserCpf(String userCpf) {
		this.userCpf = userCpf;
	}
	public BigInteger getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(BigInteger userMoney) {
		this.userMoney = userMoney;
	}
	public UserRankEnum getUserRank() {
		return userRank;
	}
	public void setUserRank(UserRankEnum userRank) {
		this.userRank = userRank;
	}
	public UserRoleEnum getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRoleEnum userRole) {
		this.userRole = userRole;
	}
	
	

}
