package com.caglardurmaz.readingisgood.repositories;

import com.caglardurmaz.readingisgood.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
