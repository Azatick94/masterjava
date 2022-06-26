package ru.javaops.masterjava.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MatrixUtilTest {

    @DisplayName("SingleThreadMultiply")
    @Test
    public void singleThreadMultiply() {

        int[][] arr1 = {{4, 2}, {9, 0}};

        int[][] arr2 = {{3, 1}, {-3, 4}};

        int[][] result = MatrixUtil.singleThreadMultiply(arr1, arr2);
        int[][] expected = {{6, 12}, {27, 9}};

        Assertions.assertArrayEquals(result, expected);
    }
}