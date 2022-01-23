package Calculator;

public class Calculator{

//    Underweight	< 18.5
//    Normal	18.5 - 25
//    Overweight	25 - 30
//    Obese	> 30

    public void printBmi(int age, int height, int weight){
        double resultBmi = weight / ((height * 0.01)*(height * 0.01));
        if(age < 2 || age > 120 ) {
            System.out.println("Please provide an age between 2 and 120.");
        } else if( height >= 250 ) {
            System.out.println("Value must be less then 250");
        } else if (weight >= 400) {
            System.out.println("Value must be less then 400");
        } else {
            if(resultBmi < 18.5){
                System.out.println("BMI index is:"+resultBmi +" , "+"Underweight");
            } else if(resultBmi >= 18.5 && resultBmi < 25.0){
                System.out.println("BMI index is:"+resultBmi +" , "+"Normal");
            } else if(resultBmi >= 25.0 && resultBmi < 30.0){
                System.out.println("BMI index is:"+resultBmi +" , "+"Overweight");
            } else if(resultBmi >= 30.0){
                System.out.println("BMI index is:"+resultBmi +" , "+"Obese");
            }
        }
    }
}
