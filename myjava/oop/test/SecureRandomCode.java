package myjava.oop.test;

import java.security.SecureRandom;
import java.util.Base64;

public class SecureRandomCode
{
    public static void main(String[] args)
    {
        // Create an instance of the SecureRandom class
        SecureRandom secureRandom = new SecureRandom();

        // Generate a secure random integer
        int randomInt = secureRandom.nextInt();
        System.out.println("Secure Random Integer: " + randomInt);

        // Generate a secure random integer within a range (0 to 99)
        int randomIntRange = secureRandom.nextInt(100); // 0 to 99
        System.out.println("Secure Random Integer (0 to 99): " + randomIntRange);

        // Generate a secure random double (0.0 to 1.0)
        double randomDouble = secureRandom.nextDouble();
        System.out.println("Secure Random Double: " + randomDouble);

        // Generate a secure random boolean
        boolean randomBoolean = secureRandom.nextBoolean();
        System.out.println("Secure Random Boolean: " + randomBoolean);

        // Generate a secure random byte array and convert it to a Base64 encoded string
        byte[] randomBytes = new byte[16]; // 128 bits
        secureRandom.nextBytes(randomBytes);
        String randomString = Base64.getEncoder().encodeToString(randomBytes);
        System.out.println("Secure Random Base64 String: " + randomString);
    }
}