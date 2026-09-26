//package Journal.App.service;
//
//import Journal.App.entity.User;
//import Journal.App.repository.UserRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//
//import java.util.ArrayList;
//
//
//import static org.mockito.Mockito.*;
//
////@SpringBootTest
//public class UserDetailsServiceImplTest {
//
//    @InjectMocks
//    UserDetailsServiceImpl userDetailsServiceImpl;
//
//    @Mock
//    UserRepository userRepository;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void loadUserByUsernameTest(){
//        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("ram").password("ram").roles(new ArrayList<>()).build());
//        UserDetails user=userDetailsServiceImpl.loadUserByUsername("ram");
//        Assertions.assertNotNull(user);
//    }
//
//}
