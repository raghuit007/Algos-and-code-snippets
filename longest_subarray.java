
  class Longest_subarrray
				{
					// Returns length of smallest subarray with sum greater than x.
					// If there is no subarray with given sum, then returns n+1
					int smallestSubWithSum(int arr[], int n, int x) 
					{
						// Initialize current sum and minimum length
						int curr_sum = 0, max_len = 0;

						// Initialize starting and ending indexes
						int start = 0, end = 0;
						while (end < n) 
						{
							// Keep adding array elements while current sum
							// is smaller than x
							while (curr_sum <= x && end < n)
								curr_sum += arr[end++];
							if (end - start > max_len)
								max_len = end - start;

							// If current sum becomes greater than x.
							while (curr_sum > x && start < n) 
							{
								// Update minimum length if needed
								

								// remove starting elements
								curr_sum -= arr[start++];
							}
						}
						return max_len-1;
					}

					// Driver program to test above functions
					public static void main(String[] args) {
						Longest_subarrray array_sum = new Longest_subarrray();
						int arr1[] = {3,1,2,3};
						int x = 4;
						int n1 = arr1.length;
						System.out.println(array_sum.smallestSubWithSum(arr1, n1, x));

						
					}
				}

				
;
		
