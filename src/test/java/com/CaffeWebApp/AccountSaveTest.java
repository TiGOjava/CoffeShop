//package com.CaffeWebApp;
//
//import com.CaffeWebApp.controller.AccountSave;
//import com.CaffeWebApp.dto.Account;
//import com.CaffeWebApp.repository.AccountRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.Optional;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(AccountSave.class)
//@AutoConfigureMockMvc
//public class AccountSaveTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private AccountRepository accountRepository;
//
//    @Test
//    public void testAuthenticateAccount() throws Exception {
//        // Przykładowy test autentykacji
//        Mockito.when(accountRepository.findByLogin("Maciek"))
//                .thenReturn(Optional.of(new Account(0L,"Maciek","Nowak","maciek@gmail.com","Maciek","Maciek123"))); // Zmodyfikuj hash hasła
//        mockMvc.perform(post("/authenticateAccount")
//                        .param("login", "Maciek")
//                        .param("password", "Maciek123"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/LoggedUserView"));
//
//        // Test z błędnym hasłem
//        Mockito.when(accountRepository.findByLogin("Maciek"))
//                .thenReturn(Optional.of(new Account(0L,"Maciek","Nowak","maciek@gmail.com","Maciek","Maciek123"))); // Zmodyfikuj hash błędnego hasła
//        mockMvc.perform(post("/authenticateAccount")
//                        .param("login", "Maciek")
//                        .param("password", "Maciek11111"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/signin"))
//                .andExpect(model().attributeExists("Podano błędne hasło"));
//
//        // Test braku konta
//        Mockito.when(accountRepository.findByLogin("Maciek11111"))
//                .thenReturn(Optional.empty());
//        mockMvc.perform(post("/authenticateAccount")
//                        .param("login", "Maciek1111")
//                        .param("password", "Maciekpassword"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/signin"))
//                .andExpect(model().attributeExists("Konto o podanym loginie nie istnieje"));
//    }
//}
