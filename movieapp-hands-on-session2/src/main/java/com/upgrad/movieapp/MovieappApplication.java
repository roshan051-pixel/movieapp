package com.upgrad.movieapp;

import com.upgrad.movieapp.dao.CustomerDao;
import com.upgrad.movieapp.dao.MovieDao;
import com.upgrad.movieapp.entities.Customer;
import com.upgrad.movieapp.entities.Movie;
import java.time.LocalDateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import com.upgrad.movieapp.dao.TheatreDao;
import com.upgrad.movieapp.entities.Theatre;

import java.util.Arrays;
import java.util.List;


@RestController
@SpringBootApplication
public class MovieappApplication {

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);
//    MovieDao movieDao = context.getBean(MovieDao.class);
//    Movie movie = new Movie();
//    movie.setMovieName("Avengers: Infinity War");
//    movie.setMovieDescription("The Avengers must stop Thanos, an intergalactic warlord, " +
//        "from getting his hands on all the infinity stones.");
//    movie.setReleaseDate(LocalDateTime.of(2018, 4, 27, 5, 30));
//    movie.setDuration(150);
//    movie.setCoverPhotoUrl("cover-photo-url");
//    movie.setTrailerUrl("trailer-url");
//
//    System.out.println("Before Saving: " + movie);
//
//    Movie savedMovie = movieDao.save(movie);
//    System.out.println("After saving: " + savedMovie);
//
//    Movie retrievedMovie = movieDao.findById(savedMovie.getMovieId()).orElse(null);
//    System.out.println("After retrieving: " + retrievedMovie);
//
//    movie.setDuration(160);
//    Movie updatedMovie = movieDao.save(movie);
//    System.out.println("After updating: " + updatedMovie);
//
//    movieDao.delete(updatedMovie);
//    System.out.println("After deleting: " + movieDao.findById(updatedMovie.getMovieId()));

    TheatreDao theatreDao = context.getBean(TheatreDao.class);

    Theatre theatre1 = new Theatre();
    theatre1.setTheatreName("Urvashi Cinema");
    theatre1.setTicketPrice(500);

    Theatre theatre2 = new Theatre();
    theatre2.setTheatreName("Cinepolis Multiplex");
    theatre2.setTicketPrice(600);

    Theatre theatre3 = new Theatre();
    theatre3.setTheatreName("PVR Koramangla");
    theatre3.setTicketPrice(550);

    Theatre theatre4 = new Theatre();
    theatre4.setTheatreName("PVR IMAX");
    theatre4.setTicketPrice(700);

    Theatre theatre5 = new Theatre();
    theatre5.setTheatreName("INOX");
    theatre5.setTicketPrice(400);

//    System.out.println("Before Saving: " + theatre1);
//    Theatre savedTheatre = theatreDao.save(theatre1);
//    System.out.println("After saving: " + savedTheatre);

//    theatreDao.saveAll(List.of(theatre1, theatre2, theatre3, theatre4, theatre5));
    List<Theatre> theatres = Arrays.asList(theatre1, theatre2, theatre3, theatre4, theatre5);
    theatreDao.saveAll(theatres);
  }
}
