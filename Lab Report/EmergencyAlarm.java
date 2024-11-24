interface isEmergency {
    void soundSiren();
}

class FireEmergency implements isEmergency {
    @Override
    public void soundSiren() {
        System.out.println("Siren Sounded");
    }
}

class SmokeAlarm {
}

public class EmergencyAlarm {
    public static void main(String[] args) {
        Object[] myArray = new Object[4];

        myArray[0] = new SmokeAlarm();
        myArray[1] = new SmokeAlarm();
        myArray[2] = new FireEmergency();
        myArray[3] = new FireEmergency();

        for (Object obj : myArray) {
            if (obj instanceof isEmergency) {
                ((isEmergency) obj).soundSiren();
            } else {
                System.out.println("Object is not an instance of IsEmergency.");
            }
        }
    }
}
