package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {


    @org.testng.annotations.Test
    public void shouldCashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCashbackHackService1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCashbackHackService2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }


}