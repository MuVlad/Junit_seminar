package seminar5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {
    @Test
    public void testIntegration() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        MaxNumberFinder finder = new MaxNumberFinder();

        // Генерируем список из 100 случайных чисел
        List<Integer> numbers = generator.generateNumbers(100);

        // Находим максимальное число в списке
        int max = finder.findMax(numbers);

        // Проверяем, что максимальное число действительно находится в списке
        assertTrue(numbers.contains(max));
    }
}
