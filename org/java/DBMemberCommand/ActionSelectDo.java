package org.java.DBMemberCommand;

import java.util.ArrayList;

import org.java.DBMemberDAO.DBMemberDAO;
import org.java.DBMemberDTO.DBMemberDTO;

public class ActionSelectDo implements ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ�� ��ȸ");
		DBMemberDAO dao = new DBMemberDAO();
		ArrayList<DBMemberDTO> result = dao.list();
		System.out.println(result);
	}

}
