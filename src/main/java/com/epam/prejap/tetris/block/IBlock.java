package com.epam.prejap.tetris.block;

import com.epam.prejap.tetris.logger.Logger;
import com.epam.prejap.tetris.game.Color;

/**
 *  It creates I block of tetris
 *
 * @author Kanybek Mukalaev
 * @see BlockFeed
 * @see Block
 */
final class IBlock extends Block {
    private static final Logger LOGGER = Logger.getLogger(IBlock.class);

    /**
     * Byte array represents "I" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *       #
     *       #
     *       #
     *       #
     *  -------------------
     */
    private static final byte [][] IMAGE = {
            {1},
            {1},
            {1},
            {1},
    };
    public IBlock(){
        super(IMAGE, Color.PURPLE);
        LOGGER.trace("{} was created", getClass().getSimpleName());
    }
}
