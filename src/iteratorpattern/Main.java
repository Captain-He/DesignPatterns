package iteratorpattern;

import org.junit.Test;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2022/4/28 13:52
 * @Version 1.0
 */
public class Main {
	@Test
	public void test(){
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("a"));
		bookShelf.appendBook(new Book("b"));
		bookShelf.appendBook(new Book("c"));
		bookShelf.appendBook(new Book("d"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
