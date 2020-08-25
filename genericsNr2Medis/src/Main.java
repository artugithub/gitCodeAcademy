
class Medis {
    private String leavesKind,treeKind;
    Medis(String treeKind, String leavesKind) {
        this.treeKind = treeKind;
        this.leavesKind = leavesKind;
    }
    void turi() {
        System.out.println(this.getTreeKind() + " turi " + this.getLeavesKind());
    }
    public String getLeavesKind() {
        return leavesKind;
    }
    public String getTreeKind() {
        return treeKind;
    }
}
class Lapuotis extends Medis {
    Lapuotis(String treeKind) {
        super(treeKind, "lapus");
    }
}
class Spygliuotis extends Medis {
    Spygliuotis(String treeKind) {
        super(treeKind, "spyglius");
    }
}
class Azuolas extends Lapuotis {
    Azuolas(){
        super("Azuolas");
    }
}
class Berzas extends Lapuotis {
    Berzas(){
        super("Berzas");
    }
}
class Pusis extends Spygliuotis {
    Pusis() {
        super("Pusis");
    }
}
class Egle extends Spygliuotis {
    Egle() {
        super("Egle");
    }
}
class Kadagys extends Spygliuotis {
    Kadagys() {
        super("Kadagys");
    }
}
class Miskas<T extends Medis> {
    <T>void ivairusMiskas(T[] trees) {
        System.out.println("Ivairus miskas:");
        loopThroughTrees(trees);
    }
    <T>void spygliuociuMiskas(T[] trees) {
        System.out.println("Spygliuociu miskas:");
        loopThroughTrees(trees);
    }
    <T>void BerzuMiskas(T[] trees) {
        System.out.println("Berzu miskas:");
        loopThroughTrees(trees);
    }
    <T>void loopThroughTrees(T[] trees) {
        for (T tree : trees) {
            if (tree instanceof Medis) {
                ((Medis) tree).turi();
            }
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        Miskas miskas = new Miskas();
        Medis[] treesRandom = {new Berzas(),new Azuolas(),new Kadagys(),new Egle(),new Pusis()};
        Medis[] treesNeedle = {new Kadagys(),new Egle(),new Pusis()};
        Medis[] treesBirch = {new Berzas(), new Berzas(), new Berzas()};
        miskas.ivairusMiskas(treesRandom);
        miskas.spygliuociuMiskas(treesNeedle);
        miskas.BerzuMiskas(treesBirch);
    }
}