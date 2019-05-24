package web;


import com.google.gson.Gson;
import entidades.Chocotorta;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="PostChocotorta", urlPatterns={"/PostChocotorta"})
public class PostChocotorta extends HttpServlet {

 Gson convertirJson= new Gson();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getReader().readLine());
        String pedido = req.getReader().readLine();
        
        Chocotorta guardado =convertirJson.fromJson(pedido, Chocotorta.class);
        System.out.println("Precio: " + guardado.getPrecio());
        
        System.out.println(pedido);
        
    }

   

}
