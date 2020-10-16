package module03.TASK_02;

import java.util.*;

public class EvenListItrerator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private boolean isNextCalled;
    private boolean isNextValue;

    private Integer nextValue = null;

    public EvenListItrerator(List<Integer> list) {
        Iterator<Integer> listIterator = list.iterator();
        if (listIterator == null)
        {
            throw new RuntimeException("Iterator can't be null!");
        }
        this.iterator = listIterator;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext;

        if (isNextCalled) {
            hasNext = isNextValue;
        } else {
            isNextCalled = true;
            while (hasNext = iterator.hasNext()) {
                Integer number = iterator.next();
                if (number != null && number % 2 == 0) {
                    nextValue = number;
                    break;
                }
            }
            isNextValue = hasNext;
        }

        return hasNext;
    }

    @Override
    public Integer next() {
        Integer returnValue = null;

        if (isNextCalled) {
            isNextCalled = false;
            returnValue = nextValue;
        } else {
            while(iterator.hasNext()) {
                returnValue = iterator.next();
                if (returnValue != null && returnValue % 2 == 0) {
                    break;
                }
            }
        }

        if (returnValue == null) {
            throw new NoSuchElementException();
        }

        return returnValue;
    }

    @Override
    public void remove() {
        iterator.remove();
    }

}
