package day20_Generic;

/*
 * 泛型接口：把泛型定义在接口上
 */
public interface Inter<T> {
	public abstract void show(T t);
}