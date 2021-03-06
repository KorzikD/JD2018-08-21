package by.it.nesterovich.project.java.cmd;

import by.it.nesterovich.project.java.Action;
import by.it.nesterovich.project.java.beans.Film;
import by.it.nesterovich.project.java.dao.Dao;
import by.it.nesterovich.project.java.utils.Form;
import by.it.nesterovich.project.java.utils.Patterns;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CmdCreateFilm extends Cmd {

    @Override
    public Cmd execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        if (Form.isPost(req)) {
            String name = Form.getString(req.getParameter("name"), Patterns.NAMEFILM);
            String country = Form.getString(req.getParameter("country"), Patterns.COUNTRY);
            String genre = Form.getString(req.getParameter("genre"), Patterns.GENRE);
            int yearOfIssue = Integer.parseInt(Form.getString(req.getParameter("yearOfIssue"), Patterns.YEAROFISSUE));
            int duration = Integer.parseInt(Form.getString(req.getParameter("duration"), Patterns.DURATION));
            Film film = new Film(0, name, country, genre, yearOfIssue, duration);
            Dao dao = Dao.getDao();
            dao.film.create(film);
            return Action.LISTFILM.cmd;
        }
        return null;
    }
}
