package cn.tjust.test;

public class Triangle{
	public int Case(int a,int b,int c){
		if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a)
			return 0;//����������
		else {
			if(a==b&&a==c&&b==c)
				return 1;//�ȱ�
			else if(a==b||b==c||a==c)
				return 2;//����
			else
				return 3;//���ȱ�
		}
	}
}