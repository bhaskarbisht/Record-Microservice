package com.rec.service;

import java.util.List;

import com.rec.model.Record;

public interface IRecordService {
	
	public List<Record> getRecordOfEmployee(Long cId);

}
