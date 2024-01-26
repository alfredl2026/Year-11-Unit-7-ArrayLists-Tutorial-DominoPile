public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return this.top;
    }
    public int getBottom(){
        return this.bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return(this.top + "/" + this.bottom);
    }
    public void flip(){
        int temp = this.top;
        this.top = this.bottom;
        this.bottom = temp;
    }
    public void settle(){
        if(bottom<top){
            flip();
        }
    }
    public int compareTo(Domino other){
        if(Math.min(this.top, this.bottom)==Math.min(other.getTop(), other.getBottom())){
            if(Math.max(this.top, this.bottom)<Math.max(other.getTop(), other.getBottom())){
                return -1;
            }
            else if(Math.max(this.top, this.bottom)>Math.max(other.getTop(), other.getBottom())){
                return 1;
            }
            else if(Math.max(this.top, this.bottom)==Math.max(other.getTop(), other.getBottom())){
                return 0;
            }
        }
        else if(Math.min(this.top, this.bottom)<Math.min(other.getTop(), other.getBottom())){
            return -1;
        }
        else if(Math.min(this.top, this.bottom)>Math.min(other.getTop(), other.getBottom())){
            return 1;
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        if(this.top+this.bottom<other.getTop()+other.getBottom()){
            return -1;
        }
        if(this.top+this.bottom>other.getTop()+other.getBottom()){
            return 1;
        }
        else if(this.top+this.bottom==other.getTop()+other.getBottom()){
            return 0;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        return this.top==other.getTop() || this.top==other.getBottom() || this.bottom==other.getTop() || this.bottom==other.getBottom();
    }
}
