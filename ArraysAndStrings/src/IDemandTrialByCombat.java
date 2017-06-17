import java.util.Scanner;

public class IDemandTrialByCombat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = Integer.parseInt(sc.next());
			int hours = Integer.parseInt(sc.next());
			int l[] = new int[n];
			for (int i = 0; i < n; i++) {
				l[i] = Integer.parseInt(sc.next());
			}
			int intermediate[] = new int[n];
			while (hours-- > 0) {
				for (int i = 0; i < n; i++) {
					if (i == 0) {
						if (l[1] == 1)
							intermediate[0] = 1;
						continue;
					}
					if (i == n - 1) {
						if (l[n - 2] == 1)
							intermediate[i] = 1;
						continue;
					}
					if (l[i - 1] == 1 && l[i + 1] == 1) {
						intermediate[i] = 1;
					}
				}
				for (int i = 0; i < n; i++) {
					l[i] = intermediate[i];
					intermediate[i] = 0;
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.print(l[i] + " ");
			}
			System.out.println();
		}
	}
}
