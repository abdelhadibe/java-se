package com.aelion.interfaces;

import com.aelion.user.User;

public interface Players {
	public void addPlayer(User user);
	public void addPlayer(String whatOf, User user) throws Exception;
}
