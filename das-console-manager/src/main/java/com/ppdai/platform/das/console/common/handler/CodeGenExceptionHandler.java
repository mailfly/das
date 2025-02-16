package com.ppdai.platform.das.console.common.handler;

import com.ppdai.platform.das.console.common.exceptions.InitCheckException;
import com.ppdai.platform.das.console.common.exceptions.ValidataException;
import com.ppdai.platform.das.console.common.utils.StringUtil;
import com.ppdai.platform.das.console.dto.model.ServiceResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@Slf4j
@ControllerAdvice
public class CodeGenExceptionHandler {

    private Object exeute(HttpServletRequest reqest, HttpServletResponse response, Exception e) {
        log.error(StringUtil.getMessage(e), e);
        //if (isAjax(reqest)) {
            String exMsg = StringUtil.getMessage(e);
            if (e instanceof InvocationTargetException && exMsg == null) {
                exMsg = ((InvocationTargetException) e).getTargetException().getMessage();
            }
            if (exMsg == null) {
                exMsg = e.toString();
            }
            return ServiceResult.fail(exMsg);
       /* } else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/err/500/index.html");
            return modelAndView;
        }*/
    }

    @ExceptionHandler(value = {Exception.class, Throwable.class})
    @ResponseBody
    public Object errorExceptionThrowableHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e) throws Exception {
        return exeute(reqest, response, e);
    }

    @ExceptionHandler(value = SQLException.class)
    @ResponseBody
    public Object errorExceptionHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e) throws Exception {
        return exeute(reqest, response, e);
    }

    @ExceptionHandler(value = ValidataException.class)
    @ResponseBody
    public Object errorValidataExceptionHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e) throws Exception {
        return exeute(reqest, response, e);
    }

    @ExceptionHandler(value = InitCheckException.class)
    @ResponseBody
    public Object errorInitCheckExceptionHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("init/init.html");
        return modelAndView;
    }

    /**
     * 判断是否是ajax请求 TODO
     */
    public static boolean isAjax(HttpServletRequest request) {
        return request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
    }
}
