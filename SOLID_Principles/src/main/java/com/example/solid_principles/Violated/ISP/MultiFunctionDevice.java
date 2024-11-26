package com.example.solid_principles.Violated.ISP;

public interface MultiFunctionDevice {
    void print(String content);
    void scan(String content);
    void fax(String content);
}

class BasicPrinter implements MultiFunctionDevice {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        throw new UnsupportedOperationException("Scanning not supported");
    }

    @Override
    public void fax(String content) {
        throw new UnsupportedOperationException("Faxing not supported");
    }
}
