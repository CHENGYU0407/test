package dao;

public class UserDaoImpl implements UserDao{
String name;
	@Override
	public void updata() {
		// TODO Auto-generated method stub
		System.out.println("Dao --");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
