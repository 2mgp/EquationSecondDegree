package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
public class EquationSolverTest {
 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_negatif_grand__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = -5.308156382314813E7;
        double c = 1.6527990233231657E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_tres_proche_de_zero__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.5678139779966817E-7;
        double b = 1.4481696135951152E-7;
        double c = -6.349589290803738E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_grand_positif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -5.258201998937422E-8;
        double b = 9.630513035822756E8;
        double c = 0.0;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_tres_proche_de_0_negatif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.4904173123552655;
        double b = -2.259437449355281E-7;

        double c = -6.02770511374572E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_proche_de_0_negatif__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -3.1143079010745987;
        double b = -3.977354452149643;

        double c = 47.948927538144254;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_positif__b_normal_negatif__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 70.20909002603929;
        double b = -448.4181863127464;

        double c = -2.9901911592838917;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_negatif__b_null_c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -474.797724202907;
        double b = 0.0;

        double c = 8.139785170192525E8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_grand_positif__b_proche_de_0_positif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 5.973925283972429E8;
        double b = 3.25578258378107;
        double c = 2.3760162341769715;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_negatif_grand__b_normal_positif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -4.5916112149261475E7;
        double b = 32.34488626781311;
        double c = -228.88802324578194;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_null_c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = 0.0;
        double c = -5.423617171376643E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_null_c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 5.123269915121791E-7;
        double b = 0.0;
        double c = 3.7756284528175366;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_null_c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -4.450300411156817E-7;
        double b = 0.0;
        double c = -2.218624113232821;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_proche_de_0_positif__b_null_c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.849178634621282;
        double b = 0.0;
        double c = 8.416410816952415E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_null_c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -1.633376480069603;
        double b = 0.0;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_positif__b_null_c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 58.21679708634341;
        double b = 0.0;
        double c = 334.93785560237063;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_negatif__b_tres_proche_de_zero__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -158.31340742378364;
        double b = 4.1139053477566244E-7;
        double c = -317.74807728119663;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_grand_positif__b_null_c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 4.288178752844523E8;
        double b = 0.0;

        double c = -1.9044919115109145E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_negatif_grand__b_null_c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -9.74981643700075E8;
        double b = 0.0;

        double c = 33.2563996260501;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_tres_proche_de_0_negatif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = -3.1722250698303797E-7;
        double c = 0.0;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_proche_de_0_positif__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = 3.090440701729092;
        double c = -4.069857185756483;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_proche_de_0_negatif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = -4.481533288528779;
        double c = 3.1015092100572264;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_normal_positif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = 489.92850963559897;
        double c = -8.35724951962379E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_normal_negatif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = -61.5767355196715;
        double c = -359.4008233781176;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_grand_positif__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = 6.704350848047042E8;
        double c = 5.615242133990273E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_negatif_grand__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 1.5758598311563645E-7;
        double b = -2.7142745028225875E8;
        double c = -4.506886724766451E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_proche_de_0_negatif__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -9.316190137607585E-7;
        double b = -2.028854036159911;
        double c = -8.02690454597779E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_negatif_grand__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 4.0602990023226555;
        double b = -3.483408068509475E8;

        double c = -8.386213937131042E8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_proche_de_0_negatif__b_tres_proche_de_0_negatif__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -1.7209202446135583;
        double b = -8.824201901943803E-7;
        double c = -1.2311585867634714E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_normal_positif__b_grand_positif__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 470.628225919315;
        double b = 3.270462633192404E8;

        double c = -8.725431201144315E8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_negatif__b_proche_de_0_positif__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -498.551093645618;
        double b = 3.3978155495873117;
        double c = -8.260639197849269E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_grand_positif__b_normal_positif__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.6330061733820144E7;
        double b = 290.98394601834553;

        double c = -6.232872769994743E8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_negatif_grand__b_normal_negatif__c_negatif_grand_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -4.673610521776359E8;
        double b = -217.1926038888347;
        double c = -7.334454343280928E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_null_b_tres_proche_de_zero__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 0.0;
        double b = 6.759249132178655E-7;
        double c = 361.8064567837525;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_proche_de_0_positif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 8.953722606282546E-7;
        double b = 4.08799612415774;
        double c = 7.962071080598557E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_negatif_grand__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -2.3460061761550364;
        double b = -4.6878428220268226E8;

