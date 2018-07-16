package Random;

import java.util.Random;
import java.util.Scanner;

class Battleship {
	
	public static void main(String[] args) {
	
					int[][] bord = new int[10][10];
					int[][] schepen = new int[10][10];
					int[] schot = new int[9];
					int pogingen = 0,
			            raak = 0;
			        
			        initBoard(bord);
			        initSchepen(schepen);
			        
			        System.out.println();
			        
			        do{
			            showBoard(bord);
			            schot(schot);
			            pogingen++;
			            
			            if(hit(schot,schepen)){
			                hint(schot,schepen,pogingen);
			                raak++;
			            }                
			            else
			                hint(schot,schepen,pogingen);
			            
			            changeboard(schot,schepen,bord);
			        }

//}while(raak!=3); had het bord eerst heel klein gemaakt dus met 3 gevonden bommen was er al een winst
			        
			        while(raak!=10);
			            
			        System.out.println("\nJe hebt het spel gewonnen! Je hebt alle 10 schepen geraakt in "+pogingen+" pogingen");
			        showBoard(bord);
		
	}

				public static void initBoard(int[][] board){
			        for(int row=0 ; row < 10 ; row++ )
			            for(int column=0 ; column < 10 ; column++ )
			                board[row][column]=-1;
			    }
			    
			    public static void showBoard(int[][] board){
			        System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
			        
			        System.out.println();
			        
			        for(int row=0 ; row < 10 ; row++ ){
			            System.out.print((row+1)+"");
			            for(int column=0 ; column < 10 ; column++ ){
			                if(board[row][column]==-1){
			                    System.out.print("\t"+"~");
			                }else if(board[row][column]==0){
			                    System.out.print("\t"+"0");
			                }else if(board[row][column]==1){
			                    System.out.print("\t"+"X");
			                }
			                
			            }
			            
			            System.out.println();
			            
			        }

			    }

			    public static void initSchepen(int[][] schepen){
			        Random random = new Random();
			        
			        for(int schip=0 ; schip < 10 ; schip++){
			            schepen[schip][0]=random.nextInt(3);
			            schepen[schip][1]=random.nextInt(3);
			            
			            
			            for(int last=0 ; last < schip; last++){
			                if( (schepen[schip][0] == schepen[last][0])&&(schepen[schip][1] == schepen[last][1]) )
			                    do{
			                        schepen[schip][0]=random.nextInt(10);
			                        schepen[schip][1]=random.nextInt(10);
			                    }while( (schepen[schip][0] == schepen[last][0])&&(schepen[schip][1] == schepen[last][1]) );
			            }
			            
			        }
			    }

			    public static void schot(int[] schot){
			        Scanner input = new Scanner(System.in);
			        
			        System.out.print("Rij: ");
			        schot[0] = input.nextInt();
			        schot[0]--;
			        
			        System.out.print("Kolom: ");
			        schot[1] = input.nextInt();
			        schot[1]--;
			        
			    }
			    
			    public static boolean hit(int[] schot, int[][] schepen){
			        
			        for(int schip=0 ; schip<schepen.length ; schip++){
			            if( schot[0]==schepen[schip][0] && schot[1]==schepen[schip][1]){
			                System.out.printf("Je heb een schip geraakt op deze locatie: (%d,%d)\n",schot[0]+1,schot[1]+1);
			                return true;
			            }
			        }
			        return false;
			    }

			  public static void hint(int[] schot, int[][] schepen, int poging){
			        int row=0,
			            column=0;
			        
			        for(int line=0 ; line < schepen.length ; line++){
			            if(schepen[line][0]==schot[0])
			                row++;
			            if(schepen[line][1]==schot[1])
			                column++;
			        }
			        
			        System.out.printf("\nHint %d: \nRij %d -> %d schepen\n" +
			                                 "Kolom %d -> %d schepen\n",poging,schot[0]+1,row,schot[1]+1,column);
			    }

			    public static void changeboard(int[] schot, int[][] schepen, int[][] bord){
			        if(hit(schot,schepen))
			            bord[schot[0]][schot[1]]=1;
			        else
			            bord[schot[0]][schot[1]]=0;
			    }
			}




