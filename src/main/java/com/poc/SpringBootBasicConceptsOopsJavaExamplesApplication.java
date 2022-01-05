package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poc.encapsulation.Employee;
import com.poc.inheritance.Horse;
import com.poc.polymorphism.Animal;
import com.poc.polymorphism.Hello;
import com.poc.polymorphism.Tiger;

@SpringBootApplication
public class SpringBootBasicConceptsOopsJavaExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicConceptsOopsJavaExamplesApplication.class, args);

		System.out.println("============================================");
		System.out.println("1- Exemple d'encapsulation **********");
		Employee employee = new Employee();
		// ici, la classe principale peut accéder aux données de la classe Employé
		// uniquement en passant par le getter et le setter.
		employee.setId(10);
		employee.setName("Darvin");
		System.out.println("ID is === " + employee.getId());
		System.out.println("Name is === " + employee.getName());

		System.out.println("============================================");
		System.out.println("2- Exemple d'héritage **********");
		Horse h = new Horse();
		// ici, la classe Horse peut accéder à la méthode m1() de la classe Animal
		h.m1();

		System.out.println("============================================");
		System.out.println("2a- Bénéfice d'héritage **********");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println(e1.equals(e2));
		
		System.out.println("============================================");
		System.out.println("3a- Exemple de polymorphisme au moment de la compilation - Method Overloading **********");
		Hello h1 = new Hello();
		h1.m1();
		h1.m1("Darvin");
		
		System.out.println("3b- Exemple de polymorphisme au moment d'exécution - Method Overriding **********");
		Animal a = new Tiger();
		// "a" est un type d'objet de Tigre et de type de référence d'Animal (liaison dynamique).
		a.m1();
	}

}
