package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionInsertDo implements ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("회원 가입");
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.insertDo();
		System.out.println(result);
	}

}
