// Pair.java
// Philip Johnson
// Aggregate (non-generic) pairs of arbitrary objects
// adapted from Mughal Ch. 8

public final class Pair {
private final Object first, second;
  
// construct a Pair object
public Pair(Object one, Object two) {
first = one;
second = two;
}
  
// return the first constituent object
public Object getFirst() { return first; }
  
// return the second constituent object
public Object getSecond() { return second; }
  
// return true if the pair of objects are identical
@Override
public boolean equals(Object other) {
boolean result;
if (this == other)
result = true;
else if (! (other instanceof Pair))
result = false;
else {
Pair otherPair = (Pair) other;
result = first.equals(otherPair.first) && second.equals(otherPair.second);
}
return result;
}
  
// return hash code for the aggregate pair
@Override
public int hashCode() {
// XOR hash codes to create a hashcode for the pair
// if the objects are equal, use one hashcode, otherwise
// the XOR result (and subsequent hashCode value) is 0.
return first.equals(second) ? first.hashCode() : first.hashCode() ^ second.hashCode();
}
  
// return textual representation of aggregated object
@Override
public String toString() {
return "[" + first + ", " + second + "]";
}
}

