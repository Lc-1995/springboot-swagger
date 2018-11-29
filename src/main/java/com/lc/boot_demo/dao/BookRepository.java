package com.lc.boot_demo.dao;

import com.lc.boot_demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Sakura
 * @Description:
 * @Date: 2018/11/20 12:46
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}
