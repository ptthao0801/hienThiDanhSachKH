package org.example.demo6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CustomerList", value = "/display")
public class CustomerList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("day la 1 cai ten","2000-03-04","address","data:image/png;base64,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"));
        customers.add(new Customer("day la 1 cai ten","2000-03-04","address","data:image/png;base64,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"));
        customers.add(new Customer("day la 1 cai ten","2000-03-04","address","data:image/png;base64,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"));

        // Đặt danh sách khách hàng vào thuộc tính của request
        req.setAttribute("customers", customers);

        // Chuyển hướng đến trang JSP để hiển thị danh sách khách hàng
        req.getRequestDispatcher("customers.jsp").forward(req, resp);
    }
}