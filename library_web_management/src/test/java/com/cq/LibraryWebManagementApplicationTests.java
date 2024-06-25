package com.cq;

import com.cq.mapper.BookMapper;
import com.cq.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryWebManagementApplicationTests {
@Autowired
 BookMapper bookMapper;
//新增
    @Test
public void addTest(){
    Book javaBook = new Book( 0,"Java编程思想", "Bruce Eckel", "978-0131872486", 2006, "可借");
    bookMapper.insert(javaBook);
}
//根据id删除
    @Test
   public  void deleteTest() {
        bookMapper.delete(26);
    }
//根据id修改
@Test
public void updateTest(){
        Book book1 = new Book();
        book1.setAuthor("张三");
        book1.setBookId(23);
bookMapper.update(book1);

}
//通过id查询
    @Test
   public void selectTest() {
     Book book_2 =  bookMapper.getById(25);
        System.out.println(book_2);
    }
}
