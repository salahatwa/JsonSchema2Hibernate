package com.jsonschema2Hibernate.repo;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T, D, ID extends Serializable>{
    
    D findOne(ID id);
    
    List<D> findAll();
    
    void save(D dto);

}
