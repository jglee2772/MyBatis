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
	public String input() {
		return "menuinput";
	}
	@PostMapping("/insert")
	public String doInsert(HttpServletRequest req,Model mo) {
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		mdao.insertMenu(name, Integer.parseInt(price));
		
		ArrayList<MenuDTO> arMenu = mdao.getMenuList();
		mo.addAttribute("arMenu",arMenu);
		return "menulist";
	}
	@GetMapping("/scorelist")
	public String scorelist(Model mo) {
		ArrayList<scoreDTO> arScore = mdao.getScoreList();
		mo.addAttribute("arScore",arScore);
		return "scorelist";
	}
	@GetMapping("/score")
	public String score() {
		return "scoreinput";
	}
	@PostMapping("/addscore")
	public String addScore(HttpServletRequest req,Model mo) {
		String name = req.getParameter("name");
		int kr = Integer.parseInt(req.getParameter("kr"));
		int en = Integer.parseInt(req.getParameter("en"));
		int mt = Integer.parseInt(req.getParameter("mt"));
		mdao.insertScore(name, kr, en, mt);
		
//		ArrayList<scoreDTO> arScore = mdao.getScoreList();
//		mo.addAttribute("arScore",arScore);
		return "redirect:/scorelist";
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
