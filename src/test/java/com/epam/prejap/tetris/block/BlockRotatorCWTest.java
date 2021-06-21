package com.epam.prejap.tetris.block;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.prejap.tetris.block.BlockRotator.*;
import static org.testng.Assert.assertEquals;

/**
 * Tests for rotating blocks clockwise.
 *
 * @author Michał Kułygin
 */
@Test(groups = "blockRotatorCW")
public class BlockRotatorCWTest {

    private final TBlock tBlock = new TBlock();
    private Block tBlockRotatedCW;
    private Block tBlockRotatedCW2Times;
    private Block tBlockRotatedCW3Times;
    private Block tBlockRotatedCW4Times;

    @BeforeTest
    public void initializeRotatedBlocks() {
        tBlockRotatedCW = rotateBlockCW(tBlock);
        tBlockRotatedCW2Times = rotateBlockCW(tBlockRotatedCW);
        tBlockRotatedCW3Times = rotateBlockCW(tBlockRotatedCW2Times);
        tBlockRotatedCW4Times = rotateBlockCW(tBlockRotatedCW3Times);
    }

    public void num_of_cols_of_rotatedCW_TBlock_should_be_equal_to_num_of_rows_of_TBlock() {
        int actualRows = tBlock.rows();
        int expectedRows = tBlockRotatedCW.cols();

        assertEquals(actualRows, expectedRows);
    }

    public void num_of_rows_of_rotatedCW_TBlock_should_be_equal_to_num_of_cols_of_TBlock() {
        int actualRows = tBlock.rows();
        int expectedRows = tBlockRotatedCW.cols();

        assertEquals(actualRows, expectedRows);
    }

    @Test(dataProvider = "dotsRepresentationForRotatedCW_TBlock")
    public void dotAtRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {

        int actual = tBlockRotatedCW.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @Test(dataProvider = "dotsRepresentationFor2TimesRotatedCW_TBlock")
    public void dotAt_2xRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {
        int actual = tBlockRotatedCW2Times.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @Test(dataProvider = "dotsRepresentationFor3TimesRotatedCW_TBlock")
    public void dotAt_3xRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {
        int actual = tBlockRotatedCW3Times.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @Test(dataProvider = "dotsRepresentationFor4TimesRotatedCW_TBlock")
    public void dotAt_4xRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {
        int actual = tBlockRotatedCW4Times.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @DataProvider
    public static Object[][] dotsRepresentationForRotatedCW_TBlock() {
        return new Object[][]{
                {0, 0, 0, "Incorrect dotAt(0, 0)"},
                {0, 1, 1, "Incorrect dotAt(0, 1)"},
                {1, 0, 1, "Incorrect dotAt(1, 0)"},
                {1, 1, 1, "Incorrect dotAt(1, 1)"},
                {2, 0, 0, "Incorrect dotAt(2, 0)"},
                {2, 1, 1, "Incorrect dotAt(2, 1)"},
        };
    }

    @DataProvider
    public static Object[][] dotsRepresentationFor2TimesRotatedCW_TBlock() {
        return new Object[][]{
                {0, 0, 0, "Incorrect dotAt(0, 0)"},
                {0, 1, 1, "Incorrect dotAt(0, 1)"},
                {0, 2, 0, "Incorrect dotAt(0, 2)"},
                {1, 0, 1, "Incorrect dotAt(1, 0)"},
                {1, 1, 1, "Incorrect dotAt(1, 1)"},
                {1, 2, 1, "Incorrect dotAt(1, 2)"},
        };
    }

    @DataProvider
    public static Object[][] dotsRepresentationFor3TimesRotatedCW_TBlock() {
        return new Object[][]{
                {0, 0, 1, "Incorrect dotAt(0, 0)"},
                {0, 1, 0, "Incorrect dotAt(0, 1)"},
                {1, 0, 1, "Incorrect dotAt(1, 0)"},
                {1, 1, 1, "Incorrect dotAt(1, 1)"},
                {2, 0, 1, "Incorrect dotAt(2, 0)"},
                {2, 1, 0, "Incorrect dotAt(2, 1)"},
        };
    }

    @DataProvider
    public static Object[][] dotsRepresentationFor4TimesRotatedCW_TBlock() {
        return new Object[][]{
                {0, 0, 1, "Incorrect dotAt(0, 0)"},
                {0, 1, 1, "Incorrect dotAt(0, 1)"},
                {0, 2, 1, "Incorrect dotAt(0, 2)"},
                {1, 0, 0, "Incorrect dotAt(1, 0)"},
                {1, 1, 1, "Incorrect dotAt(1, 1)"},
                {1, 2, 0, "Incorrect dotAt(1, 2)"},
        };
    }
}
