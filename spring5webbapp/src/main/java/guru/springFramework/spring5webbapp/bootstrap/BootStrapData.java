package guru.springFramework.spring5webbapp.bootstrap;


import guru.springFramework.spring5webbapp.domain.Author;
import guru.springFramework.spring5webbapp.domain.Book;
import guru.springFramework.spring5webbapp.domain.Publisher;
import guru.springFramework.spring5webbapp.repositories.AuthorRepository;
import guru.springFramework.spring5webbapp.repositories.BookRepository;
import guru.springFramework.spring5webbapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author adri = new Author("Adriana", "Guerrasio");
        Book jjj = new Book("Learning spring","123456");
        adri.getBooks().add(jjj);
        jjj.getAuthor().add(adri);

        authorRepository.save(adri);
        bookRepository.save(jjj);

        Author eric = new Author("Eric", "Evans");
        Book jee= new Book("Learning J2EE","9876543");

        eric.getBooks().add(jee);
        jee.getAuthor().add(eric);


        authorRepository.save(eric);
        bookRepository.save(jee);

        Publisher pub = new Publisher("Sudamerican","Nazca 150","Buenos Aires","1417");
        publisherRepository.save(pub);

        jee.setPublisher(pub);
        pub.getBooks().add(jee);
        publisherRepository.save(pub);

        Publisher pub2 = new Publisher("Planeta","Nazca 150","Buenos Aires","1417");
        publisherRepository.save(pub2);

        jjj.setPublisher(pub2);
        pub2.getBooks().add(jjj);
        publisherRepository.save(pub2);


        System.out.println("Aprendiendo Java");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.count() );
        System.out.println("Publisher books: " + pub.getBooks().size());
    }
}
