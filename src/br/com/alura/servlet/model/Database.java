package br.com.alura.servlet.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Database {
	
	private static List<Enterprise> enterprises;
	private static List<User> users;
	private static Integer nextId;
	
	static {
		Database.enterprises = new ArrayList<>();
		Database.users = new ArrayList<>();
		Database.nextId = 1;
		
		Database.addEnterprise(new Enterprise("Alura", new Date()));
		Database.addEnterprise(new Enterprise("Caelum", new Date()));
		
		Database.addUser(new User("Marcus", "123"));
		Database.addUser(new User("Vinicius", "321"));
	}
	
	public static void addEnterprise(Enterprise enterprise) {
		enterprise.setId(getNextId());
		Database.enterprises.add(enterprise);
	}
	
	public static void addUser(User newUser) {
		Database.users.add(newUser);
	}
	
	private static Integer getNextId() {
		final Integer nextId = Database.nextId;
		Database.nextId += 1;
		return nextId;
	}

	public static List<Enterprise> getAllEnterprises() {
		return Collections.unmodifiableList(Database.enterprises);
	}

	public static void removeBy(final Integer idToRemove) {
		Database.enterprises.removeIf(e -> e.getId().equals(idToRemove));
	}

	public static Enterprise findBy(final Integer id) {
		return Database.enterprises.stream()
				.filter(e -> e.getId().equals(id))
				.findFirst().get();
	}

	public static void update(final Integer id, final String newName, final Date newOpenDate) {
		Enterprise dbEnterprise = findBy(id);
		if (dbEnterprise != null) {
			dbEnterprise.setName(newName);
			dbEnterprise.setOpenDate(newOpenDate);
		}
	}

	public static User findUser(final String login, final String password) {
		return Database.users.stream()
			.filter(databaseUser -> databaseUser.compare(login, password))
			.findFirst().orElse(null);
	}
	

}
