public class PileOfBooks {
    private Book[] pile;
    private int numberOfBooks = 0;
    private final int DEFAULT_CAPACITY = 50;

    // constructors
    public PileOfBooks() {
        pile = new Book[DEFAULT_CAPACITY];
    }

    public PileOfBooks(int initialCapacity) {
        pile = new Book[initialCapacity];
    }

    public int getCurrentSize() {
        return numberOfBooks;
    }

    public boolean isEmpty() {
        for (Book i : pile) {
            if (i != null) {
                return false;
            }
        }
        return true;
    }

    public void add(Book newBook) {
        if (isArrayFull()) {
            doubleCapacity();
        }
        pile[numberOfBooks] = newBook;
        numberOfBooks++;
    }

    public Book getTopBook() {
        if(numberOfBooks == 0) {
            throw new ArrayStoreException("Array is empty");
        }
        return pile[numberOfBooks - 1];
    }

    public Book removeTopBook() {
        if(numberOfBooks == 0) {
            throw new ArrayStoreException("Array is empty");
        }
        numberOfBooks--;
        Book tempBook = pile[numberOfBooks];
        pile[numberOfBooks] = null;
        return tempBook;
    }

    public void clear() {
        while(!isEmpty()) {
            removeTopBook();
        }
    }

    private boolean isArrayFull() {
        if (pile[pile.length - 1] == null) {
            return false;
        }
        return true;
    }

    private void doubleCapacity() {
        int doublePileLength = pile.length * 2;
        Book[] tempArray = new Book[doublePileLength];
        for (int i = 0; i < pile.length; i++) {
            tempArray[i] = pile[i];
        }
        pile = tempArray;
    }

    public Book[] toArray() {
        Book[] tempArray = new Book[numberOfBooks];
        for (int i = 0; i < numberOfBooks; i++) {
            tempArray[i] = pile[i];
        }
        return tempArray;
    }

    public boolean contains(Book b) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (pile[i].equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int getFrequencyOf(Book b) {
        int count = 0;
        for (int i = 0; i < numberOfBooks; i++) {
            if (pile[i].equals(b)) {
                count++;
            }
        }
        return count;
    }
}