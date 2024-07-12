package himedia.studyJSP;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@Autowired MenuDAO mdao;
	
	@GetMapping("/")
	public String home(Model model) {
		ArrayList<MenuDTO> arMenu = mdao.getMenuList();
		model.addAttribute("arMenu",arMenu);
		return "menulist";
	}
	@GetMapping("/input")
	public String input(Model model) {
		ArrayList<MenuDTO> arMenu = mdao.getMenuList();
		model.addAttribute("arMenu",arMenu);
		return "menuinput";
	}
	@PostMapping("/insert")
	public String doInsert(HttpServletRequest req,Model mo) {
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		mdao.insertMenu(name, Integer.parseInt(price));
		return "redirect:/input";
	}
	@GetMapping("/toDelete")
	public String toDelete(Model model) {
		ArrayList<MenuDTO> arMenu = mdao.getMenuList();
		model.addAttribute("arMenu",arMenu);
		return "menudelete";
	}
	@PostMapping("/delete")
	public String doDelete(HttpServletRequest req) {
		String id = req.getParameter("id");
		if ( id==null || id.equals("")) {
			return "redirect:/toDelete";
		}
		mdao.deleteMenu(Integer.parseInt(id));
		return "redirect:/toDelete";
	}
	@GetMapping("/update")
	public String update(Model model) {
		ArrayList<MenuDTO> arMenu = mdao.getMenuList();
		model.addAttribute("arMenu",arMenu);
		return "menuupdate";
	}
	@PostMapping("/modify")
	public String domodify(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		mdao.updateMenu(id,name,price);
		return "redirect:/update";
	}
	@GetMapping("/scoreinput")
	public String score(Model mo) {
		ArrayList<scoreDTO> arScore = mdao.getScoreList();
		mo.addAttribute("arScore",arScore);
		return "scoreinput";
	}
	@PostMapping("/addscore")
	public String addScore(HttpServletRequest req,Model mo) {
		String name = req.getParameter("name");
		int kr = Integer.parseInt(req.getParameter("kr"));
		int en = Integer.parseInt(req.getParameter("en"));
		int mt = Integer.parseInt(req.getParameter("mt"));
		mdao.insertScore(name, kr, en, mt);
		return "redirect:/scoreinput";
	}
	@GetMapping("/toscoreDelete")
	public String toscoreDelete(Model mo) {
		ArrayList<scoreDTO> arScore = mdao.getScoreList();
		mo.addAttribute("arScore",arScore);
		return "scoredelete";
	}
	@PostMapping("/scoredelete")
	public String doscoreDelete(HttpServletRequest req) {
		String sid = req.getParameter("sid");
		if ( sid==null || sid.equals("")) {
			return "redirect:/toscoreDelete";
		}
		mdao.deleteScore(Integer.parseInt(sid));
		return "redirect:/toscoreDelete";
	}
	@GetMapping("/toscoreupdate")
	public String toscoreupdate(Model mo) {
		ArrayList<scoreDTO> arScore = mdao.getScoreList();
		mo.addAttribute("arScore",arScore);
		return "scoreupdate";
	}
	@PostMapping("/scoreupdate")
	public String doscoreupdate(HttpServletRequest req) {
		String id = req.getParameter("sid");
		int kr = Integer.parseInt(req.getParameter("kr"));
		int en = Integer.parseInt(req.getParameter("en"));
		int mt = Integer.parseInt(req.getParameter("mt"));
		if ( id==null || id.equals("")) {
			return "redirect:/toscoreupdate";
		}
		mdao.updateScore(Integer.parseInt(id),kr,en,mt);
		return "redirect:/toscoreupdate";
	}
	@GetMapping("/emplist")
	public String emplist(Model model) {
		ArrayList<EmployeesDTO> arEmp = mdao.getEmpList();
		model.addAttribute("arWorker", arEmp);
		return "employees";
	}
	@GetMapping("/deplist")
	public String deplist(Model model) {
		ArrayList<depDTO> arDep = mdao.getDepList();
		model.addAttribute("arDep", arDep);
		return "deplist";
	}
	@GetMapping("/find")
	public String find() {
		return "find";
	}
	@PostMapping("/search")
	public String search(HttpServletRequest req, Model model) {
		String eid = req.getParameter("eid");
		EmployeesDTO edto = mdao.findWorker(Integer.parseInt(eid));
		model.addAttribute("worker",edto);
		return "result";
	}
	@GetMapping("/cntlist")
	public String cntlist(Model mo) {
		ArrayList<cntDTO> arCnt = mdao.getCntList();
		mo.addAttribute("arCnt",arCnt);
		return "countries";
	}
	@GetMapping("/range")
	public String range() {
		return "range";
	}
	@PostMapping("/showworker")
	public String show(HttpServletRequest req, Model mo) {
		String s1 = req.getParameter("s1");
		String s2 = req.getParameter("s2");
		ArrayList<EmployeesDTO> edto = mdao.ShowWorker(Integer.parseInt(s1),Integer.parseInt(s2));
		mo.addAttribute("salWorker", edto);
		return "show";
	}
	@GetMapping("/findbyname")
	public String findbyname() {
		return "byname";
	}
	@PostMapping("/searchname")
	public String searchame(HttpServletRequest req, Model mo) {
		String sn = req.getParameter("en");
		ArrayList<EmployeesDTO> edto = mdao.getNameList(sn);
		mo.addAttribute("workername",edto);
		return "namelist";
	}
}
