public class Main {
    public static void main(String[] args) {
        // Créer des formes simples
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape rectangle = new Rectangle();

        // Créer un groupe de formes
        Group group1 = new Group();
        group1.addShape(circle1);
        group1.addShape(rectangle);

        // Créer un autre groupe de formes et ajouter un groupe existant
        Group group2 = new Group();
        group2.addShape(circle2);
        group2.addShape(group1);

        // Dessiner tous les groupes et formes
        group2.draw("");
    }
}