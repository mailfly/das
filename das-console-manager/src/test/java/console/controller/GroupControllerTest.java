package com.ppdai.platform.das.console.controller;

import com.alibaba.fastjson.JSONObject;
import com.ppdai.platform.das.console.common.interceptor.CommStatusInterceptor;
import com.ppdai.platform.das.console.common.interceptor.permissions.UserLoginInterceptor;
import com.ppdai.platform.das.console.constant.Message;
import com.ppdai.platform.das.console.dao.*;
import com.ppdai.platform.das.console.dto.entry.das.DasGroup;
import com.ppdai.platform.das.console.dto.model.Paging;
import com.ppdai.platform.das.console.service.GroupService;
import com.ppdai.platform.das.console.service.PermissionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebMvcTest(GroupController.class)
public class GroupControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private UserLoginInterceptor userLoginInterceptor;

    @MockBean
    private CommStatusInterceptor commStatusInterceptor;

    @MockBean
    private GroupService groupService;

    @MockBean
    private GroupDao groupDao;

    @MockBean
    private Message message;

    @MockBean
    private ProjectDao projectDao;

    @MockBean
    private DataBaseDao dataBaseDao;

    @MockBean
    private LoginUserDao lLoginUserDao;

    @MockBean
    private DatabaseSetDao databaseSetDao;

    @MockBean
    private UserGroupDao userGroupDao;

    @MockBean
    private PermissionService permissionService;

    private MockMvc mockMvc;
    private String requestJson;

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); //初始化MockMvc对象
        requestJson = JSONObject.toJSONString(DasGroup.builder().id(1L).group_name("name").build());
    }

    @Test
    public void tree() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/group/tree")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getMemberGroups() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/group/member/tree")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getUserGroups() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/group/userGroups")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getAllGroup() throws Exception {
        Paging<DasGroup> paging = new Paging<>();
        paging.setData(new DasGroup());
        String requestJson = JSONObject.toJSONString(paging);
        mockMvc.perform(MockMvcRequestBuilders.post("/group/list")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(requestJson)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void add() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/group/add")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(requestJson)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void update() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/group/update")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(requestJson)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void delete() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/group/delete")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(requestJson)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void sync() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/group/sync")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("id", "1")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

}
