package com.example.web.wrapper;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * @author Semih Okan Pehlivan.
 */
public class CompressionResponseWrapper extends HttpServletResponseWrapper {

    /*
    * We can enhance tha capability of the response object by using wrapper class(decorator or wrapper pattern), Thanks for Sun engineers :)
    * */
    public CompressionResponseWrapper(HttpServletResponse response) {
        super(response);
    }
}
