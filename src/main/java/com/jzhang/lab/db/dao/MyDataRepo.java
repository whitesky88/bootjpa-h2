package com.jzhang.lab.db.dao;

import org.springframework.data.repository.CrudRepository;
import com.jzhang.lab.db.data.MyData;

public interface MyDataRepo extends CrudRepository<MyData, Integer>
{

}
