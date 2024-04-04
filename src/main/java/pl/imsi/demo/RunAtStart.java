package pl.imsi.demo;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.ManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Set;

@Component
public class RunAtStart {
    private final AccountsRepository accountsRepository;
    private final AuthorsRepository authorsRepository;
    private final BooksRepository booksRepository;
    private final BooksUsersRepository booksUsersRepository;
    private final GenresRepository genresRepository;
    private final KeywordsRepository keywordsRepository;
    private final NewsRepository newsRepository;
    private final PublisherRepository publisherRepository;
    private final SeriesRepository seriesRepository;
    private final UserDataRepository userDataRepository;

    @Autowired
    public RunAtStart(AccountsRepository accountsRepository, AuthorsRepository authorsRepository, BooksRepository booksRepository, BooksUsersRepository booksUsersRepository, GenresRepository genresRepository, KeywordsRepository keywordsRepository, NewsRepository newsRepository, PublisherRepository publisherRepository, SeriesRepository seriesRepository, UserDataRepository userDataRepository) {
        this.accountsRepository = accountsRepository;
        this.authorsRepository = authorsRepository;
        this.booksRepository = booksRepository;
        this.booksUsersRepository = booksUsersRepository;
        this.genresRepository = genresRepository;
        this.keywordsRepository = keywordsRepository;
        this.newsRepository = newsRepository;
        this.publisherRepository = publisherRepository;
        this.seriesRepository = seriesRepository;
        this.userDataRepository = userDataRepository;
    }

    @PostConstruct
    public void runAtStart(){
        Books books = new Books();
        books.setName("123");
        books.setImage("123");
        books.setIsbn("123-4565");
        books.setPlace("up");
        books.setQuantity(3);
        books.setReleaseDate(1234);
        books.setTome(1);

        Genres genres = new Genres();
        genres.setName("123");
        genresRepository.saveAll(Arrays.asList(genres));
        books.setBooksGenres(Arrays.asList(genres));

        booksRepository.saveAll(Arrays.asList(books));

    }
}
