package com.rafael.bookstoremanager2.repository;

import com.rafael.bookstoremanager2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
