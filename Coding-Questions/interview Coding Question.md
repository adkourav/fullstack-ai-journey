# Java Interview Coding Questions

Each code block is a separate, runnable Java program. Save a block using the same name as its `public class` (for example, `ReverseStringSolution.java`). The dry runs use the sample values shown in each `main` method.

## 1. Reverse a String

### Idea

`StringBuilder` provides a direct way to reverse a string. Strings are immutable in Java, so the reversed value is a new string; the original remains unchanged.

### Solution

```java
public class ReverseStringSolution {
	public static String reverse(String text) {
		return new StringBuilder(text).reverse().toString();
	}

	public static void main(String[] args) {
		String input = "hello";
		System.out.println(reverse(input)); // olleh
	}
}
```

### Dry run: `"hello"`

| Step | Operation | Result |
|---|---|---|
| 1 | Start with the input | `hello` |
| 2 | Reverse the characters | `olleh` |
| 3 | Convert the builder back to a string | `olleh` |

**Complexity:** $O(n)$ time and $O(n)$ extra space for the output.

**Interview note:** This assumes `text` is not `null`. For input containing complex Unicode characters made from multiple code points, discuss whether the interviewer expects reversal by UTF-16 `char`, Unicode code point, or user-perceived character (grapheme).

## 2. Check Whether a String or Number Is a Palindrome

A palindrome reads the same forward and backward. The string version below ignores letter case and non-alphanumeric characters. The integer version compares digits without converting the number to a string.

### Solution

```java
public class PalindromeSolution {
	public static boolean isStringPalindrome(String text) {
		if (text == null) {
			return false;
		}

		int left = 0;
		int right = text.length() - 1;

		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
				right--;
			}

			char leftChar = Character.toLowerCase(text.charAt(left));
			char rightChar = Character.toLowerCase(text.charAt(right));
			if (leftChar != rightChar) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static boolean isNumberPalindrome(int number) {
		if (number < 0 || (number % 10 == 0 && number != 0)) {
			return false;
		}

		int reversedHalf = 0;
		while (number > reversedHalf) {
			reversedHalf = reversedHalf * 10 + number % 10;
			number /= 10;
		}

		// Even digit count: halves match. Odd digit count: ignore the middle digit.
		return number == reversedHalf || number == reversedHalf / 10;
	}

	public static void main(String[] args) {
		System.out.println(isStringPalindrome("A man, a plan, a canal: Panama")); // true
		System.out.println(isNumberPalindrome(12321)); // true
		System.out.println(isNumberPalindrome(12345)); // false
	}
}
```

### Dry run: string `"A man, a plan, a canal: Panama"`

The two pointers skip spaces and punctuation, then compare letters without case:

| Comparison | Left | Right | Result |
|---|---|---|---|
| 1 | `a` | `a` | match |
| 2 | `m` | `m` | match |
| 3 | `a` | `a` | match |
| ... | Continue inward | Continue inward | All compared characters match |

The method returns `true`.

### Dry run: number `12321`

| Iteration | `number` before | Last digit added | `reversedHalf` after | `number` after |
|---|---:|---:|---:|---:|
| 1 | 12321 | 1 | 1 | 1232 |
| 2 | 1232 | 2 | 12 | 123 |
| 3 | 123 | 3 | 123 | 12 |

The loop stops because `number` (12) is no longer greater than `reversedHalf` (123). Since the original digit count is odd, discard the middle digit: `123 / 10 = 12`. The halves match, so the answer is `true`.

**Complexity:** String check: $O(n)$ time and $O(1)$ extra space. Number check: $O(d)$ time and $O(1)$ extra space, where $d$ is the number of digits.

**Edge cases:** Negative integers are not palindromes here. A positive number ending in zero is not a palindrome; `0` itself is.

## 3. Fibonacci Series: Iterative and Recursive

The sequence starts with `0, 1`; every next value is the sum of the previous two. Both methods below return the Fibonacci value at index `n` (`F(0) = 0`, `F(1) = 1`).

### Solution

