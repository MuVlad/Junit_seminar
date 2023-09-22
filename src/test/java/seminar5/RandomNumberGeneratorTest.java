package seminar5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberGeneratorTest {
    @Test
    public void testGenerateNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        List<Integer> numbers = generator.generateNumbers(10);

        assertNotNull(numbers); // проверяем не пустой ли список
        assertEquals(10, numbers.size()); // проверяем что наш размер списка равен 10 элементам
    }
}