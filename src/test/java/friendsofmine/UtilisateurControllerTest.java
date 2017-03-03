package friendsofmine;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class UtilisateurControllerTest {

    @Autowired
    private Bootstrap boot;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUser() throws Exception{
        this.mockMvc.perform(get("/utilisateurs"))
                .andExpect(status().isOk())
                .andExpect(view().name("utilisateurs"))
                .andExpect(content().string(Matchers.containsString("<h1>Utilisateurs</h1>")))
                .andDo(print());
    }
}