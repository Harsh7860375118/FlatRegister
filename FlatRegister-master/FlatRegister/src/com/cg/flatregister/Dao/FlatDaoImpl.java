package com.cg.flatregister.Dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.flatregister.Dto.FlatRegister;

public class FlatDaoImpl implements FlatDao {
	HashMap<Integer,FlatRegister> flatr = new HashMap<>();
	
	public FlatDaoImpl() {
		// TODO Auto-generated constructor stub
		flatr = DataStore.createCollection();
	}
	@Override
	public int registerFlat(FlatRegister flat) {
		// TODO Auto-generated method stub
		int rollno=(int) (1000*Math.random());
		flatr.put(rollno, flat);
		return rollno;
	}

	@Override
	public FlatRegister getAllOwnerIds(int id) {
		// TODO Auto-generated method stub
		FlatRegister freg = flatr.get(id);
		return freg;
		}
	}


