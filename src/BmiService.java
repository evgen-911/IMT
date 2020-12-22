public class BmiService {

    public float calculate(float bodyMass, float height) {
        float heightFinish = (height / 100) * (height / 100);
        float imt = bodyMass / heightFinish;
        return imt;
    }

}
