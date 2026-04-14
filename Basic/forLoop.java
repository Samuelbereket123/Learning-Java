package Basic;


/*
This is a for loop that I made in 2026 april 14 and It shows that the number is incremetning every multiple of 3 until the finish line of 20 and since 20 is not a multiple of 3 it's left out 
and the last thing that was printed is 18 since that's the furthest the code and go

*/
class forLoop {
    public static void main(String[] args) {
        int num;

        for (num = 3; num <= 20; num += 3) {
            System.out.println("The number is: " + num);
        }
    }
}