//package com.CaffeWebApp;
//
//import com.CaffeWebApp.repository.OrderNowRepository;
//import com.CaffeWebApp.controller.OrderNowRegister;
//import com.CaffeWebApp.dto.OrderNow;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@WebMvcTest(OrderNowRegister.class)
//public class OrderNowRegisterTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private OrderNowRegister orderNowRegister;
//
//    @MockBean
//    private OrderNowRepository orderNowRepository;
//
//    @Test
//    public void testShowForm() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/registerordernow"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("OrderNow"));
//    }
//
//    @Test
//    public void testSavePerson() throws Exception {
//        // Przykładowa osoba do zapisania
//        OrderNow orderNow = new OrderNow(0L,"Maciek","Nowak","+48 836 245 132","Witam");
//
//        // Symulacja repozytorium
//        Mockito.when(orderNowRepository.save(Mockito.any(OrderNow.class))).thenReturn(orderNow);
//
//        // Żądanie POST do /saveperson z danymi osoby
//        mockMvc.perform(MockMvcRequestBuilders.post("/saveordernow")
//                        .param("firstName", orderNow.getFirstName())
//                        .param("lastName", orderNow.getLastName()))
//                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
//                .andExpect(MockMvcResultMatchers.redirectedUrl("/home"));
//
//        // Poprawne zapisanie osoby
//        Mockito.verify(orderNowRepository, Mockito.times(1)).save(Mockito.any(OrderNow.class));
//    }
//
//    @Test
//    public void testListaPersons() throws Exception {
//        // Przykładowa lista osób
//        List<OrderNow> orderNows = new ArrayList<>();
//        orderNows.add(new OrderNow(0L,"Maciek","Nowak","+48 836 245 132","Witam"));
//        orderNows.add(new OrderNow(1L,"Kuba","Nowakowski","+48 123 231 154","Witam"));
//
//        // Symulacja repozytorium
//        Mockito.when(orderNowRepository.findAll()).thenReturn(orderNows);
//
//        // Żądanie GET do /loggeduserview
//        mockMvc.perform(MockMvcRequestBuilders.get("/loggedaccountview"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("LoggedUserView"))
//                .andExpect(MockMvcResultMatchers.model().attributeExists("orders"));
//
//        // Przekazanie listy osób do modelu
//        Mockito.verify(orderNowRepository, Mockito.times(1)).findAll();
//    }
//}
