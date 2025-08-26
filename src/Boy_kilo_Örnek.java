import java.util.Scanner;
public class Boy_kilo_Örnek {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Boyunuzu giriniz: ");
			double boy = scanner.nextDouble();
			
			System.out.println("Kilonuzu giriniz: ");
			double kilo = scanner.nextDouble();
			
			AnnotationInvoker annotationInvoker = new AnnotationInvoker();
			annotationInvoker.write(boy, kilo);
		}
}
