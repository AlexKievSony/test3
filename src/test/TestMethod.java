package test;
/**

 * @version $Revision$ $LastChangedDate$
 * @author $Author$

 */
public class TestMethod <T,T2>
{
    /**
     * Returns an Image object that can then be painted on the screen.
     * The url argument must specify an absolute  The name
     * argument is a specifier that is relative to the url argument.
     * <p>
     * This method always returns immediately, whether or not the
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives
     * that draw the image will incrementally paint on the screen.
     * @version $Revision$ $LastChangedDate$
     * @author $Author$
     * @param  s    the location of the image, relative to the url argument
     * @return      String object
     * @see         String
     */
    public String print(String s)
    {
        System.out.println("Test1");
        return "test1";
    }
    private T t;

    public T get(){
        return this.t;
    }

    public void set2(T t1){
        this.t=t1;
    }
    private T2 t2;

    public T2 get2(){
        return this.t2;
    }

    public void set(T2 t4){
        this.t2=t4;
    }

}
