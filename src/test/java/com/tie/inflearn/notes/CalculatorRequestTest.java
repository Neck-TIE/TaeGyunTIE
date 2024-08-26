package com.tie.inflearn.notes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorRequestTest {

    @Test
    public void 유효한_숫자를_파싱할_수_있다() {
        // given
        String[] parts = new String[]{"2", "+", "3"};

        // when
        CalculatorRequest calculatorRequest = new CalculatorRequest(parts);

        // given
        assertEquals(2, calculatorRequest.getNum1());
        assertEquals("+", calculatorRequest.getOperator());
        assertEquals(3, calculatorRequest.getNum2());
    }

    @Test
    public void 세자리_숫자로_넘어가는_유효한_숫자를_파싱할_수_있다() {
        // given
        String[] parts = new String[]{"232", "+", "3"};

        // when
        CalculatorRequest calculatorRequest = new CalculatorRequest(parts);

        // given
        assertEquals(232, calculatorRequest.getNum1());
        assertEquals("+", calculatorRequest.getOperator());
        assertEquals(3, calculatorRequest.getNum2());
    }

    @Test
    public void 유효한_길이의_숫자가_들어오지_않으면_에러를_던진다() {
        // given
        String[] parts = new String[]{"232", "+"};

        // when
        // given
        assertThrows(
                BadRequestException.class,
                () -> new CalculatorRequest(parts)
        );
    }

    @Test
    public void 유효하지_않은_연산자가_들어오면_에러를_던진다() {
        // given
        String[] parts = new String[]{"232", "x", "2"};

        // when
        // given
        assertThrows(
                InvalidOperatorException.class,
                () -> new CalculatorRequest(parts)
        );
    }

    @Test
    public void 유효하지_않은_길이의_연산자가_들어오면_에러를_던진다() {
        // given
        String[] parts = new String[]{"232", "+-", "2"};

        // when
        // given
        assertThrows(
                InvalidOperatorException.class,
                () -> new CalculatorRequest(parts)
        );
    }

}