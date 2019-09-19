
public class GitHub {
	public static void main (String args[]) {
	int array[]= {1,4,5,3,7,8};
	System.out.println("COUNT:");
	System.out.println(getCount(array));
	System.out.println("MIN:");
	System.out.println(getMin(array));
	}

public static int getCount(int [] array) {
	int count=0;
	for (int i=0; i<array.length;i++){
	count=count+1;
	}
	return count;
}
public static int getMin(int [] array) {
	if (array.length==0) {
		return 0;
	}
	int min=array[0];
	for (int i=1; i<array.length;i++) {
		if (array[i]<min) {
			min=array[i];
			}
		}
		return min;
	}

}
