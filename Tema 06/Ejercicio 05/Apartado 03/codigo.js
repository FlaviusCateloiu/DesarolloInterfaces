class Persona {
    constructor(nombre, edad, genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    obtDetalles() {
        console.log("Nombre: " + this.nombre + ", Edad: " + this.edad + " y Genero: " + this.genero);
    }
}

class Estudiante extends Persona {
    constructor(nombre, edad, genero, curso, grupo) {
        super(nombre, edad, genero);
        this.curso = curso;
        this.grupo = grupo;
    }

    registrar() {
        console.log("Estudiante registrado.");
    }
}

class Profesor extends Persona {
    constructor(nombre, edad, genero, asignatura, nivel) {
        super(nombre, edad, genero);
        this.asignatura = asignatura;
        this.nivel = nivel;
    }

    asignar() {
        console.log("Profesor asignado.")
    }
}

profesor = new Profesor("Paco", 23, "Masculino", "Matematicas", "Excelente");
profesor.asignar();
profesor.obtDetalles();

estudiante = new Estudiante("Fernanda", 14, "Femenino", "3ESO", "D")
estudiante.registrar();
estudiante.obtDetalles();