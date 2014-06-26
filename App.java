package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App
{

	public App()
	{
		// TODO Auto-generated constructor stub
	}

	public void insertIntoMongo()
	{
		Email email = new Email();

		email.setMessageId( "1" );
		email.setSubject( "Please Join Meeting" );
		email.setBody( "Agenda: RFP discussion" );
		email.setZipcode( 560085 );
		email.setFrom( new Contact( "a", "Amresh", "Singh", "xamry@gmail.com" ) );

		email.addTo( new Contact( "b", "Vivek", "Mishra", "mevivs@gmail.com" ) );
		email.addTo( new Contact( "c", "Saurabh", "Singh", "saurabh@gmail.com" ) );

		email.addAttachment( new Attachment( "aaa", "Agenda.doc", "MS Word" ) );
		email.addAttachment( new Attachment( "bbb", "MOM_Last_Meeting.xls", "MS Excel" ) );
		email.addAttachment( new Attachment( "ccc", "Client_Feedback.txt", "Text" ) );

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "ac" );
		EntityManager em = emf.createEntityManager();
		em.persist( email );

		em.close();

		emf.close();
		System.out.println( "All done" );
	}

	public static void main( String[] args )
	{
		App app = new App();
		app.insertIntoMongo();
	}
}
