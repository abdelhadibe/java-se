package com.aelion.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.aelion.database.mysql.MySqlConnect;
import com.aelion.models.Model;

public abstract class Repository {
	private Model model;
	private ArrayList<Model> collection;
	
	public Repository(Model model) {
		this.model = model;
	}
	
	public ArrayList<Model> findAll() {
		Connection db = MySqlConnect.getInstance();
		try {
			Statement statement = db.createStatement();
			ResultSet res = statement.executeQuery(this.model.select());
			this.collection = new ArrayList<Model>();
			while (res.next()) {
				this.model.hydrate(res);
				this.collection.add(this.model);
			}
			return this.collection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void find(int id) {}
	
	public void save() {}
}
