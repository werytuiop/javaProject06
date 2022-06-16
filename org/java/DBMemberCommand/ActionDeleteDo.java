package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionDeleteDo implements ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("È¸¿ø Å»Åð");
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.deleteDo();
		System.out.println(result);
	}

}
