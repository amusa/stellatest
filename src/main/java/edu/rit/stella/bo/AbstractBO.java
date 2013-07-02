package edu.rit.stella.bo;

public interface AbstractBO<E, ID> {
	//User findByUserName(Id userName);
    void save(E e);
    void delete(ID id);
    E findById(ID id);
}
