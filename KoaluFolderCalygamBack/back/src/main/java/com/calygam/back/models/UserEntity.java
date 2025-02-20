package com.calygam.back.models;

import com.calygam.back.enums.UserRankEnum;
import com.calygam.back.enums.UserRoleEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity(name = "tb_users")
@Table(name = "tb_users")
public class UserEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "user_google_id")
	private String userGoogleId;
	
	@Column(name="user_name")
	private String userName;
	
	
	
	@Column(name="user_email")
	@Email
	private String userEmail;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_telefone")
	private String userTelefone;
	
	@Column(name="user_cpf")
	private Integer userCpf;
	
	@Column(name="user_xp")
	private Integer xp;
	
	@Column(name="user_rank")
	private UserRankEnum rank;
	
	@Column(name="user_role")
	private UserRoleEnum role;

	public UserEntity(Integer userId, String userGoogleId, String userName, String userEmail, String userPassword,
			String userTelefone, Integer userCpf, Integer xp, UserRankEnum rank, UserRoleEnum role) {
		super();
		this.userId = userId;
		this.userGoogleId = userGoogleId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userTelefone = userTelefone;
		this.userCpf = userCpf;
		this.xp = xp;
		this.rank = rank;
		this.role = role;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserGoogleId() {
		return userGoogleId;
	}

	public void setUserGoogleId(String userGoogleId) {
		this.userGoogleId = userGoogleId;
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

	public Integer getUserCpf() {
		return userCpf;
	}

	public void setUserCpf(Integer userCpf) {
		this.userCpf = userCpf;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public UserRankEnum getRank() {
		return rank;
	}

	public void setRank(UserRankEnum rank) {
		this.rank = rank;
	}

	public UserRoleEnum getRole() {
		return role;
	}

	public void setRole(UserRoleEnum role) {
		this.role = role;
	}
	
	
	
	

}
