package review01;

public class Human {

		int Height;
		int Weight;
		String Sex;
		String name;
		int old;
		
		Human(){}
		
		Human(int Height, int Weight, String Sex, String name, int old){
			this.Height = Height;
			this.Weight = Weight;
			this.Sex = Sex;
			this.name = name;
			this.old = old;
		}
		
		public String showInfo() {
			return name +" is " + Height +"cm "+ Weight +"kg "+ old +"years old "+ Sex;
		}
		
}
