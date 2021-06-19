package com.epam.prejap.tetris.block;

/**
 * Class with methods (rotateBlockCW, <s>rotateBlockCCW</s>) that provides new Block with rotated image of block passed as an argument.
 * <br>CCW rotation will be implemented as a next feature.</>
 *
 * @author MKgn
 */
public class BlockRotator {

    /**
     * Method rotates block clock-wise.
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
                rotatedBlockImage[j][rotatedBlockCols - 1 - i] = block.image[i][j];
            }
        }

        return new RotatedBlock(rotatedBlockImage);
    }
}
