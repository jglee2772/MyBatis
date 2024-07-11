package himedia.studyJSP;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuDAO {
	ArrayList<MenuDTO> getMenuList();
	ArrayList<EmployeesDTO> getEmpList();
	ArrayList<depDTO> getDepList();
	EmployeesDTO findWorker(int wid);
	ArrayList<EmployeesDTO> ShowWorker(int as1,int as2);
	ArrayList<cntDTO> getCntList();
	ArrayList<EmployeesDTO> getNameList(String str);
	void insertMenu(String name, int pirce);
	ArrayList<scoreDTO> getScoreList();
	void insertScore(String name, int korean, int english, int math);
}
