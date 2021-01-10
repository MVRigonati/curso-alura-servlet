package br.com.alura.servlet.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Database {
	
	private static List<Enterprise> list;
	private static Integer nextId;
	
	static {
		Database.list = new ArrayList<>();
		Database.nextId = 1;
		
		Database.add(new Enterprise("Alura", new Date()));
		Database.add(new Enterprise("Caelum", new Date()));
	}
	
	public static void add(Enterprise enterprise) {
		enterprise.setId(getNextId());
		Database.list.add(enterprise);
	}
	
	private static Integer getNextId() {
		final Integer nextId = Database.nextId;
		Database.nextId += 1;
		return nextId;
	}

	public static List<Enterprise> getAllEnterprises() {
		return Collections.unmodifiableList(Database.list);
	}

	public static void removeBy(final Integer idToRemove) {
		Database.list.removeIf(e -> e.getId().equals(idToRemove));
	}

	public static Enterprise findBy(final Integer id) {
		return Database.list.stream()
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

}
