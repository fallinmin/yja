package Chapter5;

public class Car_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int keyCode = 0;
		int speed = 0;
		boolean run = true;
		while(run) {
			System.out.println("KeyCode:"+keyCode);
			if(keyCode!=12&&keyCode!=10) {
				System.out.println("1.가속 2.감속 3.중지");
				System.out.println("선택:");
			}
			keyCode = System.in.read();
			
			if(keyCode==49) {
				speed++;
				System.out.println("속도 ="+speed);
			}else if(keyCode==51) {
				run = false;
			}
		}
	}

}
