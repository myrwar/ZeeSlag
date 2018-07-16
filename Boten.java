package methode;

public class Boten {
    
    private static char[][] bord = new char[10][10];
    private static int[] schipLengte = { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5,}; 
//boten verschillende grootte
    private static void init() {
        for(int i = 0; i < bord.length; i++) {
            for(int j = 0; j < bord[0].length; j++) {
                bord[i][j] = 'O';
            }
        }
    } 
    private static void addSchepen() {
        for(int schip: schipLengte) {
            System.out.println("Schip plaatsen " + schip);
            boolean added = false;
            while(!added) {
                int x = (int)(bord.length * Math.random());
                int y = (int)(bord[0].length * Math.random());
                boolean vertical = ((int)(10 * Math.random())) % 2 == 0;
                
//checkt dat boten niet dubbel komen
                if(vertical) {
                    boolean heeftPlek = true;
                    for(int i = 0; i < schip; i++) {
                        if(y + i >= bord[0].length) {
                            heeftPlek = false;
                            break;
                        }
                        if(bord[x][y+i] != 'O') {
                            heeftPlek = false;
                            break;
                        }
                    }
                    if(!heeftPlek) {
                        
                        continue;
                    }
                    for(int i = 0; i < schip; i++) {
                        bord[x][y+i] = 'X';
                    }
                    added = true;
                } else {
               
                    boolean heeftPlek = true;
                    for(int i = 0; i < schip; i++) {
                        if(x + i >= bord.length) {
                            heeftPlek = false;
                            break;
                        }
                        if(bord[x+i][y] != 'O') {
                            heeftPlek = false;
                            break;
                        }
                    }
                    if(!heeftPlek) {                  
                        continue;
                    }
                    for(int i = 0; i < schip; i++) {
                        bord[x+i][y] = 'X';
                    }
                    added = true;
                }
            }
        }
    } 
    private static void print() {
        for(int i = 0; i < bord.length; i++) {
            for(int j = 0; j < bord[0].length; j++) {
                System.out.print(""+bord[i][j]);
            }
            System.out.println("");
        }
    } 
    public static void main(String[] args) {
        init();
        print();
        addSchepen();
        print();
    }
}
