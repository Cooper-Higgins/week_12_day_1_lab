import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrint() {
        printer.printCopies(5, 10);
        assertEquals(50, printer.getPaper());
        assertEquals(50, printer.getToner());
    }

    @Test
    public void cannotPrint(){
        printer.printCopies(30,300);
        assertEquals(100, printer.getPaper());
    }
}
