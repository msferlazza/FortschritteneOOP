package ch.ibw.generic2;

class Box<  T  >
{
    private   T   val;
    void setValue(   T   val )
    {
        this.val = val;
    }
    T   getValue()
    {
        return val;
    }
}