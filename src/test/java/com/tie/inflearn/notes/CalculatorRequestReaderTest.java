package com.tie.inflearn.notes;

import com.tie.inflearn.notes.CalculatorRequest;
import com.tie.inflearn.notes.CalculatorRequestReader;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorRequestReaderTest {

    @Test
    public void System_in으로_데이터를_읽어들일_수_있다() {
        // given
        CalculatorRequestReader calculatorRequestReader = new CalculatorRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculatorRequest result = calculatorRequestReader.read();

        // then
        assertEquals(2, result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals(3, result.getNum2());
    }

}