public class SortedArrayToBST {

	public static void main(String[] args) {
		System.out.println("Hello Kushal");
		SortedArrayToBST s = new SortedArrayToBST();
		System.out.println(s.sqrt(5));

	}

	public int sqrt(int x) {
		
		if (x <= 1)
			return x;
		
			int start = 0;
			int end = x;
			int half;
			while (end-start>1) {
				half = start + (end-start) / 2;
				if(half*half==x) return half;
				else if((half*half)>x)
					end=half;
				else{
					start=half;
				}
			}
	
			return start;
//		if (x <= 1)
			
//			return x;
//
//		int left = 0, right = x, mid;
//
//		while ((right - left) > 1) {
//			mid = left + (right - left) / 2;
//
//			if (mid == x / mid)
//				return mid;
//			else if (x / mid < mid)
//				right = mid;
//			else
//				left = mid;
//		}
//
//		return left;

	}

	public class Solution {
		public TreeNode sortedArrayToBST(int[] num) {
			if (num.length == 0)
				return null;
			return mySort(0, num.length - 1, num);
		}
	}

	public TreeNode mySort(int start, int end, int[] arr) {

		if (start == end) {
			TreeNode head = new TreeNode(arr[start]);
			return head;
		}
		int half = (start + end) / 2;
		TreeNode head = new TreeNode(arr[half]);

		head.right = mySort(half + 1, end, arr);
		if (half != start) {
			head.left = mySort(start, half - 1, arr);
		}
		return head;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}

/*
 * 0 1 2 3 4
 */