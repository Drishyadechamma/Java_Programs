package com.atria.day13;

public class T extends Thread{
		Example e;
		T(Example e){
			this.e=e;
		}
		public void run() {
			e.display();
		}

	}