        double c = 1.2339022136691125E8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_negatif_grand__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -4.324984684571447E-7;
        double b = -3.0337156345086396E8;
        double c = -440.14763507970554;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_proche_de_0_positif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.686279889498544;
        double b = 1.3744290217243158;

        double c = -348.6924513972161;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_positif__b_proche_de_0_negatif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 260.20480102870874;
        double b = -3.9126069920042568;

        double c = -245.24011917300137;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_negatif__b_tres_proche_de_0_negatif__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -111.9687755587982;
        double b = -4.6559409370036485E-7;

        double c = 443.55349304520195;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_grand_positif__b_grand_positif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.369581059048747E8;
        double b = 7.104894275696665E8;

        double c = -200.37871195739655;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_negatif_grand__b_proche_de_0_positif__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -5.816891987363474E8;
        double b = 4.2454400280750395;

        double c = 8.382336946654351E8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_proche_de_0_negatif__b_tres_proche_de_zero__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -2.7644562216034383;
        double b = 1.8622493575581495E-7;
        double c = -1.6764564078607616;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_normal_positif__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 6.802108933880965E-7;
        double b = 63.055401931237526;
        double c = 239.30531652439117;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_grand_positif__b_normal_negatif__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.2742039640266806E8;
        double b = -398.76066268883415;
        double c = 1.5391657428731987E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_normal_positif__b_normal_positif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 306.7746228863977;
        double b = 224.45404387715206;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_normal_positif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -2.6489209812155455E-7;
        double b = 336.23538419177606;
        double c = 8.586336485752478E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_normal_negatif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -5.673426972158848E-7;
        double b = -359.51461858718824;
        double c = 1.846388376005542;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_grand_positif__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.7515047396995302;
        double b = 6.967354344580389E8;

        double c = -2.0298250961214896;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_negatif__b_grand_positif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -79.1307296020708;
        double b = 5.388838551723799E8;

        double c = 2.037542257240758;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_negatif_grand__b_negatif_grand__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -4.098678244756193E8;
        double b = -4.078458302720263E8;

        double c = 2.986174322289334;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_positif__b_tres_proche_de_zero__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 484.4057535450422;
        double b = 7.745458136863844E-7;
        double c = 1.4594804089435742;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_tres_proche_de_0_negatif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 4.862190360148901E-7;
        double b = -2.64040747535733E-7;
        double c = -147.2300895932499;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_proche_de_0_negatif__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.3991909057829425E-7;
        double b = -4.770693063155807;
        double c = 6.493176258394116E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_normal_positif__b_proche_de_0_positif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 366.4435113100581;
        double b = 2.370217888594713;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_negatif_grand__b_proche_de_0_negatif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -2.7424218689514256E8;
        double b = -4.914938908705429;

        double c = 3.2704060173669473E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_negatif__b_normal_negatif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -145.15074973895332;
        double b = -256.57466509663084;

        double c = -3.740212559518513E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_proche_de_0_positif__b_tres_proche_de_zero__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.2151518839342983;
        double b = 7.328094815389988E-7;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_normal_positif__c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -3.14482044344154;
        double b = 226.29331022712012;

        double c = -165.44259297543;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_grand_positif__b_negatif_grand__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 9.829330115579286E8;
        double b = -5.1312164093357056E8;

        double c = -4.205853489294869;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_positif__b_tres_proche_de_0_negatif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 365.6581918264463;
        double b = -6.623035334013806E-7;
        double c = 6.70188000866862E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_negatif_grand__b_tres_proche_de_zero__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -6.865113135539234E8;
        double b = 8.519779118508398E-7;
        double c = -9.530345967387341E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_normal_negatif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 9.768182274735031E-7;
        double b = -203.12586601835403;
        double c = 0.0;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_grand_positif__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 1.0221294000433652;
        double b = 2.383662895113378E8;

        double c = 341.54128635922575;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_tres_proche_de_zero__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 9.895113865635844E-8;
        double b = 3.45250234713431E-7;
        double c = 6.575516275574354E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_grand_positif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -2.0403857697052903;
        double b = 5.61792004529488E7;

        double c = 3.027762445916228;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_negatif__b_proche_de_0_negatif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -348.0598245046342;
        double b = -3.7351738828961185;

