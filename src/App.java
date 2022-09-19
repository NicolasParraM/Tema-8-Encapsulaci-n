public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona = new Persona();
        
        persona.setNombre("Nicolas Parra");
        persona.setEdad("20 años");
        persona.setTelefono("+57 317248");
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

}