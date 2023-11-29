
package esercizio1;

public class Rettangolo {
    public int base;
    public int height;

public Rettangolo (int base, int height){
    this.base = base;
    this.height = height;
}

public int Perimeter (){
    return base*2 + height*2;
}
public int Area (){
    return base*height;
}

}
