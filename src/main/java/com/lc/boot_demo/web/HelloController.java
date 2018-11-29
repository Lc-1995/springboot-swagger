package com.lc.boot_demo.web;

import com.lc.boot_demo.domain.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: Sakura
 * @Description:
 * @Date: 2018/11/19 16:27
 */
@RestController
@Api(description = "图书管理CRUD接口")
public class HelloController {

    static AtomicLong seq = new AtomicLong(20);

    @GetMapping("books")
    @ApiOperation(value = "获取图书列表")
    @ApiResponses({
            @ApiResponse(code = -1, message = "数据不存在"),
            @ApiResponse(code = 1, message = "返回成功")
    })
    public Book getBookList() {
        Book book = new Book(1L,"《Mysql从删库到跑路》","1231231321","Sakura","2018-11-20");
        return book;
    }
}
