package seminar5.first_integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserServiceTest {
    UserRepository mockRepository;
    UserService service;

    @BeforeEach
    void setUp() {
        mockRepository = Mockito.mock(UserRepository.class); // создаем заглушка
        service = new UserService(mockRepository);
    }

    @Test
    void getUserName() {
        service.getUserName(1);
        // проверяем что метод нашей заглучшки был вызван
        Mockito.verify(mockRepository, Mockito.times(1)).getUserById(1);

    }
}