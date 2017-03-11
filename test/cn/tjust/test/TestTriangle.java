package cn.tjust.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import cn.tjust.test.Triangle;

@RunWith(Parameterized.class)
public class TestTriangle {
	private int a;
	private int b;
	private int c;
	private int expected;
	private Triangle tr=null;
	
	public TestTriangle(int a,int b,int c,int expected){
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	@Before
	public void setUp() throws Exception {
		tr = new Triangle();
	}
	@Parameters
	public static Collection<Object[]> getData()
	{
		return Arrays.asList(new Object[][]
				{
			        {0,1,2,0},
			        {-1,2,2,0},
					{1,3,3,2},
					{2,3,4,3},
					{3,3,3,1}

				});	
	}
	@Test
	public void testCase() {
		assertEquals(this.expected, tr.Case(a,b,c));
	}
}
