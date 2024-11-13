package set_map_generics.set.testee;

public class Teste {

    public static void main(String[] args) {
        int vet1[] = {10,23,41,64,12,92,83,54,72,69,28};

        int r1 = 0, r2 = 0;
        for (int nCont = 0; nCont< vet1.length; nCont++){
            if (vet1[nCont] % 2 ==0){
                r1 += vet1[nCont];
            }
            else

                r2 +=vet1[nCont];

            if (r1%2==0){
                System.out.println(r1);
            }
        }


    }
}
