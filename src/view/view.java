package view;

import java.sql.Date;
import java.util.Scanner;

import action.GameAction;
import model.game;
import model.record;

public class view {

	private static final String CONTEXT="欢迎进入功能菜单：\n" + 
		"MAIN:主菜单\n" +
		"ADD:注册用户" +
		"QUERY:根据用户名查找" +
		"UPDATE:更新对战记录" +
		"DELETE:删除该记录" +
		"SELECT:查看所有对战记录" +
		"GET:根据对战时间查找对战记录"	+
		"DEL:注销用户" +
		"EXIT:退出菜单"
			;
	private static final String	OPERATION_MAIN="MAIN";
	private static final String OPERATION_ADD="ADD";
	private static final String OPERATION_QUERY="QUERY";
	private static final String OPERATION_UPDATE="UPDATE"; 
	private static final String OPERATION_DELETE="DELETE";
	private static final String OPERATION_SELECT="SELECT";
	private static final String OPERATION_GET="GET";
	private static final String OPERATION_DEL="DEL";
	private static final String OPERATION_EXIT="EXIT";	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CONTEXT);
		
		Scanner scan = new Scanner(System.in);
		
		record record = new record();
		
		game game = new game();
		
		GameAction action = new GameAction();
		
		String prenious = null;
		Integer step = 1;
		
		while(true) {
			 String in = scan.next().toString();
			if(OPERATION_EXIT.equals(in)) {
				System.out.println("您已成功退出");
				break;
			}else if(OPERATION_ADD.equals(in)) {
				prenious = OPERATION_ADD;
				if(1==step) {
					System.out.println("请输入新增id");
				}else if(2==step) {
					game.setPlayer_username(in);
					System.out.println("请输入新增密码");
				}else if(3==step) {
					game.setPlayer_password(Integer.valueOf(in));
					System.out.println("请输入新增时间");
				}else if(4==step) {
					game.setPlay_createtime(Date.valueOf(in));
				}
				step++;

			}else if(OPERATION_UPDATE.equals(in)) {
				try {
					action.edit(game);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(OPERATION_DELETE.equals(in)) {
				System.out.println("请输入要删除信息的id");
				record.setGame_id(Integer.valueOf(in));
				try {
					action.del(record.getGame_id());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(OPERATION_SELECT.equals(in)) {
				System.out.println("请输入要查询信息");
				action.getClass();
			}else if(OPERATION_GET.equals(in)) {
				System.out.println("请输入要查询信息的时间");
				record.setGame_begintime(Date.valueOf(in));
				record.setGame_exittime(Date.valueOf(in));
				try {
					action.query(record.getGame_begintime().toString(),record.getGame_exittime().toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(OPERATION_DEL.equals(in)){
				System.out.println("请输入要删除信息的id");
				record.setGame_id(Integer.valueOf(in));
				try {
					action.del(record.getGame_id());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			

			
			
			
		}
		
		
		
	}

}
