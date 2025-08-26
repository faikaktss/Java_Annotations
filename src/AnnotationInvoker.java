import java.lang.reflect.Method;

@Databaseconf(url = "http://faikaktas.com",username = "faik",password = "123",port = 3000)
public class AnnotationInvoker {
	public void write() {
		Databaseconf annotation = this.getClass().getAnnotation(Databaseconf.class);
		
		if(annotation != null) {
			System.out.println("URL 	  :"+annotation.url());
			System.out.println("Username  :"+ annotation.username());
			System.out.println("Password  :"+ annotation.password());
			System.out.println("Port      :"+ annotation.port());
		}	
	}
	
	@Birim(boy = "M", kilo = "KG")
	public void write(double boy, double kilo) {
		Method[] methods = this.getClass().getMethods();
		for (Method method : methods) {
			Birim annotation = method.getAnnotation(Birim.class);
			if(annotation!=null) {
				System.out.println("BOY 	:" + boy + " " + annotation.boy());
				System.out.println("KİLO    :" + kilo+ " " + annotation.kilo());
			}
		}
	}
}
