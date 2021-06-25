package com.epam.prejap.tetris.block;

/**
 * Rotates an image of a given block.
 * @see #rotateBlockCW(Block)
 * @see #rotateBlockCCW(Block)
 * @author Michał Kułygin
 */
public class BlockRotator {

    /**
     * Rotates an image of a given block in clockwise direction.
     *
     * @param block which user wish to rotate.
     * @return new Block with rotated image of original one.
     */
    public static Block rotateBlockCW(Block block) {

        int rotatedBlockCols = block.rows();
        int rotatedBlockRows = block.cols();

        byte[][] rotatedBlockImage = new byte[rotatedBlockRows][rotatedBlockCols];

        for (int i = 0; i < rotatedBlockCols; i++) {
            for (int j = 0; j < rotatedBlockRows; j++) {
                rotatedBlockImage[j][rotatedBlockCols - 1 - i] = block.dotAt(i, j);
            }
        }

        return new RotatedBlock(rotatedBlockImage, block.color());
    }

    /**
     * Rotates an image of a given block in counter-clockwise direction.
     *
     * @param block which user wish to rotate.
     * @return new Block with rotated image of original one.
     */
    public static Block rotateBlockCCW(Block block) {
        int rotatedBlockRows = block.rows();
        int rotatedBlockCols = block.cols();

        byte[][] imageOfRotatedBlock = new byte[rotatedBlockCols][rotatedBlockRows];

        for (int i = 0; i < rotatedBlockCols; i++) {
            for (int j = 0; j < rotatedBlockRows; j++) {
                imageOfRotatedBlock[i][j] = block.dotAt(j, rotatedBlockCols - i - 1);
            }
        }
        return new RotatedBlock(imageOfRotatedBlock, block.color());
    }
}
