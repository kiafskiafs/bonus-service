import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldFindBonuses(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();
        //int expected = 1;
        int actual = (int) service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}