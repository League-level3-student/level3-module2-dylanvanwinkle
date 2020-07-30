package _02_More_Algorithms;

public class IsPrime {
public Boolean isPrime(int n) {
	for (int i = 2; i < n; i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
};
}
