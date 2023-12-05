package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		char kindClass;
		String title;
		String url;
		String description;
		int duration = 0;
		int questionNumbers = 0;
		int qtdTotalDuration = 0;
	
		System.out.print("Quantas aulas tem o curso? ");
		int qtdClass = sc.nextInt();
		sc.nextLine();
		
		List<Lesson> lessons = new ArrayList<>();
		for(int i = 0; i<qtdClass; i++)
		{
			System.out.printf("\nDados da %da aula:%n",i+1);
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			kindClass = sc.next().charAt(0);

			if(kindClass == 'c')
			{
				System.out.print("Título: ");
				title = sc.nextLine();
				sc.next();
				
				System.out.print("URL do vídeo: ");
				url = sc.nextLine();
				sc.next();
				
				System.out.print("Duração em segundos: ");
				duration = sc.nextInt();
				sc.nextLine();
				
				lessons.add(new Video(title,url,duration));
			}
			if(kindClass == 't')
			{
				System.out.print("Título: ");
				title = sc.nextLine();
				sc.next();
				
				System.out.print("Descrição: ");
				description = sc.nextLine();
				sc.next();
				
				System.out.print("Quantidade de questões: ");
				questionNumbers = sc.nextInt();
				sc.nextLine();
				
				lessons.add(new Task(title,description,questionNumbers));
			}
		}
		sc.close();
		
		for(Lesson lesson : lessons) {
			qtdTotalDuration = qtdTotalDuration + lesson.duration();
		}
		
		System.out.printf("%nDURAÇÃO TOTAL DO CURSO = %d segundos", qtdTotalDuration);

	}

}
