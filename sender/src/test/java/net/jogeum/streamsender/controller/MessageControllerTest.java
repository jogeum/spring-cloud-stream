package net.jogeum.streamsender.controller;

import net.jogeum.streamsender.StreamSenderApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author jogeum
 * @since 18/09/2019
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StreamSenderApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageControllerTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void hi() throws Exception {
        //given

        //when
        String testUrl = "/messages";
        ResultActions result = mockMvc.perform(
                get(testUrl)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("name", "jogeum")
                        .param("message", "say hello !!")
        );

        //then
        result.andExpect(status().isOk())
                .andDo(print())
                .andReturn();
    }
}
