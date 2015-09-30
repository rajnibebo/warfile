/**
 * 
 */
package com.rajni.effectivegenerics;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/**
 * @author rajni.ubhi
 *
 * This class is based on the Delegation Principle.
 */
public class ListStrings {

	public static ListString wrap(final List<String> list) {
		class Random extends AbstractList<String> implements ListString , RandomAccess {

			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return list.get(index);
			}
			@Override
			public String set(int index , String s) {
				return list.set(index, s);
			}
			@Override
			public String remove(int index) {
				return list.remove(index);
			}
			@Override
			public void add(int index , String s) {
				list.add(index, s);
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return list.size();
			}
			
		}
		class Sequential extends AbstractSequentialList<String> implements ListString{

			
			@Override
			public ListIterator<String> listIterator(int index) {
				// TODO Auto-generated method stub
				final ListIterator<String> it = list.listIterator(index);
				
				return new ListIterator<String>() {

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return it.hasNext();
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return it.next();
					}

					@Override
					public boolean hasPrevious() {
						// TODO Auto-generated method stub
						return it.hasPrevious();
					}

					@Override
					public String previous() {
						// TODO Auto-generated method stub
						return it.previous();
					}

					@Override
					public int nextIndex() {
						// TODO Auto-generated method stub
						return it.nextIndex();
					}

					@Override
					public int previousIndex() {
						// TODO Auto-generated method stub
						return it.previousIndex();
					}

					@Override
					public void remove() {
						// TODO Auto-generated method stub
						it.remove();
					}

					@Override
					public void set(String e) {
						// TODO Auto-generated method stub
						it.set(e);
					}

					@Override
					public void add(String e) {
						// TODO Auto-generated method stub
						it.add(e);
					}
				};
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return list.size();
			}
			
		}
		return list instanceof Random ? new Random() : new Sequential();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wrap(Arrays.asList("Rajni","Ubhi")) instanceof ListString);
	}

}
