import com.example.demo1.Personne;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ArrayList<Personne> javanaisList = new ArrayList<>();

        Personne elise = new Personne("Elise", "Doe", 1);
        Personne Laurent = new Personne("Laurent", "Doe", 2);
        Personne Lucas = new Personne("Lucas", "Doe", 3);
        Personne Gaetan = new Personne("Gaetan", "Doe", 4);
        Personne Ismail  = new Personne("Ismail", "Doe", 5);
        Personne Samuel = new Personne("Samuel", "Doe", 6);
        Personne Pascal = new Personne("Pascal", "Doe", 7);
        Personne Nathan = new Personne("Nathan", "Doe", 8);
        Personne Aline = new Personne("Aline", "Doe", 9);

        javanaisList.add(elise);
        javanaisList.add(Laurent);
        javanaisList.add(Lucas);
        javanaisList.add(Gaetan);
        javanaisList.add(Ismail);
        javanaisList.add(Samuel);
        javanaisList.add(Pascal);
        javanaisList.add(Nathan);
        javanaisList.add(Aline);


        Random random = new Random();

        int positionAlea = random.nextInt(javanaisList.size());

        Personne javanaisAlea = javanaisList.get(positionAlea);



        req.setAttribute("roue", javanaisAlea);
        req.setAttribute("roue2", javanaisList);
        req.getRequestDispatcher("/roue.jsp").forward(req, resp);


    }
}
