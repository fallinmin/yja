package Chapter7;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		String str = "ABCDEF";
		for(int i =0; i<str.length(); i++) {
			list.add(str.substring(i,i+1));
		}//list.add(index ��, �Է°�)
		for(String s : list) { //for���� ���� ��ü���  for:each �� �迭��� ������
		    System.out.println(s);
		}	
		System.out.println(list.get(0));	
		list.remove(1);  //index 1 ����
		list.clear();  //��� �� ����
	}


}
