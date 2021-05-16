package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class LogicTest {

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        logic.add(bishopBlack);
        logic.move(Cell.C1, Cell.G5);
    }

}