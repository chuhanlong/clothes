package com.chu.clothes.bean;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserFormBean implements Serializable{

    private Integer id;

	@NotEmpty(message = "用户名不能为空")
	@Length(min = 1, max = 30, message = "用户名长度1~30")
    private String userName;

	@NotEmpty(message = "密码不能为空")
	@Length(min = 1, max = 30, message = "密码长度1~30")
    private String password;
	
	@Email(regexp="*@*.*")
	@NotEmpty(message = "邮箱不能为空")
	@Length(min = 1, max = 50, message = "邮箱长度1~50")
    private String email;

	@NotEmpty(message = "电话不能为空")
	@Length(min = 1, max = 30, message = "用户名长度1~15")
    private String mobile;

	@NotEmpty(message = "年龄不能为空")
    private Byte age;

    private Byte status;

    private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}
