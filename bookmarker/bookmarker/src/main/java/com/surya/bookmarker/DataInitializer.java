package com.surya.bookmarker;

import com.surya.bookmarker.domain.Bookmark;
import com.surya.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "Spring Boot Documentation","https://docs.spring.io/spring-boot/docs/", Instant.now()));
        repository.save(new Bookmark(null, "Java Documentation","https://docs.oracle.com/en/java/", Instant.now()));
        repository.save(new Bookmark(null, "Google Cloud Documentation","https://cloud.google.com/docs", Instant.now()));

    }
}
