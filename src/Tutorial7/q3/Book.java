package Tutorial7.q3;

public class Book implements Comparable<Book>{
    String title;
    double price;
    int year;
    String author;

    public Book(){
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book b) {
        if (year == b.year) {
            return 0;
        }
        else if (year< b.year){
            return -1;
        }
        return 0;
    }
}
