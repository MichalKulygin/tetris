package com.epam.prejap.tetris.block;

import com.epam.prejap.tetris.game.Color;

/**
 * New block with rotated image of other block.
 *
 * @author Michał Kułygin
 */
class RotatedBlock extends Block {

    RotatedBlock(byte[][] dots, Color color) {
        super(dots, color);
    }
}
