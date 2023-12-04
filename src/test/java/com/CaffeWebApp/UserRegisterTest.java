//package com.CaffeWebApp;
//
//import com.CaffeWebApp.controller.UserRegister;
//import com.CaffeWebApp.dto.Account;
//import com.CaffeWebApp.repository.AccountRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//
//@WebMvcTest(UserRegister.class)
//public class UserRegisterTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private UserRegister userRegister;
//
//    @MockBean
//    private AccountRepository accountRepository;
//
//    @Test
//    public void testShowRegistrationForm() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/registercart"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("ARP"));
//    }
//
//    @Test
//    public void testRegisterUser() throws Exception {
//
//        // Przykładowy użytkownik do zarejestrowania
//        Account account = new Account(0L,"Maciek","Nowak","maciek@gmail.com","Maciek","Maciek123");
//
//        // Symulacja repozytorium
//        Mockito.when(accountRepository.save(Mockito.any(Account.class))).thenReturn(account);
//
//        // Żądanie POST do /registeruser z danymi użytkownika
//        mockMvc.perform(MockMvcRequestBuilders.post("/registeruser")
//                        .param("login", account.getLogin())
//                        .param("password", account.getPassword()))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("ALP"));
//
//        // Zaszyfrowanie hasła
//        Mockito.verify(accountRepository, Mockito.times(1)).save(Mockito.any(Account.class));
//        Mockito.verify(accountRepository, Mockito.times(1)).save(Mockito.argThat(savedAccount ->
//                savedAccount.getPassword().startsWith("$2a$")));
//    }
//}
