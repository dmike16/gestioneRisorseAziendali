package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DbLibri;
import model.Libri;

public class TestJson extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException
	{
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();

		try {
			List<Libri> l = (new DbLibri()).listAll();
			JsonWriter jout = Json.createWriter(out);
			JsonArrayBuilder value = Json.createArrayBuilder();
			JsonObjectBuilder lib = Json.createObjectBuilder();

			for(Libri ll : l){
				value.add(lib.add("titolo" ,ll.getTitolo())
						.add("autore", ll.getAutore())
						.add("id", ll.getId())
						.add("prezzo", ll.getPrezzo()));

			}

			jout.write(Json.createObjectBuilder().add("libri", value).build());
			jout.close();

		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
