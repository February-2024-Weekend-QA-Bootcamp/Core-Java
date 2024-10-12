package lec25_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E01_UseOfSet {

	// How to write an array
	// int [] age = new int [6];

	// This below 2 line is a very very important interview question.
	// question: difference between Set and List
	// Set doesn't allow duplicate data, but List allows
	// Set doesn't follow ordering, but List follow order

	// Set is a member of Collection framework, where we deal with multiple data type or generic data type
	// Why HashSet here? not "new Set<String>()"
	Set <String> set = new HashSet<String>();
	// type of variable use here, line 18 - is String
	// set is the name of object
	// Here Set is an interface, that's why it needs the help of a concrete class HashSet which implements Set
	// (HashSet) to instantiate
	// Interface can't instantiate themselves
}
