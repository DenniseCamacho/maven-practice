public class Calculator {
    public int addition(int input1, int input2) {
        return input1 + input2;
    }
    public double calculateTip(double price,double percentage){
        return (price * (percentage/100));
    }
    public int[] addInArray(int numberToAdd , int[] startArray){

        for (int i = 0; i < startArray.length; i++) {
            startArray[i] += numberToAdd;
        }
        return startArray;
    }

}
