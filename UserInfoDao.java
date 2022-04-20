package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {

		void insertUserInfo(UserInfo Userinfo);
		void updateUserInfo(UserInfo Userinfo);
		void deleteUserInfo(UserInfo Userinfo);
}
