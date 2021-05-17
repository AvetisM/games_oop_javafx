package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        Cell expect = Cell.A3;
        BishopBlack bishopBlack = new BishopBlack(expect);
        Cell result = bishopBlack.position();
        assertEquals(expect, result);
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure copyBishop = bishopBlack.copy(Cell.A7);
        assertEquals(Cell.A7, copyBishop.position());
    }

    @Test
    public void wayTest() {
        Cell[] expect = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        assertArrayEquals(expect, result);
    }

    @Test
    public void isDiagonalTest() {
        Cell dest = Cell.H6;
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }

    @Test
    public void isNotDiagonalTest() {
        Cell dest = Cell.H2;
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }
}