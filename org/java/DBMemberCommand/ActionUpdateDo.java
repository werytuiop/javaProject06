package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionUpdateDo implements ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("회원 수정");
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.updateDo();
		System.out.println(result);
	}

}
