public class BmiService {
    public double calculate(double massa,double height){
        double bmi=massa/(height*height);
        return bmi;
    }
}
