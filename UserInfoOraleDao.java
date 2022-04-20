package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOraleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into Oracle DB userID = " + userinfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into Oracle DB userID = " + userinfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("delete from Oracle DB userID = " + userinfo.getUserId());	
	}

}
