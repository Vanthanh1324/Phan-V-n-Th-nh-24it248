package OPP2baitap;
	public class Author {
		private String name;
		private String email;
		private char gender;
		public Author(String name,String email,char gender) {
			this.name=name;
			this.email=email;
			if(gender=='m'|| gender=='f') {
				this.gender=gender;
			}else {
				throw new IllegalArgumentException("Gender must be 'm'and'f'");
			}
		}
		public Author(String name,String email) {
			this.name=name;
			this.email=email;
		}
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public char getGender() {
			return gender;
		}
		public String toString() {
				//KET QUA CUA 2.1
			//return "Author[name="+name+","+"email="+email+","+"gender="+gender+"]";
				//KET QUA CUA 2.3
			return "Author[name="+name+","+"email="+email+"]";
		}
		}

