interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
}

// Clase abstracta FiguraConLados que implementa FiguraGeometrica
abstract class FiguraConLados implements FiguraGeometrica {
    protected int numLados;

    protected FiguraConLados(int numLados) {
        this.numLados = numLados;
    }
}

// Clase Triangulo que hereda de FiguraConLados
class Triangulo extends FiguraConLados {
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        super(3);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

// Clase Cuadrado que hereda de FiguraConLados
class Cuadrado extends FiguraConLados {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Clase Pentagono que hereda de FiguraConLados
class Pentagono extends FiguraConLados {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        super(5);
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}
