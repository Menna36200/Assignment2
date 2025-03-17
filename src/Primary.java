public class Primary extends PrimNumber {

    public boolean Prim(){
        int number = getNumber();

        if(number <= 1) return false;
        for(int i = 2; i < number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }

}