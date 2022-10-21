
package kata3;

/**
 *
 * @author airam
 */
public class Kata3 {

    
    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        
        new HistogramDisplay(histogram).execute();
        
    }
    
}
