package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class TestCodeGenerator {
    
     public static void main(String[] args) {
        String filePath = "C:\\Users\\PANAM SOLUTION\\Desktop\\COURS M2\\INF563\\TPEQUATIONSECONDDEGRE\\equationseconddegree\\src\\test\\java\\com\\example\\EquationSolverTest.java";
        String testPrefixMethod = "testSolve";
        String testCaseFile = "C:\\Users\\PANAM SOLUTION\\Desktop\\COURS M2\\INF563\\TPEQUATIONSECONDDEGRE\\equationseconddegree\\src\\test-case.txt";

        String fileHeader="package com.example;\n" + 
                "import static org.junit.Assert.assertEquals;\n" +
                "import org.junit.Test;\n" +
                "import java.lang.reflect.InvocationTargetException;\n" +
                "public class EquationSolverTest {\n";

        String fileFooter ="}\n";

        String fileContent="";

        try (BufferedReader br = new BufferedReader(new FileReader(testCaseFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");


                HashMap<String,Double> a = generateRadonValueInIntervalle(values[1]);
                HashMap<String,Double> b = generateRadonValueInIntervalle(values[2]);
                HashMap<String,Double> c = generateRadonValueInIntervalle(values[3]);

                String testName = testPrefixMethod;
                String a_key="";
                String b_key="";
                 String c_key="";
                for (String key : a.keySet()) {
                    a_key=key;
                }
                 for (String key : b.keySet()) {
                    b_key=key;
                }

                for (String key : c.keySet()) {
                    c_key=key;
                }

                
                fileContent+= generateTestCode(testName+a_key+b_key+c_key, a.get(a_key), b.get(b_key),c.get(c_key));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


         try (FileWriter writer = new FileWriter(filePath)) {
                    writer.write(fileHeader+fileContent+fileFooter);
                } catch (IOException e) {
                    e.printStackTrace();
                }
       
    }

    private  static String generateTestCode(String testName, double a, double b,double c) {
        final double tolerance = 1e-5;
        final double discriminant = b * b - 4 * a * c;
        if (Math.abs(a) < tolerance) {
            return String.format(
                " @Test(expected = InvocationTargetException.class)\n" +
                " public void %s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {\n"+
                "        double a = %s;\n" +
                "        double b = %s;\n" +
                "        double c = %s;\n\n" +
                "        Class<?> dynamicClass = Class.forName(\"com.example.EquationSolver\");\n" +
                "        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();\n" +
                "        try {\n"+
                "          dynamicClass.getMethod(\"solve\", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);\n"+
                "        } catch (IllegalArgumentException e) {\n"+
                "          System.err.println(e.getMessage());\n"+
                "         }\n"+ 
                " }\n\n\n",
                testName, a, b, c);
        }else if (discriminant < 0) {
            return String.format(
                " @Test(expected = InvocationTargetException.class)\n" +
                " public void %s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {\n"+
                "        double a = %s;\n" +
                "        double b = %s;\n" +
                "        double c = %s;\n\n" +
                "        Class<?> dynamicClass = Class.forName(\"com.example.EquationSolver\");\n" +
                "        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();\n" +
                "        try {\n"+
                "          dynamicClass.getMethod(\"solve\", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);\n"+
                "        } catch (IllegalArgumentException e) {\n"+
                "          System.err.println(e.getMessage());\n"+
                "         }\n"+ 
                " }\n\n\n",
                testName, a, b, c);
        }else {
            return String.format(
                "    @Test\n" +
                "    public void %s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {\n" +
                "        double a = %s;\n" +
                "        double b = %s;\n\n" +
                "        double c = %s;\n\n\n" +
                "        Class<?> dynamicClass = Class.forName(\"com.example.EquationSolver\");\n" +
                "        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();\n" +
                "        double[] result = (double[]) dynamicClass.getMethod(\"solve\", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);\n"+
                
                "        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);\n" +
                "        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);\n" +
            
                "    }\n\n\n",
                testName, a, b,c);
        }
    }

    public static  HashMap<String, Double> generateRadonValueInIntervalle(String input) {
        // Associer chaque lettre à l'intervalle correspondant
        HashMap<String, Double> intervalValue= new HashMap<>();

        char letter = input.charAt(input.length() - 1); // Dernier caractère de la chaîne
        String prefix = input.contains("1") ? "_a_" : input.contains("2") ?"_b_" :"_c_";
        switch (letter) {
            case 'a':
                intervalValue.put(prefix + "null", 0.0);
                break;
            case 'b':
                intervalValue.put(prefix + "tres_proche_de_zero_", getRandomValue(1e-7, 1e-6));
                break;
            case 'c':
                intervalValue.put(prefix + "tres_proche_de_0_negatif_", getRandomValue(-1e-6, 1e-7));
                break;
            case 'd':
                intervalValue.put(prefix + "proche_de_0_positif_",getRandomValue(1.0, 5.0));
                break;
            case 'e':
                intervalValue.put(prefix + "proche_de_0_negatif_",getRandomValue(-5.0, -1.0));
                break;
            case 'f':
                intervalValue.put(prefix + "normal_positif_",getRandomValue(10.0, 500.0));
                break;
            case 'g':
                intervalValue.put(prefix + "normal_negatif_",getRandomValue(-500.0, -10.0));
                break;
            case 'h':
                intervalValue.put(prefix + "grand_positif_",getRandomValue(1e6, 1e9));
                break;
            case 'i':
                intervalValue.put(prefix+ "negatif_grand_",getRandomValue(-1e9, -1e6));
                break;
            default:
                throw new IllegalArgumentException("Caractère invalide dans la chaîne d'entrée.");
        }

        // Extraire le nombre du début de la chaîne
        // double number = Double.parseDouble(input.substring(0, input.length() - 1));

        // Calculer le résultat final
        // double result = number * intervalValue;

        return intervalValue;
    }

    public static double getRandomValue(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble();
    }
    
}
