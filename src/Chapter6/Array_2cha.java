package Chapter6;

public class Array_2cha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {{95, 86},
				{83,92,96},
				{78,83,93,87,88}};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int i= 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println(array[i].length);
				sum +=array[i][j];
				count++;
			}
		}
		avg = sum/count;
		System.out.println("sum:" +sum);
		System.out.println("avg; "+avg);
	}

}