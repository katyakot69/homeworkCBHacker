package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn100() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }


}