package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.model.Record;

@Service
public class RecordServiceImpl implements IRecordService{

	List<Record>list= List.of(
			new Record(1L,"cogni@gmail.com","tata motors",112L),
			new Record(2L,"tcc@gmail.com","MandM motors",113L),
			new Record(3L,"mnc@gmail.com","porche motors",114L),
			new Record(4L,"lntc@gmail.com","lambo motors",115L),
			new Record(5L,"google@gmail.com","maruti motors",116L),
			new Record(6L,"microsft@gmail.com","ctc motors",117L),
			new Record(7L,"infos@gmail.com","tech motors",112L),
			new Record(8L,"marc@gmail.com","ikkea motors",113L),
			new Record(9L,"tesla@gmail.com","tesla motors",114L)


			);
	
	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		return list.stream().filter(record->record.getEid().equals(eId)).collect(Collectors.toList());
	}

}
