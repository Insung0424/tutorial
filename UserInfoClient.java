package ch13.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOraleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
			
			FileInputStream fis = new FileInputStream("db.propeties");
			
			Properties prop = new Properties();
			prop.load(fis);
			
			String dbtype = prop.getProperty("DBTYPE");
			
			UserInfo userInfo = new UserInfo();
			userInfo.setUserId("12345");
			userInfo.setPassword("!@#$");
			userInfo.setUserName("Lee");
			
			UserInfoDao userInfoDao = null;
			
			if (dbtype.equals("ORACLE")) {
				userInfoDao = new UserInfoOraleDao();
			}
			else if(dbtype.equals("MYSQL")) {
				userInfoDao = new UserInfoMysqlDao();
			}
			else {
				System.out.println("db error");
				return;
			}
			
			userInfoDao.insertUserInfo(userInfo);
			userInfoDao.updateUserInfo(userInfo);
			userInfoDao.deleteUserInfo(userInfo);
			
	}

}
