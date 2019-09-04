/*
 *  Copyright (C) 2013 安泰尔科技有限公司 Corporation
 * All Rights Reserved.
 * 公司网址: www.antair.cn
 */
package com.itedu.web.base.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录页面验证码Servlet类。
 * 
 * <pre>
 * 修改履历
 * -----------------------------------------------------------------------------
 *         VERSION       DATE            BY       CHANGE/COMMENT
 * -----------------------------------------------------------------------------
 *          1.0         2013/10/11      颜廷吉            create
 * -----------------------------------------------------------------------------
 * </pre>
 */
public class ValidateCodeServlet extends HttpServlet {

    /**
     * 登录页面验证码逻辑调用处理。
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @throws ServletException ServletException
     * @throws IOException IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OutputStream outputStream = response.getOutputStream();
        ValidateCodeServletSpport validateCodeServletSpport = new ValidateCodeServletSpport(outputStream);
        String validateImageCode = validateCodeServletSpport.drawCode();
        outputStream.close();

        request.getSession().setAttribute("validateImageCode", validateImageCode);
    }
}
