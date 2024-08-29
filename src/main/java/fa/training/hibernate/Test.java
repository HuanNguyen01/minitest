package fa.training.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	public static void main(String[] args) {
		Transaction transaction = null;
		try (Session session = DBUtils.getSessionFactory().openSession()){
			transaction = session.beginTransaction();

			transaction.commit();
			System.out.println("User saved succsess 0ohbj");
		} catch (Exception e) {
			if (transaction != null) {
				System.out.println("Transaction is being rolled back.");
				transaction.rollback();
			}
		}
	}

}
