package br.com.alura.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {
	
	private static List<Enterprise> list = new ArrayList<>();
	
	static {
		Database.list = new ArrayList<>();
		Database.list.add(new Enterprise("Alura"));
		Database.list.add(new Enterprise("Caelum"));
	}
	
	public static void add(Enterprise enterprise) {
		Database.list.add(enterprise);
	}
	
	public static List<Enterprise> getEnterprises() {
		return Collections.unmodifiableList(Database.list);
	}

}
