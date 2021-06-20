package com.epam.prejap.tetris.block;

/**
 * Tests for rotating blocks counter-clockwise.
 *
 * @author Michał Kułygin
 */

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.prejap.tetris.block.BlockRotator.rotateBlockCCW;
import static org.testng.Assert.assertEquals;

@Test(groups = "blockRotatorCCW")
public class BlockRotatorCCWTest {

    private final TBlock tBlock = new TBlock();
    private Block tBlockRotatedCCW;
    private Block tBlockRotatedCCW2Times;
    private Block tBlockRotatedCCW3Times;
    private Block tBlockRotatedCCW4Times;

    @BeforeTest
    public void initializeRotatedBlocks() {
        tBlockRotatedCCW = rotateBlockCCW(tBlock);
        tBlockRotatedCCW2Times = rotateBlockCCW(tBlockRotatedCCW);
        tBlockRotatedCCW3Times = rotateBlockCCW(tBlockRotatedCCW2Times);
        tBlockRotatedCCW4Times = rotateBlockCCW(tBlockRotatedCCW3Times);
    }

    public void num_of_cols_of_rotatedCW_TBlock_should_be_equal_to_num_of_rows_of_TBlock() {
        int actualRows = tBlock.rows();
        int expectedRows = tBlockRotatedCCW.cols();

        assertEquals(actualRows, expectedRows);
    }

    public void num_of_rows_of_rotatedCW_TBlock_should_be_equal_to_num_of_cols_of_TBlock() {
        int actualRows = tBlock.rows();
        int expectedRows = tBlockRotatedCCW.cols();

        assertEquals(actualRows, expectedRows);
    }

    @Test(dataProvider = "dotsRepresentationForRotatedCCW_TBlock")
    public void dotAtRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {

        int actual = tBlockRotatedCCW.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @Test(dataProvider = "dotsRepresentationFor2TimesRotatedCCW_TBlock")
    public void dotAt_2xRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {
        int actual = tBlockRotatedCCW2Times.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @Test(dataProvider = "dotsRepresentationFor3TimesRotatedCCW_TBlock")
    public void dotAt_3xRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {
        int actual = tBlockRotatedCCW3Times.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @Test(dataProvider = "dotsRepresentationFor4TimesRotatedCCW_TBlock")
    public void dotAt_4xRotatedCW_TBlockReturnCorrectValue(int i, int j, int expected, String message) {
        int actual = tBlockRotatedCCW4Times.dotAt(i, j);
        assertEquals(actual, expected, message);
    }

    @DataProvider
    public static Object[][] dotsRepresentationForRotatedCCW_TBlock() {
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
    public static Object[][] dotsRepresentationFor2TimesRotatedCCW_TBlock() {
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
    public static Object[][] dotsRepresentationFor3TimesRotatedCCW_TBlock() {
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
    public static Object[][] dotsRepresentationFor4TimesRotatedCCW_TBlock() {
        return new Object[][]{
                {0, 0, 1, "Incorrect dotAt(0, 0)"},
                {0, 1, 1, "Incorrect dotAt(0, 1)"},
                {0, 2, 1, "Incorrect dotAt(1, 0)"},
                {1, 0, 0, "Incorrect dotAt(1, 1)"},
                {1, 1, 1, "Incorrect dotAt(2, 0)"},
                {1, 2, 0, "Incorrect dotAt(2, 1)"},
        };
    }
}
