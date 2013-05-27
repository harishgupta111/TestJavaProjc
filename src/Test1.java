
public class Test1 {

	private String p1;
	
	private String p2;
	private String p3;
	private String p4;

	public static class Test1Builder{
		
		private String p1;
		private String p2;
		private String p3;
		private String p4;
		
		
		public Test1Builder(String p1, String p2){
			this.p1=p1;
			this.p2=p2;
		}
		public Test1Builder p3(String p3){
			p3=p3;
			return this;
		}
		public Test1Builder p4(String p4){
			p4=p4;
			return this;
		}
		public Test1 build(){
			return new Test1(this);
		}
	}
	
	public Test1(Test1Builder builder){
		p1=builder.p1;
		p2=builder.p2;
		p3=builder.p3;
		p4=builder.p4;
	}
	
	
}
