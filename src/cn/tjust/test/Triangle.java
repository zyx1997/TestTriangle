package cn.tjust.test;

public class Triangle{
	public int Case(int a,int b,int c){
		if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a)
			return 0;//不是三角形
		else {
			if(a==b&&a==c&&b==c)
				return 1;//等边
			else if(a==b||b==c||a==c)
				return 2;//等腰
			else
				return 3;//不等边
		}
	}
}