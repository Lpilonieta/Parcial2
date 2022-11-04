package Data;

public class Productos {
    private int valor;
    private int undBodega;
    private int notaPromedio;
    private int numVentas;
    private int id;

    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public int getUndBodega() {
        return undBodega;
    }

    public int getNotaPromedio() {
        return notaPromedio;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public Productos(int valor, int undBodega, int notaPromedio, int numVentas,int id) {
        this.valor = valor;
        this.undBodega = undBodega;
        this.notaPromedio = notaPromedio;
        this.numVentas = numVentas;
        this.id = id;
    }
    public String menu(){
        return new String("Valor: "+ this.valor +
                "Unidades Disponibles: "+ undBodega +
                "Calificacion promedio: " +notaPromedio +
                "Productos vendidos: " + numVentas
        );
    }

    private static Productos[] Inventario = {
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),1),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),2),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),3),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),4),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),5),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),6),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),7),
            new Productos(numAleatorioRan(100,10),numAleatorioRan(1000,10),numAleatorioRan(5,1),numAleatorioRan(100,10),8)
    };

    public static Productos[] getInventario() {
        return Inventario;
    }


    public static int numAleatorioRan (int Max , int Min){
       return (int) (Math.floor(Math.random() * (Max - Min + 1)) + Min);
    }


}
