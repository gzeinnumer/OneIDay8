package com.gzeinnumer.oneiday8.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseUser{

	@SerializedName("ResponseUser")
	private List<ResponseUserItem> responseUser;

	public List<ResponseUserItem> getResponseUser(){
		return responseUser;
	}
}