        double c = 6.57743798363755E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_grand_positif__b_proche_de_0_negatif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 4.836713276468293E8;
        double b = -3.5472190869309386;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_negatif_grand__b_tres_proche_de_0_negatif__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -4.939829388844137E8;
        double b = -4.880887312422327E-7;
        double c = -1.625279017128268;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_proche_de_0_positif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -9.90304164957786E-7;
        double b = 4.152382873024346;
        double c = -9.87348054372113E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_proche_de_0_positif__b_normal_positif__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.063008292378326;
        double b = 455.63305993815277;
        double c = 3.381527349763651E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_grand_positif__b_tres_proche_de_zero__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 1.704036663667658E8;
        double b = 7.655471885768943E-7;
        double c = 4.613230409869303E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_grand_positif__b_negatif_grand__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.2637941546606252E8;
        double b = -1.5263499542105484E8;

        double c = 299.9479013809457;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_normal_negatif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -2.1904160586565924;
        double b = -339.65797429485235;

        double c = 5.036057860818274E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_negatif__b_negatif_grand__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -93.65354106142911;
        double b = -6.33616224126777E8;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_grand_positif__b_tres_proche_de_0_negatif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 8.014472905514997E8;
        double b = -1.3149601236106375E-7;
        double c = 1.0632731717072765;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_grand_positif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 4.53750176691098E-7;
        double b = 1.3903794575704044E8;
        double c = -8.887245158081857E-7;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_normal_negatif__b_normal_positif__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -205.41197694505274;
        double b = 189.32372106096722;

        double c = -2.9241707773008083;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_proche_de_0_positif__b_proche_de_0_negatif__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 3.9796609804242027;
        double b = -1.0021201204957388;

        double c = -4.6825390397842135;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_normal_positif__b_negatif_grand__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 333.9187999515186;
        double b = -8.484066396214406E8;

        double c = -5.513698948322262E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_proche_de_0_positif__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -1.676063854810935E-7;
        double b = 1.6086690540060107;
        double c = 424.00426593231106;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_normal_negatif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.9869714692591898;
        double b = -349.8710213691728;

        double c = 4.787325981391854;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_proche_de_0_negatif__b_proche_de_0_positif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -1.6544321635807209;
        double b = 4.000178250610167;

        double c = -8.813575774136631E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


    @Test
    public void testSolve_a_negatif_grand__b_grand_positif__c_null() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -8.224618701416563E8;
        double b = 6.955897659358305E8;

        double c = 0.0;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_0_negatif__b_tres_proche_de_0_negatif__c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -1.700228277559773E-7;
        double b = -5.978031144667562E-7;
        double c = 2.917602980939409E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_tres_proche_de_zero__c_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 1.7531254015836033E-7;
        double b = 4.524299513839652E-7;
        double c = -2.9821108152350053;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_positif__b_null_c_grand_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 96.2531281588422;
        double b = 0.0;
        double c = 7.419097126261312E8;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_negatif__b_null_c_normal_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = -465.90867408310373;
        double b = 0.0;
        double c = -28.849468445233015;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_proche_de_0_negatif__c_tres_proche_de_0_negatif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 2.819919695140456;
        double b = -4.590280145675259;

        double c = 7.10027202515662E-8;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_tres_proche_de_zero__b_normal_positif__c_proche_de_0_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 7.580223751726382E-7;
        double b = 349.81099592615686;
        double c = 2.3226042130336824;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


 @Test(expected = InvocationTargetException.class)
 public void testSolve_a_normal_positif__b_normal_negatif__c_normal_positif_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 35.52735524227868;
        double b = -52.14378963463815;
        double c = 271.8439907400047;

        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        try {
          dynamicClass.getMethod("solve", double.class, double.class, double.class).invoke(dynamicObject, a, b, c);
        } catch (IllegalArgumentException e) {
          System.err.println(e.getMessage());
         }
 }


    @Test
    public void testSolve_a_proche_de_0_positif__b_grand_positif__c_tres_proche_de_zero_() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
        double a = 4.188240239347645;
        double b = 3.618647588392296E8;

        double c = 9.340972113695178E-7;


        Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
        Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
        double[] result = (double[]) dynamicClass.getMethod("solve", double.class, double.class,double.class).invoke(dynamicObject, a, b,c);
        assertEquals(0, a * result[0]*result[0] + b*result[0] + c, 1e-5);
        assertEquals(0, a * result[1]*result[1] + b*result[1] + c, 1e-5);
    }


}
