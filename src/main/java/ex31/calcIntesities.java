package ex31;

public class calcIntesities extends getData{
    public int calcHeartRate(double age, double restHeartRate, double intensity){
        double x = Math.ceil(((((220.0 -age) - restHeartRate) * intensity) + restHeartRate));
        return (int)x;
    }
    public void returnRates(){
        double age = getAge();
        double restRate = getRestHeartRate();
        double intensity = 0.55;
        System.out.println("Resting pulse: " + restRate + "\t Age: " + age);
        System.out.println("");
        System.out.println("Intensity\t| Rate");
        System.out.println("------------|---------");
        for(int i = 0; i < 8; i++){
            int rate = calcHeartRate(age, restRate, intensity);
            System.out.println(Math.round(intensity*100.0) + "%\t\t\t| " + rate + " bpm");
            intensity += 0.05;
        }
    }
}
