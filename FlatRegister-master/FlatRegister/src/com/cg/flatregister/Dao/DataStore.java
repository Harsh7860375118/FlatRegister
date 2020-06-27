package com.cg.flatregister.Dao;

import java.util.HashMap;

import com.cg.flatregister.Dto.FlatRegister;

public class DataStore {
	public static HashMap<Integer, FlatRegister> flat;
	public static HashMap<Integer, FlatRegister> createCollection(){
		if(flat==null)
			flat = new HashMap<>();
		return flat;
	
}
}