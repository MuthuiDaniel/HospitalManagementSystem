//new class
public class Patient {
    private int age;
    //try catch block methods
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Invalid age provided: " + age + ". Age must be between 0 and 130.");
        }
        this.age = age;
        System.out.println("Age set successfully: " + age);
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        try {
            patient.setAge(25); // Valid age
            patient.setAge(150); // Invalid age
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
