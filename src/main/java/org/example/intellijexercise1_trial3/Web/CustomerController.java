package org.example.intellijexercise1_trial3.Web;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.example.intellijexercise1_trial3.Entities.Customer;
import org.example.intellijexercise1_trial3.Repositories.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes({"id"})
@Controller
@AllArgsConstructor
public class CustomerController {
    @Autowired
    private Repo rr;

    List<Customer> xx;
    @GetMapping(path = "/Main")
    public String InitialPage(Model model) {
        //xx= rr.initialData();

        model.addAttribute("customers", xx);
        model.addAttribute("customer", new Customer());
        return "Main";
    }
    @PostMapping(path="/empInsert")
    public String AddCustomer(Model model, Customer customer, HttpSession session, ModelMap mm) {
        String em;
        String email=(String)session.getAttribute("id");
        if(email==null) {
            xx.add(customer);
            model.addAttribute("customers", xx);
            return "redirect:Main";
        }
        boolean flag=false;
        for (int i=0;i<xx.size();++i) {
            em=xx.get(i).getCemail();
            if(email.equals(em)) {
                xx.remove(i);
                xx.add(customer);
                flag=true;
                break;
            }
        }
        mm.put("id",null);
        session.removeAttribute("id");
        return "redirect:Main";

    }
}
