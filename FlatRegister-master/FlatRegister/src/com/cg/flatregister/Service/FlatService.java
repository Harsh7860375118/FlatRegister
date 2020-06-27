package com.cg.flatregister.Service;

import java.util.ArrayList;

import com.cg.flatregister.Dto.FlatRegister;
import com.cg.flatregister.exception.FlatException;


public interface FlatService {
	int registerFlat(FlatRegister flat);
	FlatRegister getAllOwnerIds(int id);
	
	public boolean validateOwnerId(int id) throws FlatException;

}
