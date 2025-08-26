import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) //Çalışma zamanında anatasyona erişebilmemizi sağlar
@Target({ElementType.TYPE, ElementType.METHOD}) // Oluşturduğumuz anatasyonun nerede kullanılacağını gösterir
public @interface Databaseconf { //Interface'in başına @ koyduğumuzda bu bir anatasyon oldu
	String url();
	String username();
	String password();
	int port();
}
