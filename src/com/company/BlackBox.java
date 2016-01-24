package com.company;

/**
 * Created by uitschool JV on 1/24/2016.
 */
public class BlackBox {
    int a;
    int b;

    BlackBox(int varA, int varB)
    {
        a = varA;
        b=varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null)   return false;
        if(getClass() != o.getClass()) return false;
        BlackBox other = (BlackBox) o;
        if(a != other.a) return false;
        if(b != other.b) return false;
        return true;

    }

    @Override
    public int hashCode()
{
    final int prime = 31;
    int result = 1;
    result = prime * result * a;
    result = prime * result * b;
    return result;
}
}
