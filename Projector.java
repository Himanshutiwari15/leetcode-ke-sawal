public class Projector {
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    public int getProjectorId() {
        return projectorId;
    }

    public void setProjectorId(int projectorId) {
        this.projectorId = projectorId;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public void setProjectorName(String projectorName) {
        this.projectorName = projectorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAvailableIn() {
        return availableIn;
    }

    public void setAvailableIn(String availableIn) {
        this.availableIn = availableIn;
    }

    public Projector(int projectorId, String projectorName, int price, int rating, String availableIn){
        this.projectorId = projectorId;
        this.projectorName = projectorName;
        this.price = price;
        this.rating = rating;
        this.availableIn = availableIn;
    }
}
