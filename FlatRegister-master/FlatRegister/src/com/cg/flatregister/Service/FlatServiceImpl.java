package com.cg.flatregister.Service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.flatregister.Dao.FlatDao;
import com.cg.flatregister.Dao.FlatDaoImpl;
import com.cg.flatregister.Dto.FlatRegister;
import com.cg.flatregister.exception.FlatException;

public class FlatServiceImpl implements FlatService {
	FlatDao dao =null;
	public FlatServiceImpl() {
		// TODO Auto-generated constructor stub
		 dao = new FlatDaoImpl();
	}
	@Override
	public int registerFlat(FlatRegister flat) {
		// TODO Auto-generated method stub
		return dao.registerFlat(flat);
	}

	@Override
	public FlatRegister getAllOwnerIds(int id) {
		// TODO Auto-generated method stub
		return dao.getAllOwnerIds(id);
	}
	@Override
	public boolean validateOwnerId(int id) throws FlatException {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[1-3]{1,}");
		Matcher m = pat.matcher(String.valueOf(id));
		return m.matches();
	}
}
