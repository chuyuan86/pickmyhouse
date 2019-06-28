package yuan.qu.pickmyhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PickController {

    @RequestMapping(value = "/pick")
    @ResponseBody
    public String pick() {
        return "pick";
    }

}
