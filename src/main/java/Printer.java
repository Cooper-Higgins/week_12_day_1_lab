public class Printer {
    private int paper;

    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void printCopies(int pages, int copies) {
        if (this.paper >= (pages * copies)) {
            this.paper = paper - (pages * copies);
            this.toner = toner - (pages * copies);
        }
    }
}
