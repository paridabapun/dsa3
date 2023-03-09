package linkedlist1;

/*
 * Access the kth element of LL (K >= 0)
 */
public class LessonQuestion1 {
	public int solve(Node A, int B) {
		Node temp = A;

		for (int i = 0; i < B; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
}
