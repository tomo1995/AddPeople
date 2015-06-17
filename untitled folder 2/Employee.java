package Class;

public class Employee {
	
		
			private String name;
			private String gender;
			private int salary;
			
			//Default constructo.r
			public Employee(String s, String s1, int n) {
				name = s;
				gender = s1;
				salary = n;
			}
			
			public String getName() {
				return name;
			}

			public String getGender() {
				return gender;
			}

			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			
			
	}

