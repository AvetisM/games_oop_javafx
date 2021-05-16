package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        Cell source = this.position;
        int size = Math.abs(dest.getX() - source.getX());
        Cell[] steps = new Cell[size];

        if (!isDiagonal(source, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }

        int x = source.getX();
        int y = source.getY();
        int xIncrease = dest.getX() > source.getX() ? 1 : - 1;
        int yIncrease = dest.getY() > source.getY() ? 1 : - 1;

        for (int index = 0; index < size; index++) {
            x = x + xIncrease;
            y = y + yIncrease;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
