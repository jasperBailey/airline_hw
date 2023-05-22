public class CabinCrewMember extends Person{
    private Rank rank;

    public CabinCrewMember (String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}