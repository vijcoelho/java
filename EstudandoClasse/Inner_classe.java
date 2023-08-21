
    //------------------------------------------------------------------------------
    // private class InnerClass {
    //     int y=5;     (Nao consegue ser acessada) 
    // }
    //------------------------------------------------------------------------------

    //------------------------------------------------------------------------------
    // static class InnerClass { 
    //     int y=5;     (Pode ser acessada sem criar um obj da OuterClass)
    // }                (System.out.println(myInner.y))
    //------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------
    // class InnerClass { 
    //     public int myInnerMetodo {
    //        return x;
    //}
    //
    //----No psvm
    //      
    //  System.out.println(myInner.myInnerMetodo);
    //------------------------------------------------------------------------------

    package EstudandoClasse;

    class OuterClass {
        int x=10;
    
        class InnerClass { 
            int y=5;
        }
}

public class Inner_classe {
    public static void main(String[] args) {
        OuterClass myOuter=new OuterClass();
        OuterClass.InnerClass myInner=myOuter.new InnerClass();

        System.out.println(myInner.y+myOuter.x);
    }
}

