interface GUIFactory {
    Button createButton();
    Text createText();
}

class WindowsFactory implements GUIFactory { // Factory Windows est un singleton

    private static class Instance {
        static final WindowsFactory instance = new WindowsFactory();
    }

    private WindowsFactory() { }

    public static GUIFactory getInstance() {
        return Instance.instance;
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Text createText() {
        return new WindowsText();
    }
}

class MacOSFactory implements GUIFactory { // Factory MacOS est un singleton
    private static class Instance {
        static final MacOSFactory instance = new MacOSFactory();
    }

    private MacOSFactory() { }

    public static GUIFactory getInstance() {
        return Instance.instance;
    }


    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Text createText() {
        return new MacOSText();
    }
}

interface Button {
    void click();
}

interface Text {
    void display();
}

class WindowsButton implements Button { // Famille Windows
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

class WindowsText implements Text { // Famille Windows
    @Override
    public void display() {
        System.out.println("Windows text displayed");
    }
}

class MacOSButton implements Button { // Famille MacOS
    @Override
    public void click() {
        System.out.println("MacOS button clicked");
    }
}

class MacOSText implements Text { // Famille MacOS
    @Override
    public void display() {
        System.out.println("MacOS text displayed");
    }
}

public class Main {
    public static void main(String[] args) {
        GUIFactory factory; // Ici, on ne connait pas encore la factory concrète

        // Création de produits pour Windows
        factory = WindowsFactory.getInstance();
        Button button1 = factory.createButton();
        Text text1 = factory.createText();
        button1.click(); // windows button is called
        text1.display(); // Windows text is called

        // Création de produits pour MacOS
        factory = MacOSFactory.getInstance();
        Button macButton = factory.createButton();
        Text macText = factory.createText();
        macButton.click();
        macText.display();
    }
}