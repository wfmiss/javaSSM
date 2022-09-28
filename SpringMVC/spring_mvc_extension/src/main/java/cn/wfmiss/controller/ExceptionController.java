package cn.wfmiss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-26  19:57
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

//将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {
    //设置要处理的异常信息
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex,Model model){
        //ex表示控制器方法所出现的异常
        model.addAttribute("ex",ex);
        return "error";
    }
}
