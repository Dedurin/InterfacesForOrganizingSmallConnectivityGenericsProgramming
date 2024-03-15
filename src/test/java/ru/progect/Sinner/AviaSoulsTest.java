package ru.progect.Sinner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AviaSoulsTest {

    @Test
    public void testSearchMultipleTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 5000, 8, 12);
        Ticket ticket2 = new Ticket("Москва", "Санкт-Петербург", 5200, 10, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);

        Ticket[] expected = {ticket1, ticket2};
        Ticket[] result = aviaSouls.search("Москва", "Санкт-Петербург");

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchSingleTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket = new Ticket("Казань", "Сочи", 3500, 9, 15);
        aviaSouls.add(ticket);

        Ticket[] expected = {ticket};
        Ticket[] result = aviaSouls.search("Казань", "Сочи");

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchNoTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Екатеринбург", "Новосибирск", 4500, 11, 18);
        Ticket ticket2 = new Ticket("Красноярск", "Владивосток", 6000, 13, 20);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);

        Ticket[] expected = {};
        Ticket[] result = aviaSouls.search("Москва", "Санкт-Петербург");

        assertArrayEquals(expected, result);
    }
}