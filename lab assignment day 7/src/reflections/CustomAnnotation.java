package reflections;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Target(value = {ElementType.CONSTRUCTOR, ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String name() default "unknown";
}

@Target(value = {ElementType.CONSTRUCTOR, ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Version {
	double number();
}

@Author(name = "Johny")
@Version(number = 1.0)
class AnnotatedClass {
	
	@Author(name="non-parametrized")
	@Version(number=1.0)
	public AnnotatedClass() {
		System.out.println("non-parametrized constructor");
	}
	
	@Author(name="parametrized")	
	@Version(number=1.5)
	public AnnotatedClass(String str) {
		System.out.println("hello "+str+" this is a parametrized constructor");
	}
	
	@Author(name = "Author1")
	@Version(number = 2.0f)
	public void annotatedMethod1() {}
	
	@Author(name = "Author2")
	@Version(number = 4.0)
	public void annotatedMethod2() {}
}

@Author(name="rk")
class Test {
	
}

@Author(name="sub rk")
class ExtendedTest {
	
}

public class CustomAnnotation {
	
	public static void main(String[] args) {
		try {
			System.out.println("----- Annonated Class -----");
			Class<?> clazz=Class.forName("reflections.AnnotatedClass");
			System.out.println();
			
			System.out.println("----- Method annotations -----");
			Method[] methods=clazz.getMethods();
			readAnnotations(methods);
			System.out.println();
			
			System.out.println("----- Constructor annotations -----");
			Constructor<?>[] constructors=clazz.getConstructors();
			readAnnotations(constructors);
			System.out.println();
			
			System.out.println("----- class annotations -----");
			readAnnotations(clazz);
			System.out.println();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("----- Test class annotations -----");
			Class<?> clazz=Class.forName("reflections.Test");
			readAnnotations(clazz);
			System.out.println();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void readAnnotations(Class<?> clazz) {
		Annotation[] annotations=clazz.getAnnotations();
		for(Annotation annotation:annotations) {
			
			if(annotation instanceof Author) {
				Author author=(Author) annotation;
				System.out.println("author: "+ author.name());
			}
			
			if(annotation instanceof Version) {
				Version version=(Version) annotation;
				System.out.println("author: "+ version.number());
			}
			
			System.out.println();
		}
	}

	private static void readAnnotations(Constructor<?>[] constructors) {
		for(Constructor<?> constructor:constructors) {
			
			if(constructor.isAnnotationPresent(Author.class)) {
				Author author=constructor.getAnnotation(Author.class);
				System.out.println("author: "+author.name());
			}
			
			if(constructor.isAnnotationPresent(Version.class)) {
				Version version=constructor.getAnnotation(Version.class);
				System.out.println("version: "+version.number());
			}
		}
	}

	private static void readAnnotations(Method[] methods) {
		for(Method method:methods) {
			
			if(method.isAnnotationPresent(Author.class)) {
				Author author=method.getAnnotation(Author.class);
				System.out.println("author: "+author.name());
			}
			
			if(method.isAnnotationPresent(Version.class)) {
				Version version=method.getAnnotation(Version.class);
				System.out.println("version: "+version.number());
			}
		}
	}
}
