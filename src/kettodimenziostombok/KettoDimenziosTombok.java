package kettodimenziostombok;

public class KettoDimenziosTombok {

    public static void main(String[] args) {
        System.out.println("Négyzetes:");
        final int SOR_DB=3;
        final int OSZLOP_DB=5;
        int [][] negyzetes =new int [SOR_DB][OSZLOP_DB];
        
        negyzetes[1][2] =1;
        
        for (int sor = 0; sor < SOR_DB; sor++) {
            for (int oszl = 0; oszl < OSZLOP_DB; oszl++) {
                System.out.print(negyzetes[sor][oszl]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        System.out.println("Fűrészes:");
        int [][] furesz = new int [5][];
        for (int s = 0; s < 5; s++) {  
            furesz[s]= new int [s+4];
        }
        for (int sor = 0; sor < furesz.length; sor++) {
            for (int oszl = 0; oszl < furesz[sor].length; oszl++) {
                System.out.print(furesz[sor][oszl]);
            }
            System.out.println("");
        }
        System.out.println("");
        
         System.out.println("tábla");
        int [][] dobasStatisztika =new int [7][7];
        for (int i = 0; i < 10; i++) {
            int dobas1 = (int) (Math.random() * 6) + 1;
            int dobas2 = (int) (Math.random() * 6) + 1;
            dobasStatisztika[dobas1][dobas2]++;
        }
        
       
        int sorDb=dobasStatisztika.length;
        for (int sor = 1; sor < sorDb; sor++) {
            int OszlDb=dobasStatisztika.length;
            for (int oszl = 0; oszl < OszlDb; oszl++) {
                System.out.print(dobasStatisztika[sor][oszl]+ "");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        System.out.println("5-ös");
        int MERET=5;
        int [][] otostabla =new int [MERET+1][MERET+1]; 

        otostabla[0][0] = 0;
        otostabla[0][1] = 1;
        otostabla[0][2] =2;
        otostabla[0][3] =3;
        otostabla[0][4] =4;
        otostabla[0][5] =5;
        
        otostabla[1][0] =1;
        otostabla[2][0] =2;
        otostabla[3][0] =3;
        otostabla[4][0] =4;
        otostabla[5][0] =5;
        
        
        
        for (int sor = 0; sor <= MERET; sor++) {
            for (int oszl = 0; oszl <= MERET; oszl++) {
                otostabla[sor][oszl] = sor*oszl;
            }
        for (sor = 0; sor <= MERET; sor++) {
            for (int oszl = 0; oszl <= MERET; oszl++) {
                System.out.printf("%3d",otostabla[sor][oszl]);
            }
        
            
            System.out.println("");
        }
        System.out.println("");
        
        }
        
}
}

