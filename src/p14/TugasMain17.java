package p14;

public class TugasMain17 {
    public static void main(String[] args) {
        System.out.println("========== UJI COBA BINARY SEARCH TREE (LINKED LIST) ==========");
        BinaryTree17 bst = new BinaryTree17();

        bst.addRekursif(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa17("244160220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa17("244160131", "Devi", "A", 3.72));

        System.out.println("\nSemua Data (InOrder):");
        bst.traverseInOrder(bst.root);

        System.out.println();
        bst.cariMinIPK();
        bst.cariMaxIPK();

        System.out.println();
        bst.tampilMahasiswaIPKdiAtas(3.55);


        System.out.println("\n========== UJI COBA BINARY TREE ARRAY ==========");
        BinaryTreeArray17 bta = new BinaryTreeArray17();

        bta.add(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa17("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa17("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa17("244160220", "Dewi", "B", 3.35));

        System.out.println("\nTraversal PreOrder pada Array Tree:");
        bta.traversePreOrder(0);
    }
}