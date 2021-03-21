package service;

import dao.UserDaoImpl;

public class UserService {
	UserDaoImpl dao;
	int age;//如果没有set方法就无法注入!
public void add() {
	System.out.println("service add");
	dao.updata();
}
public UserDaoImpl getDao() {
	return dao;
}
public void setDao(UserDaoImpl dao) {
	this.dao = dao;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
