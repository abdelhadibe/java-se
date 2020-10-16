package com.aelion.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.aelion.database.mysql.MySqlConnect;
import com.aelion.models.Actor;
import com.aelion.models.Model;
import com.aelion.repositories.ActorRepository;

public class Main {

	public static void main(String[] args) {
		
		Actor actor = new Actor();
		ActorRepository repository = new ActorRepository(actor);
		ArrayList<Model> actors = repository.findAll();
		System.out.println("Il y a " + actors.size() + " lignes dans la table");
		
		
		
		Connection db = MySqlConnect.getInstance();
		System.out.println("Try to get another instance");
		db = MySqlConnect.getInstance();
		
		// Requête SQL à partir de l'instance de connexion
		try {
			Statement countStatement = db.createStatement();
			ResultSet resCount = countStatement.executeQuery("SELECT COUNT(*) rows FROM actor");
			resCount.next();
			long rows = resCount.getLong("rows");
			resCount.close();
			countStatement.close();
			
			
			Statement statement = db.createStatement();
			ResultSet res = statement.executeQuery(actor.select());
			
			res.last();
			System.out.println("res contains " + res.getRow() + " rows");
			// Reset the cursor to first
			res.beforeFirst();
			
			while (res.next()) {
				System.out.print(
					"Id : " + res.getInt("actor_id") + "\n" + 
					"Nom :" + res.getString("last_name") + "\n" +
					"Prénom :" + res.getString("first_name") + "\n" +
					"Prénom : " + res.getNString(3)
				);
			}
			res.close();
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
