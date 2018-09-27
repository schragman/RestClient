package restClient;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

@SessionScoped
@Named
public class FormHome implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Book book;
	private String bookTitle;
	private long bookId;

	public long getBookId() {
		return bookId;
	}


	public void setBookId(long bookId) {
		this.bookId = bookId;
	}


	public void doCallBook(ActionEvent pvEvent) {
		Client client = ClientBuilder.newClient();
		book = client.target("http://localhost:8080/ReferenceII/rest/books/2").request().get(Book.class);
		bookTitle = book.getTitle();
	}


	public String getBookTitle() {

		return (book == null) ? "Bitte gültige Id angeben" : bookTitle;

	}
}
