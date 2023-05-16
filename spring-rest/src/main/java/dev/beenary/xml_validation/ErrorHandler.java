package dev.beenary.xml_validation;

import org.xml.sax.SAXParseException;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandler implements org.xml.sax.ErrorHandler
{

    private List<SAXParseException> exceptions;

    public ErrorHandler() {
        this.exceptions = new ArrayList<>();
    }

    public List<SAXParseException> getExceptions() {
        return exceptions;
    }

    @Override
    public void warning(SAXParseException exception) {
        exceptions.add(exception);
    }

    @Override
    public void error(SAXParseException exception) {
        exceptions.add(exception);
    }

    @Override
    public void fatalError(SAXParseException exception) {
        exceptions.add(exception);
    }
}