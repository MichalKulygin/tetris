package com.epam.prejap.tetris.block;

import com.epam.prejap.tetris.logger.Logger;
import com.epam.prejap.tetris.game.Color;

/**
 * @author Nikita Pochapynskyi
 */
final class SBlock extends Block {
    private static final Logger LOGGER = Logger.getLogger(SBlock.class);
    /**
     * Byte array represents "S" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *       ##
     *      ##
     *  -------------------
     */
    private static final byte[][] S_IMAGE = {
            {0, 1, 1},
            {1, 1, 0}
    };

    SBlock() {
        super(S_IMAGE, Color.BLUE);
        LOGGER.trace("{} was created", getClass().getSimpleName());
    }
}
