public class Lolita {
    static int Solucion1(int barrio){
        int casa = -1;
        for(int cas = 2; cas < barrio; cas++){
            int sumaiz = 0;
            for(int ci = 1; ci < cas; ci++){
                sumaiz = sumaiz + ci;
            }
            
            int sumade = 0;
            for(int cd = cas + 1; cd <= barrio; cd++){
                sumade = sumade + cd;
            }

            if(sumaiz == sumade){
                casa = cas;
            }
        }
        return casa;
    }

    public static void main(String[] args) {
        Solucion1(8);
    }
}
