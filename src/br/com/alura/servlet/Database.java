package br.com.alura.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Database {
	
	private static List<Enterprise> list;
	
	static {
		Database.list = new ArrayList<>();
		Database.list.add(new Enterprise("Alura", new Date()));
		Database.list.add(new Enterprise("Caelum", new Date()));
	}
	
	public static void add(Enterprise enterprise) {
		Database.list.add(enterprise);
	}
	
	public static List<Enterprise> getEnterprises() {
		return Collections.unmodifiableList(Database.list);
	}

}
