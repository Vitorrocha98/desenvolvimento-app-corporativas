/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body style=\"background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%); color: white; font-family: montserrat\">");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Al??, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "de":
                msg = "Hallo, ";
                break;
            case "es":
                msg = "Hola, ";
                break;
            case "it":
                msg = "Ciao, ";
                break;
        }
        
        String trat = request.getParameter("trat");
        if(trat==null)
            trat = "";
        switch(trat){
            case "none":
                msg = msg + "";
                break;
            case "sr":
                msg = msg+"Sr. ";
                break;
            case "sra":
                msg = msg+"Sra. ";
                break;
            case "mr":
                msg = msg+"Mr. ";
                break;
            case "mrs":
                msg = msg+"Mrs. ";
                break;
            case "m":
                msg = msg+"M. ";
                break;
            case "mme":
                msg = msg+"Mme. ";
                break;
            case "herr":
                msg = msg+"Herr. ";
                break;
            case "frau":
                msg = msg+"Frau. ";
                break;
            case "sres":
                msg = msg+"Sres. ";
                break;
            case "sra.":
                msg = msg+"Sra. ";
                break;
            case "sig":
                msg = msg+"Sig. ";
                break;
            case "sigra":
                msg = msg+"Sig.ra. ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");   
            out.println("<style>@import url('https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Montserrat&display=swap');</style>");
            out.println("</head>");
            out.println("<body style=\"background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%); color: white; font-family: montserrat\">");
            out.println("<div id=\"servletGet\" style=\"display:flex;flex-direction:column;align-items:center;background:rgba(0,0,0,.35);box-shadow:0 8px 32px 0 rgba(31,38,135,.37);backdrop-filter:blur( 13.5px );border-radius:10px;margin-left:22%;margin-right:22%;padding-bottom:15px;padding-top:15px\">");
            out.println("<h1 style=\"background: white;color: black;font-size: 22px;border-radius: 30px;font-family: montserrat;padding: 2%;font-weight: normal;\">Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("<div id=\"btnNavegacaoGet\"><a href=\".\" style=\"padding:5px 10px 5px 10px;border-radius:10px;text-decoration:none;color: white;background-color: #093596;\">Voltar</a></div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Al??, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "de":
                msg = "Hallo, ";
                break;
            case "es":
                msg = "Hola, ";
                break;
            case "it":
                msg = "Ciao, ";
                break;
    }
        
        String trat = request.getParameter("trat");
        if(trat==null)
            trat = "";
        switch(trat){
            case "none":
                msg = msg + "";
                break;
            case "sr":
                msg = msg+"Sr. ";
                break;
            case "sra":
                msg = msg+"Sra. ";
                break;
            case "mr":
                msg = msg+"Mr. ";
                break;
            case "mrs":
                msg = msg+"Mrs. ";
                break;
            case "m":
                msg = msg+"M. ";
                break;
            case "mme":
                msg = msg+"Mme. ";
                break;
            case "herr":
                msg = msg+"Herr. ";
                break;
            case "frau":
                msg = msg+"Frau. ";
                break;
            case "sres":
                msg = msg+"Sres. ";
                break;
            case "sra.":
                msg = msg+"Sra. ";
                break;
            case "sig":
                msg = msg+"Sig. ";
                break;
            case "sigra":
                msg = msg+"Sig.ra. ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");   
            out.println("<style>@import url('https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Montserrat&display=swap');</style>");
            out.println("</head>");
            out.println("<body style=\"background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%); color: white; font-family: montserrat\">");
            out.println("<div id=\"servletPost\" style=\"display:flex;flex-direction:column;align-items:center;background:rgba(0,0,0,.35);box-shadow:0 8px 32px 0 rgba(31,38,135,.37);backdrop-filter:blur( 13.5px );border-radius:10px;margin-left:22%;margin-right:22%;padding-bottom:15px;padding-top:15px\">");
            out.println("<h1 style=\"background: white;color: black;font-size: 22px;border-radius: 30px;font-family: montserrat;padding: 2%;font-weight: normal;\">Servlet HelloServlet!!</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("<div id=\"btnNavegacao\"><a href=\".\" style=\"padding:5px 10px 5px 10px;border-radius:10px;text-decoration:none;color: white;background-color: #093596;\">Home</a><a href=\"helloform.html\" style=\"padding:5px 10px 5px 10px;border-radius:10px;text-decoration:none;color: white;background-color: #093596;margin-left: 20px;\">Voltar</a></div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
