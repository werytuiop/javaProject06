package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionUpdateDo implements ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ�� ����");
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.updateDo();
		System.out.println(result);
	}

}
