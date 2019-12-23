package alexrm84.testPattern.controllers;

import alexrm84.testPattern.entities.InfoMSG;
import alexrm84.testPattern.services.InfoMSGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/info")
public class InfoController {

    private InfoMSGService infoMSGService;

    @Autowired
    public void setInfoMSGService(InfoMSGService infoMSGService) {
        this.infoMSGService = infoMSGService;
    }

    @GetMapping("/getInfo")
    public  String getInfo(Model model){
        List<InfoMSG> infoMSGList = infoMSGService.findAll();
        model.addAttribute("infoMSGList", infoMSGList);
        return "allHistory";
    }

}
