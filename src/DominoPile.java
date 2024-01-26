import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private ArrayList<Domino> pile = new ArrayList();
    public DominoPile(){
        pile.clear();
    }
    public ArrayList<Domino> getPile(){
        return this.pile;
    }
    public void newStack6(){
        int top = 0;
        int bottom = 0;
        int check = 0;
        pile.add(new Domino(0, 0));
        for(int i = 0; i <= 6; i++){
            top=i;
            for(int j = 0; j <= 6; j++){
              check = 0;
              bottom=j;
              for(int k = 0; k < this.pile.size(); k++){
                  if(top==pile.get(k).getBottom() && bottom==pile.get(k).getTop()){
                      check=1;
                  }
              }
                  if(check==0){
                    pile.add(new Domino(i, j));
                    System.out.println(new Domino (i, j));
                  }
            }
        }
    }
    public void shuffle(){
        Random random = new Random();
        ArrayList<Domino> temp = new ArrayList();
        if(temp.size()>0){
            for(int i = 0; i < this.pile.size(); i++){
                temp.add(random.nextInt(this.pile.size()-1), this.pile.get(i));
            }
            for(int i = 0; i < this.pile.size(); i++){
                this.pile.set(i, temp.get(i));
            }
        }
    }
}
