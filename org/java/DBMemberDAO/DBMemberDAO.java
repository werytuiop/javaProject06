package org.java.DBMemberDAO;

import java.util.ArrayList;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemberDAO {

	// �̱��� ���� -> ��ü�� �� ���� ����
//	private static final DBMemberDAO INSTANCE = new DBMemberDAO();
//	private DBMemberDAO() {};
//	public static DBMemberDAO getInstance() {
//		return INSTANCE;
//	}
	
	public DBMemberDAO() {
		System.out.println("DAO ������");
	}
	
	// CRUD, DB Access Object
	
	public int insertDo() {
		int result = 0;
		// ȸ�� ���� ����
//		DBConnect.getConnection();
		return result;
	}
	public int updateDo() {
		int result = 0;
		// ȸ�� ���� ����
		return result;
	}
	public int deleteDo() {
		int result = 0;
		// ȸ�� Ż�� ����
		return result;
	}
	public ArrayList<DBMemberDTO> list() {
		ArrayList<DBMemberDTO> lists = new ArrayList<DBMemberDTO>();
		// ȸ�� ��ȸ ����
		return lists;
	}

}
