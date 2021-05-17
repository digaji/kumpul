import java.util.LinkedList;

public class Specimen {
    private String name;
    private int cageNumber;
    private Species toa; // "Type Of Animal"
    public Specimen( String a, int c, Species s)
    {
        setName(a);
        setCage(c);
        setTOA(s);
    }
    public void setName(String a){ name = a; }
    public void setCage(int c){ cageNumber = c; }
    public void setTOA(Species s){ toa = s; }
    public String getName(){ return name; }
    public int getCage(){ return cageNumber; }
    public Species getTOA(){ return toa; }
    public String toString()
    {
        return name + " is a " + toa + " in cage " + cageNumber;
    }

    public int countSpecimens(Specimen[] animals, Species s) {
        int counter = 0;
        for (Specimen animal : animals) {
            if (s.getSpeciesName().equals(animal.getTOA().getSpeciesName())) {
                counter++;
            }
        }
        return counter;
    }

    public String[] listSpecies(Specimen[] animals) {
        LinkedList<String> speciesll = new LinkedList<>();
        boolean found;

        for (Specimen animal : animals) {
            found = false;

            for (String s : speciesll) {
                if (s.equals(animal.getTOA().getSpeciesName())) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                speciesll.add(animal.getTOA().getSpeciesName());
            }
        }

        return (String[]) speciesll.toArray();
    }

    public LinkedList makeList (Specimen[] animals) {
        LinkedList specimenll = new LinkedList<>();

        for (Specimen animal : animals) {
            specimenll.add(animal);
        }

        return specimenll;
    }

    public LinkedList makeSpeciesList(LinkedList animals) {
        LinkedList<Species> speciesll = new LinkedList<>();

        for (Specimen animal : (LinkedList<Specimen>) animals) {
            speciesll.add(animal.getTOA());
        }

        return speciesll;
    }

    public LinkedList makeSpeciesListUnique(LinkedList allSpecies) {
        LinkedList<Species> uniquell = new LinkedList<>();
        boolean found;

        for (Species species : (LinkedList<Species>) allSpecies) {
            found = false;

            for (Species unique : uniquell) {
                if (unique.getSpeciesName().equals(species.getSpeciesName())) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniquell.add(species);
            }
        }

        return uniquell;
    }
}
