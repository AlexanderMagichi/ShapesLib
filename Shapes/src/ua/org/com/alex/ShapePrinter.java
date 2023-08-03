package ua.org.com.alex;

import ua.org.com.alex.shapes.Shape;
import java.awt.*;
import java.awt.print.*; //https://docs.oracle.com/javase/tutorial/2d/printing/printable.html
import java.util.List;

public class ShapePrinter { 
    public void printShapes(List<Shape> shapes) { 
        // Getting the Printer Object
        PrinterJob printerJob = PrinterJob.getPrinterJob(); 

        // Setting print preferences
        PageFormat pageFormat = printerJob.defaultPage(); 
        printerJob.setPrintable(new ShapePrintable(shapes), pageFormat); 

        //Display Print Dialog and Print
        if (printerJob.printDialog()) { // Display the print dialog and wait for the user to select settings
            try {
                printerJob.print(); // Start print
            } catch (PrinterException e) { // https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/2d/printing/examples/HelloWorldPrinter.java
                e.printStackTrace();
            }
        }
    }


    
    private static class ShapePrintable implements Printable {  // Declaring an inner class ShapePrintable that implements the Printable interface
        private List<Shape> shapes; 

        public ShapePrintable(List<Shape> shapes) { 
            this.shapes = shapes; 
        }

        @SuppressWarnings("unused")
		@Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex >= shapes.size()) { // Check if the page index is greater than the number of shapes
                return Printable.NO_SUCH_PAGE; // Return constant Printable.NO_SUCH_PAGE indicating no such page
            }

            // Get the current shape to print
            Shape shape = shapes.get(pageIndex); // Getting the current shape from the list of shapes by index pageIndex
            
            // Draw the shape on the graphics printer context
            Graphics2D g2d = (Graphics2D) graphics; // Casting a Graphics object to a Graphics2D https://stackoverflow.com/questions/179415/java2d-is-it-always-safe-to-cast-graphics-into-graphics2d
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY()); 
        
            
            return Printable.PAGE_EXISTS; // The constant Printable.PAGE_EXISTS is returned indicating that the page exists and will be printed.
        }
    }
}
