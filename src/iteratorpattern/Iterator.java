package iteratorpattern;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2022/4/28 13:39
 * @Version 1.0
 * 自定义遍历集合元素的迭代器接口
 */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next(); //获取下一个元素
}
