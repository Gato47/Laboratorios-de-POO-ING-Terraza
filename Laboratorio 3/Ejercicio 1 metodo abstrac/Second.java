class Second {
    public static void main (String[] args) {
        // Crear un objeto de la clase Student
        Estudiante myObj = new Estudiante();

        // Imprimir los atributos heredados y el método implementado
        System.out.println("Nombre: " + myObj.nombre);
        System.out.println("Edad: " + myObj.edad);
        System.out.println("Año de graduacion: " + myObj.añoGraduación);

        // Llamar al método study()
        myObj.Estudiar();
    }
}
