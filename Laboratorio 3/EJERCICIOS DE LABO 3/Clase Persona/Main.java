public class Main {
    public static void main(String[] args) {
        Persona myObjt = new Persona();
        myObjt.setCorreoElectronico("andy.conde.47@gmail.com");
        myObjt.setEdad(22);
        myObjt.setName("Andy");
        System.out.println(myObjt.getCorreoElectronico());
        System.out.println(myObjt.getEdad());
        System.out.println(myObjt.getName());
    }

}
