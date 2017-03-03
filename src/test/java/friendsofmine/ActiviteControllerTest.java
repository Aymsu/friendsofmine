package friendsofmine;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by aymer on 28/02/2017.
 */

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest
public class ActiviteControllerTest {

    @MockBean
    private Bootstrap boot;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUser() throws Exception{
        this.mockMvc.perform(get("/activites"))
                .andExpect(status().isOk())
                .andExpect(view().name("activites"))
                .andExpect(content().string(Matchers.containsString("<h1>Activités</h1>")))
                .andDo(print());
    }
}
