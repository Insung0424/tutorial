package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
			System.out.println("Insert into Mysql DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into Mysql DB userID = " + userinfo.getUserId());	
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("delete from Mysql DB userID = " + userinfo.getUserId());	
	}

}
