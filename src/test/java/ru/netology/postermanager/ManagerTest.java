package ru.netology.postermanager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    @Test
    public void test(){
        Manager manager = new Manager();
        manager.add("Gentlemen");
        manager.add("Number one");
        manager.add("Hotel");
        String[] expected = {"Gentlemen", "Number one","Hotel"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }
    @Test
    public void test2() {
        Manager manager = new Manager(10);
        manager.add("Gentlemen");
        manager.add("Number one");
        manager.add("Hotel");
        String[] expected = {"Hotel", "Number one", "Gentlemen"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void test3(){
        Manager manager = new Manager(5);
        manager.add("Gentlemen");
        manager.add("Number one");
        manager.add("Hotel");
        manager.add("Forward");
        manager.add("Trolls");
        manager.add("Avatar");


        String[] expected = {"Avatar","Trolls","Forward","Hotel","Number one"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }
}
