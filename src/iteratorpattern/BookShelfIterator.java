package iteratorpattern;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2022/4/28 13:48
 * @Version 1.0
 */
public class BookShelfIterator implements Iterator{
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength())
			return true;
		else return false;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
