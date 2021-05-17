public class Genus {
    private String genusName;

    public Genus(String genus) {
        setGenusName(genus);
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genus) {
        this.genusName = genus;
    }

    public String toString() {
        return "Genus: " + getGenusName();
    }
}
