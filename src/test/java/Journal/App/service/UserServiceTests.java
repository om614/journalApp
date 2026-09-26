//package Journal.App.service;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.AssertionsKt.assertNotNull;
//
//
//@SpringBootTest
//public class UserServiceTests {
//
//    @Autowired
//    private UserService userService;
//
//    @ParameterizedTest
//    @ValueSource(strings={
//            "ram",
//            "shyam",
//            "om"
//    })
//    public void testFindByUserName(String name) {
//        assertNotNull(userService.findByUsername(name));
//    }
//
//    //by this you can check multiple values in the method using csv
//    @ParameterizedTest
//    @CsvSource({
//            "1,2,3",
//            "3,4,5"
//    })
//    public void test(int a,int b,int expected){
//        assertEquals(expected,a+b);
//    }
//
//}