```java
public class FibonacciSolution {
	public static long fibonacciIterative(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be non-negative");
		}
		if (n <= 1) {
			return n;
		}

		long previous = 0;
		long current = 1;
		for (int index = 2; index <= n; index++) {
			long next = previous + current;
			previous = current;
			current = next;
		}
		return current;
	}

	public static long fibonacciRecursive(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be non-negative");
		}
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fibonacciIterative(n)); // 8
		System.out.println(fibonacciRecursive(n)); // 8
	}
}
```

### Dry run: iterative `F(6)`

Initialize `previous = 0` and `current = 1`.

| Index | `next = previous + current` | New `previous` | New `current` |
|---:|---:|---:|---:|
| 2 | 1 | 1 | 1 |
| 3 | 2 | 1 | 2 |
| 4 | 3 | 2 | 3 |
| 5 | 5 | 3 | 5 |
| 6 | 8 | 5 | 8 |

Return `8`.

### Dry run: recursive `F(4)`

The recursive rule is `F(n) = F(n - 1) + F(n - 2)`:

```text
F(4)
= F(3) + F(2)
= (F(2) + F(1)) + (F(1) + F(0))
= ((1 + 0) + 1) + (1 + 0)
= 3
```

**Complexity:** Iterative: $O(n)$ time and $O(1)$ extra space. Simple recursive: $O(2^n)$ time and $O(n)$ call-stack space because it recalculates the same values many times.

**Interview note:** The simple recursive version demonstrates recursion but is inefficient for large `n`. A memoized recursive version improves it to $O(n)$ time and $O(n)$ space. `long` overflows after `F(92)`.

## 4. Factorial: Iterative and Recursive

For a non-negative integer `n`, `n! = n * (n - 1) * ... * 1`, and `0! = 1`.

### Solution

```java
public class FactorialSolution {
	public static long factorialIterative(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be non-negative");
		}

		long result = 1;
		for (int value = 2; value <= n; value++) {
			result *= value;
		}
		return result;
	}

	public static long factorialRecursive(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be non-negative");
		}
		if (n <= 1) {
			return 1;
		}
		return n * factorialRecursive(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorialIterative(n)); // 120
		System.out.println(factorialRecursive(n)); // 120
	}
}
```

### Dry run: iterative `5!`

Start with `result = 1`.

| `value` | Calculation | `result` |
|---:|---|---:|
| 2 | `1 * 2` | 2 |
| 3 | `2 * 3` | 6 |
| 4 | `6 * 4` | 24 |
| 5 | `24 * 5` | 120 |

Return `120`.

### Dry run: recursive `4!`

```text
factorial(4)
= 4 * factorial(3)
= 4 * 3 * factorial(2)
= 4 * 3 * 2 * factorial(1)
= 4 * 3 * 2 * 1
= 24
```

**Complexity:** Both methods take $O(n)$ time. Iterative uses $O(1)$ extra space; recursive uses $O(n)$ call-stack space.

**Edge cases:** `factorial(0)` and `factorial(1)` return `1`; negative input is rejected. A `long` can safely hold factorials only through `20!`; `21!` overflows.

## 5. Prime Check and Print Primes in a Range

A prime is an integer greater than `1` with exactly two positive divisors: `1` and itself. To check `n`, it is enough to test possible divisors up to its square root.

### Solution

```java
public class PrimeNumberSolution {
	public static boolean isPrime(long number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}

		for (long divisor = 3; divisor <= number / divisor; divisor += 2) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printPrimesInRange(long start, long end) {
		if (start > end) {
			System.out.println("No primes (start is greater than end).");
			return;
		}

		boolean foundPrime = false;
		long number = start;
		while (true) {
			if (isPrime(number)) {
				if (foundPrime) {
					System.out.print(", ");
				}
				System.out.print(number);
				foundPrime = true;
			}
			if (number == end) {
				break;
			}
			number++;
		}

		if (!foundPrime) {
			System.out.print("No primes");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(isPrime(29)); // true
		printPrimesInRange(10, 30); // 11, 13, 17, 19, 23, 29
	}
}
```

### Dry run: `isPrime(29)`

`29` is greater than `2` and is odd. Test odd divisors while `divisor <= 29 / divisor`:

