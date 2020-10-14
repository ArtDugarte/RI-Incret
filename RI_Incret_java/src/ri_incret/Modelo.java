package ri_incret;

public class Modelo {
    
    private boolean administrador, tiene_instru, disponible;
    private String nombre, apellido, cedula, numTlf, direc, usuario, color, nombre_instrumento, marca_instrumento, serial, fecha_entrega, fecha_devolucion;
    private int id_estudiante, id_instru, id_usuario, id_nombre, id_marca;

    public int getId_nombre() {
        return id_nombre;
    }

    public void setId_nombre(int id_nombre) {
        this.id_nombre = id_nombre;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }
   
    public int getid_usuario() {
        return id_usuario;
    }

    public void setid_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getfecha_entrega() {
        return fecha_entrega;
    }

    public void setfecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getcedula() {
        return cedula;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }
    
    public int getid_instru() {
        return id_instru;
    }

    public void setid_instru(int id_instru) {
        this.id_instru = id_instru;
    }
    
    public int getid_estudiante() {
        return id_estudiante;
    }

    public void setid_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    
    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNombre_instrumento() {
        return nombre_instrumento;
    }

    public void setNombre_instrumento(String nombre_instrumento) {
        this.nombre_instrumento = nombre_instrumento;
    }

    public String getMarca_instrumento() {
        return marca_instrumento;
    }

    public void setMarca_instrumento(String marca_instrumento) {
        this.marca_instrumento = marca_instrumento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumTlf() {
        return numTlf;
    }

    public void setNumTlf(String numTlf) {
        this.numTlf = numTlf;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }
    
    public boolean isTiene_instru() {
        return tiene_instru;
    }

    public void setTiene_instru(boolean tiene_instru) {
        this.tiene_instru = tiene_instru;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
