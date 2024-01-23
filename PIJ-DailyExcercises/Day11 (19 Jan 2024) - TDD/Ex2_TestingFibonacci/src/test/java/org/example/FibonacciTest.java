package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
@Test
void testFibonacci() {
    int input = 0;
    FibonacciTest fibonacci = new FibonacciTest();
    assertEquals(0, fibonacci.fib(input));
}
