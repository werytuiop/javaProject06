package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionInsertDo implements ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ�� ����");
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.insertDo();
		System.out.println(result);
	}

}
