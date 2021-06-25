package com.epam.prejap.tetris.block;

import com.epam.prejap.tetris.logger.Logger;
import com.epam.prejap.tetris.game.Color;

/**
 * Implements H shaped block
 * @author Slawomir Kucab
 * @see com.epam.prejap.tetris.game.Printer#print(int)
 */
final class HBlock extends Block{
    private static final Logger LOGGER = Logger.getLogger(HBlock.class);

    /**
     * Byte array represents "H" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *       # #
     *       ###
     *       # #
     *  -------------------
     */
    private static final byte[][] IMAGE = {
            {1, 0, 1},
            {1, 1, 1},
            {1, 0, 1}
    };
    public HBlock(){
        super(IMAGE, Color.CYAN);
        LOGGER.trace("{} was created", getClass().getSimpleName());
    }
}
