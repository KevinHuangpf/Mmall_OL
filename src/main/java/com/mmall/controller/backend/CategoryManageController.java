package com.mmall.controller.backend;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpSession;

/**
 * Created by KevinHuang on 2019/3/9.
 */

@Controller
@RequestMapping("manager/category")
public class CategoryManageController {

    @Autowired
    private IUserService iUserService;

    public ServerResponse addCategory(HttpSession session, String categoryName, @RequestParam(value = "parentId",defaultValue = "0") int parentId ){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户为登录，请登录");
        }

        // 校验一下是否是管理员
        if(iUserService.checkAdminRole(user).isSuccess()){
            // 是管理员增加处理逻辑

        }else {
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }

        return null;


    }
}
