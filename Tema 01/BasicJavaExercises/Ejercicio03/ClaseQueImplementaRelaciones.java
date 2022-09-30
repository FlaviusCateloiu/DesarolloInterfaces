public class ClaseQueImplementaRelaciones implements Relaciones {
    private Object a;

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    @Override
    public boolean esMayor(Object b) {
        boolean loEs = false;
        Class classB, classA;
        classA = this.a.getClass();
        classB = b.getClass();
        if (classA.getName().equals("java.lang.Integer") && classB.getName().equals("java.lang.Integer")) {
            System.out.println("Los dos Object son numeros enteros ahora.");
            if ((int) this.a > (int) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else if (classA.getName().equals("java.lang.Double") && classB.getName().equals("java.lang.Double")) {
            System.out.println("Los dos Object son numeros reales double ahora.");
            if ((double) this.a > (double) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else if (classA.getName().equals("java.lang.Float") && classB.getName().equals("java.lang.Float")) {
            System.out.println("Los dos Object son numero reales float ahora.");
            if ((float) this.a > (float) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else {
            loEs = false;
        }
        return loEs;
    }

    @Override
    public boolean esMenor(Object b) {
        boolean loEs = false;
        Class classB, classA;
        classA = this.a.getClass();
        classB = b.getClass();
        if (classA.getName().equals("java.lang.Integer") && classB.getName().equals("java.lang.Integer")) {
            System.out.println("Los dos Object son numeros enteros ahora.");
            if ((int) this.a < (int) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else if (classA.getName().equals("java.lang.Double") && classB.getName().equals("java.lang.Double")) {
            System.out.println("Los dos Object son numeros reales double ahora.");
            if ((double) this.a < (double) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else if (classA.getName().equals("java.lang.Float") && classB.getName().equals("java.lang.Float")) {
            System.out.println("Los dos Object son numero reales float ahora.");
            if ((float) this.a < (float) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else {
            loEs = false;
        }
        return loEs;
    }

    @Override
    public boolean esIgual(Object b) {
        boolean loEs = false;
        Class classB, classA;
        classA = this.a.getClass();
        classB = b.getClass();
        if (classA.getName().equals("java.lang.Integer") && classB.getName().equals("java.lang.Integer")) {
            System.out.println("Los dos Object son numeros enteros ahora.");
            if ((int) this.a == (int) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else if (classA.getName().equals("java.lang.Double") && classB.getName().equals("java.lang.Double")) {
            System.out.println("Los dos Object son numeros reales double ahora.");
            if ((double) this.a == (double) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else if (classA.getName().equals("java.lang.Float") && classB.getName().equals("java.lang.Float")) {
            System.out.println("Los dos Object son numero reales float ahora.");
            if ((float) this.a == (float) b) {
                loEs = true;
            } else {
                loEs = false;
            }
        } else {
            loEs = false;
        }
        return loEs;
    }
}
