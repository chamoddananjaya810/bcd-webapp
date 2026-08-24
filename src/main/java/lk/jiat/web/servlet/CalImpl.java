package lk.jiat.web.servlet;


import jakarta.ejb.Stateless;

@Stateless
public class CalImpl implements Cal {
    public int getResult(int i1, int i2) {
        return i1 + i2;
    }
}
