package iteratorpattern;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2022/4/28 13:37
 * @Version 1.0
 * 表示集合的接口
 */
public interface Aggregate {
	public abstract Iterator iterator(); //获取迭代器
}
