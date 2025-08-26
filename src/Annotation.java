
public class Annotation {
	public static void main(String[] args) {
		
		
//		AnnotationInvoker annotationInvoker = new AnnotationInvoker();
//		
//		Class<?> clazz = annotationInvoker.getClass();
//		
//		Databaseconf annotation = clazz.getAnnotation(Databaseconf.class);
//		if(annotation != null) {
//			System.out.println("URL 	  :"+annotation.url());
//			System.out.println("Username  :"+ annotation.username());
//			System.out.println("Password  :"+ annotation.password());
//			System.out.println("Port      :"+ annotation.port());
//		}
		
		AnnotationInvoker annotationInvoker = new AnnotationInvoker();
		annotationInvoker.write();
	
	}
}
