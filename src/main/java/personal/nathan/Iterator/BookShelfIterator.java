package personal.nathan.Iterator;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/4.
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf= bookShelf;
        this.index = 0;
    }


    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    public Object next() {
        return bookShelf.getBookAt(index ++);
    }
}
