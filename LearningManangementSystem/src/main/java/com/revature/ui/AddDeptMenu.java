package com.revature.ui;

import java.util.Scanner;

import com.revature.exception.UserNameTaken;
import com.revature.pojo.Dept;
import com.revature.pojo.User;
import com.revature.service.DeptService;
import com.revature.service.UserService;

public class AddDeptMenu implements MainMenu {
	private MainMenu welcomeMenu;

	private MainMenu nextMenu;
	
	private Scanner scan;

	private DeptService deptService;

	
	

	@Override
	public MainMenu advance() {
		
		return nextMenu;
	}

	@Override
	public void displayOptions() {
		Dept dept = new Dept();
		System.out.println("Please enter a Department Id:");
		dept.setDeptId(scan.nextInt());
		scan.nextLine();
		System.out.println("Please enter a Department Name:");
		dept.setDeptName(scan.nextLine());
		
				deptService.AddDept(dept);			
			
				nextMenu = nextMenu;
		
		
	}

	@Override
	public MainMenu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScanner(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public AddDeptMenu() {
		super();
	}

	public AddDeptMenu(DeptService deptService, MainMenu welcomeMenu) {
		super();
		this.deptService = deptService;
		this.welcomeMenu = welcomeMenu;
	}

	public MainMenu getWelcomeMenu() {
		return welcomeMenu;
	}

	public void setWelcomeMenu(MainMenu welcomeMenu) {
		this.welcomeMenu = welcomeMenu;
	}

	public MainMenu getNextMenu() {
		return nextMenu;
	}

	public DeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}

}
