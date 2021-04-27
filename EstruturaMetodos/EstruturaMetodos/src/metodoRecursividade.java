public class metodoRecursividade {
    public static void main(String[] args) {
        String[] alunos = new String[] {"Alexandre", "João", "Maria"};

        iterarNomes(alunos, 0);
    }

    /*static void iterarNomes(String[] alunos){
        for(int i=0; i<alunos.length; i++){                               //METODO UTILIZANDO FOR
            System.out.println("Aluno: " + alunos[i]);
        }
    } */

    static void iterarNomes(String[] alunos, Integer i){
        System.out.println("Aluno: " + alunos[i]);
                                                                        //METODO UTILIZANDO RECURSIVIDADE
        if(++i < alunos.length){
            iterarNomes(alunos, i);
        }
    } 
}