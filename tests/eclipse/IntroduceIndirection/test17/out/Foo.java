package p;

import java.util.Collection;
import java.util.LinkedList;

public class Foo {
	/**
	 * @param <A>
	 * @param xs
	 * @return
	 */
	public static <A extends Comparable<A>> A bar(Collection<A> xs) {
		return /*///Foo.*/foo(xs);
	}

	public static <A extends Comparable<A>> A foo(Collection<A> xs) {
		return null;
	}

	{
		LinkedList<Long> list = new LinkedList<Long>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		/*///Foo.*/bar(list);
		/*///Foo.*/bar(list2); // <-- invoke here
	}
}
