package web.bean;

import com.jsmartframework.web.annotation.WebBean;

import web.auth.MyAuthBean;
import web.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

@WebBean
public class HomeBean {

    @Autowired
    private SpringService springService;

    @Inject
    private MyAuthBean myAuthBean;

    public String doLogout() {
        myAuthBean.invalidateAuth();
        return "/login";
    }

}