| Divisor | `29 % divisor` | Decision |
|---:|---:|---|
| 3 | 2 | Not divisible |
| 5 | 4 | Not divisible; next divisor would exceed the square-root limit |

No divisor was found, so `29` is prime.

### Dry run: print primes from `10` through `30`

Check each integer in the inclusive range. Values below `2` would be rejected; here, the prime checks succeed at `11`, `13`, `17`, `19`, `23`, and `29`. The method prints:

```text
11, 13, 17, 19, 23, 29
```

**Complexity:** A single primality check takes $O(\sqrt{n})$ time and $O(1)$ extra space. Printing a range of `k` values by checking each number takes up to $O(k\sqrt{end})$ time and $O(1)$ extra space.

**Edge cases:** Numbers less than `2` are not prime. The range endpoints are included; if `start > end`, the method reports no primes.

## 6. Armstrong Number and Perfect Number

An **Armstrong number** (also called a narcissistic number) equals the sum of each digit raised to the number of digits. For example, `153 = 1^3 + 5^3 + 3^3`.

A **perfect number** equals the sum of its positive proper divisors (divisors excluding the number itself). For example, `6 = 1 + 2 + 3`.

### Solution

```java
public class ArmstrongPerfectNumberSolution {
	public static boolean isArmstrong(int number) {
		if (number < 0) {
			return false;
		}

		int digits = String.valueOf(number).length();
		int remaining = number;
		long sum = 0;

		while (remaining > 0) {
			int digit = remaining % 10;
			sum += integerPower(digit, digits);
			remaining /= 10;
		}

		// For zero, the loop does not run; its digit-power sum is zero.
		return sum == number;
	}

	private static long integerPower(int base, int exponent) {
		long result = 1;
		for (int count = 0; count < exponent; count++) {
			result *= base;
		}
		return result;
	}

	public static boolean isPerfect(int number) {
		if (number <= 1) {
			return false;
		}

		long divisorSum = 1;
		for (int divisor = 2; divisor <= number / divisor; divisor++) {
			if (number % divisor == 0) {
				divisorSum += divisor;
				int pairedDivisor = number / divisor;
				if (pairedDivisor != divisor) {
					divisorSum += pairedDivisor;
				}
			}
		}
		return divisorSum == number;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153)); // true
		System.out.println(isArmstrong(123)); // false
		System.out.println(isPerfect(6)); // true
		System.out.println(isPerfect(12)); // false
	}
}
```

### Dry run: Armstrong number `153`

There are 3 digits, so raise each digit to the third power:

| Digit | Calculation | Running sum |
|---:|---|---:|
| 3 | `3^3 = 27` | 27 |
| 5 | `5^3 = 125` | 152 |
| 1 | `1^3 = 1` | 153 |

The sum equals the original number, so `153` is an Armstrong number.

### Dry run: perfect number `6`

Start with `divisorSum = 1`, since `1` is a proper divisor of every positive number greater than `1`.

| Candidate divisor | Pair | Add to sum | New sum |
|---:|---:|---|---:|
| 2 | `6 / 2 = 3` | `2 + 3` | 6 |

The loop only checks divisors up to the square root, and the paired divisor avoids scanning the upper half. The sum equals `6`, so `6` is perfect.

**Complexity:** Armstrong check: $O(d^2)$ time with the repeated-multiplication helper and $O(1)$ extra space, where `d` is the digit count. Perfect number check: $O(\sqrt{n})$ time and $O(1)$ extra space.

**Edge cases:** Negative numbers are not Armstrong numbers in this definition. `0` is an Armstrong number because it has one digit and its digit-power sum is `0`. Numbers less than or equal to `1` are not perfect. The Armstrong implementation accepts `int` values and uses `long` for its sum.

## Quick Interview Review

- Explain the input constraints and special cases before coding.
- State the time and space complexity after walking through the algorithm.
- For recursion questions, identify the base case and explain what happens for `n = 0` or `n = 1`.
- Mention numeric overflow: Java integer types have fixed limits, so larger constraints may require `BigInteger` or explicit overflow handling.
- Test a normal input, a boundary input, and a negative or invalid input where relevant.
