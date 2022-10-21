
package kata3;

import java.awt.Dimension;
 import javax.swing.JPanel;
 import org.jfree.chart.ChartFactory;
 import org.jfree.ui.ApplicationFrame;
 import org.jfree.chart.ChartPanel;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.plot.PlotOrientation;
 import org.jfree.data.category.DefaultCategoryDataset;


 public class HistogramDisplay extends ApplicationFrame {

     public HistogramDisplay() {
         super("HISTOGRAMA");

         setContentPane(createPanel());
         pack();             // Hace que la ventana sea lo más pequeña posible
     }


     public void execute() {

         setVisible(true);

     }


     private JPanel createPanel() {

         ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
         setPreferredSize(new Dimension(500,400));


         return chartPanel;
     }


     private JFreeChart createChart(DefaultCategoryDataset dataSet) {

         JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", 
                 "Dominios email", "Nº de emails", createDataset(), PlotOrientation.VERTICAL, 
                 false, false, rootPaneCheckingEnabled);

         return chart;
     }

     private DefaultCategoryDataset createDataset() {

         DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

         dataSet.addValue(5, " ", "gmail.com");
         dataSet.addValue(10, " ", "ulpgc.es");
         dataSet.addValue(7, " ", "ull.es");
         dataSet.addValue(2, " ", "hotmail.es");

         return dataSet;
     }
 }