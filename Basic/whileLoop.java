package Basic;

class whileLoop {
    public static void main(String[] args){
        int launch_time = 10;

        while (launch_time >= 0) {
            System.out.println("Launch time: " + launch_time); 

            launch_time -= 1;
        }

        System.out.println("LIFTOFFFF");
    }
}   
