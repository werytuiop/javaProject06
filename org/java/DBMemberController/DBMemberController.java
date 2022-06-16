package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberCommand.ActionCommand;
import org.java.DBMemberCommand.ActionDeleteDo;
import org.java.DBMemberCommand.ActionInsertDo;
import org.java.DBMemberCommand.ActionSelectDo;
import org.java.DBMemberCommand.ActionUpdateDo;

public class DBMemberController {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		ActionCommand command = null; // �������� ���� ���� ���� �ʱ�ȭ

		while (true) {

			System.out.println("> �������� �Է��ϼ���. (insert/select/update/delete)");
			String query = scn.next();

			if (query.equals("insert")) {
				command = new ActionInsertDo(); // ������
				command.excuteQuery();
			} else if (query.equals("update")) {
				command = new ActionUpdateDo();
				command.excuteQuery();
			} else if (query.equals("delete")) {
				command = new ActionDeleteDo();
				command.excuteQuery();
			} else if (query.equals("select")) {
				command = new ActionSelectDo();
				command.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�.\n");
			}

		}

		scn.close();
		
	}

}
