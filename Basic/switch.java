package Basic;

class switchLearn {
    public static void main(String[] args) {
        
        int days = 3;

        switch(days) {
            case 1:
                System.out.println("This will not be printed");
                break;
            case 2:
                System.out.println("This will not be printed");
                break;
            case 3:
                System.out.println("This will be printed");
                break;
            case 4:
                System.out.println("This will not be printed");
                break;
        }
    }
}