package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenSquareFunctionThenSquareResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * (x * x) + 4 * x + 1);
        List<Double> expected = Arrays.asList(71D, 97D, 127D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenCubeFunctionThenCubeResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x, 3));
        List<Double> expected = Arrays.asList(125D, 216D, 343D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenSqrtFunctionThenSqrtResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(9, 10, Math::sqrt);
        List<Double> expected = Arrays.asList(3D);
        assertThat(result).containsAll(expected);
    }

}