package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4 {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100WhenAmount900() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500WhenAmount1500() {
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}
