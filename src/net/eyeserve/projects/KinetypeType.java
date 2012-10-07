package net.eyeserve.projects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KinetypeType {
	public void type(Robot r, int i)
	{
		r.keyPress(i);
		r.keyRelease(i);
	}
	
	
	//because fuck you that's why
	//also I hate switches
	public static int charToInt(String s) {
		if(s.equals("a"))
		{
			return KeyEvent.VK_A;
		}
		if(s.equals("b"))
		{
			return KeyEvent.VK_B;
		}
		if(s.equals("c"))
		{
			return KeyEvent.VK_C;
		}
		if(s.equals("d"))
		{
			return KeyEvent.VK_D;
		}
		if(s.equals("e"))
		{
			return KeyEvent.VK_E;
		}
		if(s.equals("f"))
		{
			return KeyEvent.VK_F;
		}
		if(s.equals("g"))
		{
			return KeyEvent.VK_G;
		}
		if(s.equals("h"))
		{
			return KeyEvent.VK_H;
		}
		if(s.equals("i"))
		{
			return KeyEvent.VK_I;
		}
		if(s.equals("j"))
		{
			return KeyEvent.VK_J;
		}
		if(s.equals("k"))
		{
			return KeyEvent.VK_K;
		}
		if(s.equals("l"))
		{
			return KeyEvent.VK_L;
		}
		if(s.equals("m"))
		{
			return KeyEvent.VK_M;
		}
		if(s.equals("n"))
		{
			return KeyEvent.VK_N;
		}
		if(s.equals("o"))
		{
			return KeyEvent.VK_O;
		}
		if(s.equals("p"))
		{
			return KeyEvent.VK_P;
		}
		if(s.equals("q"))
		{
			return KeyEvent.VK_Q;
		}
		if(s.equals("r"))
		{
			return KeyEvent.VK_R;
		}
		if(s.equals("s"))
		{
			return KeyEvent.VK_S;
		}
		if(s.equals("t"))
		{
			return KeyEvent.VK_T;
		}
		if(s.equals("u"))
		{
			return KeyEvent.VK_U;
		}
		if(s.equals("v"))
		{
			return KeyEvent.VK_V;
		}
		if(s.equals("w"))
		{
			return KeyEvent.VK_W;
		}
		if(s.equals("x"))
		{
			return KeyEvent.VK_X;
		}
		if(s.equals("y"))
		{
			return KeyEvent.VK_Y;
		}
		if(s.equals("z"))
		{
			return KeyEvent.VK_Z;
		}
		if(s.equals(" "))
		{
			return KeyEvent.VK_SPACE;
		}
		return 0;
	}
}
