import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myController")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        System.err.println("sfdf");
        System.err.println("abcd");
        System.err.println("def");
        System.err.println("123");
        System.err.println("def");
        System.err.println("789");
        System.err.println("456");
        System.err.println("789");
        req.setCharacterEncoding("UTF-8");

        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        req.setAttribute("name", name);
        System.out.println(name);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
