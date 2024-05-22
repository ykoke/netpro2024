import java.io.Serializable;

public class TaskObject implements ITask,Serializable {

    int x;
    int result;

    public void setExecNumber(int x){
        this.x = x;
    }

    public boolean oneunder(int x) {
        if(x<=1){
            System.exit(0);
        }
        return true;
    }

    public void exec() {
        this.result = -1;
        if(x<2){
            return;
        }
        for(int i = x; i>=2; i--){
            boolean isPrime = true;
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                result = i;
                break;
            }
        }
    }

    public int getResult(){
        return result;
    }
}