package model;

import com.jfinal.kit.HashKit;
import model.base.BaseUser;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class User extends BaseUser<User> {
	public static final User dao = new User().dao();

	public User setPassword(String  password){
		String passwordmd5 = HashKit.md5(password).toLowerCase();
		return super.setPassword(passwordmd5);
	}
}
