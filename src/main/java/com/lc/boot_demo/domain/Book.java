package com.lc.boot_demo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * @Author: Sakura
 * @Description:
 * @Date: 2018/11/19 16:55
 */
@Entity(name = "t_book")
@ApiModel
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private Long bookId;

    @ApiModelProperty(name = "bookName", value = "图书标题", required = true, example = "《Mysql从删库到跑路》")
    private String bookName;

    private String isbn;

    private String publisher;

    private String publishTime;


    public Book() {
    }

    public Book(Long bookId, String bookName, String isbn, String publisher, String publishTime) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}

