package com.company;

public class Enemy extends GameObject {

    private String Nombre;

    Enemy(String n, int at, int def, int lif, int id){
        this.Nombre = n;
        this.attack = at;
        this.def = def;
        this.life = lif;
        this.GOId = id;
        this.state = true;
    }

    public String getNombre() {
        return Nombre;
    }

    public void getDetails(){
        System.out.println(Nombre);
        System.out.println("-----------------");
        System.out.println("Vida:    " + life);
        System.out.println("Ataque:  " + attack);
        System.out.println("Defensa: " + def);
        System.out.println();
    }

    public static Enemy[] intstaciasEnemy(int tamañoArray){
        Enemy[] EnemyList = new Enemy[tamañoArray];

        for (int i = 0; i < tamañoArray ; i++) {
            String N = "Enemy " + (i +1);
            EnemyList[i] = new Enemy(N,Random.generarNum(101),Random.generarNum(101), 100,30);
        }
        return EnemyList;
    }

    public static Enemy findEnemy(Enemy[] e,int r, int c){
        int index = 0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getRowPosition() == r && e[i].getColumnPosition() == c)
                index = i;
        }

        return e[index];
    }
}
