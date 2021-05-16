package ru.job4j.chess.firuges.black;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        Cell expect = Cell.A3;
        BishopBlack bishopBlack = new BishopBlack(expect);
        Cell result = bishopBlack.position();
        assertTrue(expect == result);
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure copyBishop = bishopBlack.copy(Cell.A3);
        assertTrue(bishopBlack.position() == copyBishop.position());
    }

    @Test
    public void wayTest() {
        Cell[] expect = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        assertArrayEquals(expect, result);
    }

}