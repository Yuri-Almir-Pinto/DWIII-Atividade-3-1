package com.example.atividade3.dwiiiatividade3;

import com.example.atividade3.dwiiiatividade3.model.Candidato;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProcessoVaga", value = "/ProcessoVaga")
public class ProcessoVagaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Candidato c = new Candidato();
        boolean error = false;

        error |= c.setNome(request.getParameter("field_nome"));

        error |= c.setDataNasc(request.getParameter("field_dataNasc"));

        c.setIdioma(request.getParameter("field_idiomaNativo"));

        c.setHabilidades(request.getParameterValues("field_habTech"));

        if (error) {
            response.sendRedirect("http://localhost:8080/DWIII_Atividade_3_war_exploded/");
        }

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("Nome: " + c.getNome() + "</br>");
        out.println("Data de Nascimento: " + c.getDataNasc() + "</br>");
        out.println("Idioma: " + c.getIdioma() + "</br>");
        out.println("Habilidades: </br>");
        if (c.getHabilidades() != null) {
            for (String habilidades : c.getHabilidades()) {
                out.println("- " + habilidades + "</br>");
            }
        }
        else {
            out.println("Nenhuma selecionada.");
        }

        out.println("</body></html>");

    }
}
