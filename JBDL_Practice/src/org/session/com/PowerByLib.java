package org.session.com;

public class PowerByLib implements Power{
    @Override
    public long pow(int a, int b) {
        return (long)Math.pow(a,b);
    }
}
