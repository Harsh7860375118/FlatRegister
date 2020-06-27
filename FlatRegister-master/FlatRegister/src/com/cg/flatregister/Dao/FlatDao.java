package com.cg.flatregister.Dao;

import java.util.ArrayList;

import com.cg.flatregister.Dto.FlatRegister;

public interface FlatDao {
	 public int registerFlat(FlatRegister flat);
	FlatRegister getAllOwnerIds(int id);
}
