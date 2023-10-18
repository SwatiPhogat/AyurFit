package Model;

public class HealthCompanionApp {
    String EarlyDetection;
    String Prevention;
    String Ayurveda;
    String PersonalGuidance;
    String HolisticCare;
    String HealthPlans;
    String Motivation;
    String SelfLearning;

    public HealthCompanionApp(String earlyDetection, String prevention, String ayurveda, String personalGuidance, String holisticCare, String healthPlans, String motivation, String selfLearning) {
        EarlyDetection = earlyDetection;
        Prevention = prevention;
        Ayurveda = ayurveda;
        PersonalGuidance = personalGuidance;
        HolisticCare = holisticCare;
        HealthPlans = healthPlans;
        Motivation = motivation;
        SelfLearning = selfLearning;
    }

    public String getEarlyDetection() {
        return EarlyDetection;
    }

    public void setEarlyDetection(String earlyDetection) {
        EarlyDetection = earlyDetection;
    }

    public String getPrevention() {
        return Prevention;
    }

    public void setPrevention(String prevention) {
        Prevention = prevention;
    }

    public String getAyurveda() {
        return Ayurveda;
    }

    public void setAyurveda(String ayurveda) {
        Ayurveda = ayurveda;
    }

    public String getPersonalGuidance() {
        return PersonalGuidance;
    }

    public void setPersonalGuidance(String personalGuidance) {
        PersonalGuidance = personalGuidance;
    }

    public String getHolisticCare() {
        return HolisticCare;
    }

    public void setHolisticCare(String holisticCare) {
        HolisticCare = holisticCare;
    }

    public String getHealthPlans() {
        return HealthPlans;
    }

    public void setHealthPlans(String healthPlans) {
        HealthPlans = healthPlans;
    }

    public String getMotivation() {
        return Motivation;
    }

    public void setMotivation(String motivation) {
        Motivation = motivation;
    }

    public String getSelfLearning() {
        return SelfLearning;
    }

    public void setSelfLearning(String selfLearning) {
        SelfLearning = selfLearning;
    }
}
