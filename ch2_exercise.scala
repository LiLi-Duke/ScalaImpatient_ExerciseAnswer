/**
 * Chapter 2. Exercise 
 */

// Q1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero

def signum(x: Double) : Int = {
	val result = if (x>0) 1 else if (x<0) -1 else 0
	result
}


// Q2. What is the value of an empty block expression {}? What is its type?
// Type: Unit  Value: ()


// Q3. 	Come up with one situation where the assignment x = y = 1 is valid in Scala.


// Q4. 
for (i <- 10 to (0, -1)) println(i) 

// Q5.
def countdown(n: Int) = {
	for (i <- n to (0, -1)) println(i)
}

// Q6.
def UnicodeProduct(s: String) : BigInt = {
	var prod = 1
	for (i <- s) prod *= i
	prod
}

// Q7. 
def UnicodeProduct2(s: String) : BigInt = {
	var prod = 1
	s.foreach((c:Char) => prod *= c)
	prod
}









