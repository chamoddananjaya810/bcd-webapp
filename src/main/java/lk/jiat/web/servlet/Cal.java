package lk.jiat.web.servlet;

import jakarta.ejb.Remote;

@Remote
public interface Cal {
    int getResult(int i1,int i2);
}
