/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beratbadan.Female;
import beratbadan.Male;
import beratbadan.BeratIdeal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

/**
 *
 * @author Indri
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMale() {
        System.out.println("-----Testing Rumus Male----");
        BeratIdeal instance = new BeratIdeal();
        double expResult = 72;
        Male male = new Male(80,180);
        double result = instance.CalculateBerat(male);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testFemale() {
        System.out.println("\n-----Testing Rumus Female----");
        BeratIdeal instance = new BeratIdeal();
        double expResult = 68;
        Female Female = new Female(50,180);
        double result = instance.CalculateBerat(Female);
        assertEquals(expResult, result, 0.0);
    }
  
    //Mengetes value terhadap nama
    @Test
    public void NotnullVal(){
        System.out.println("\n-----Test Nama NOT NULL----");
        String nama = BeratIdeal.nama();
        assertThat(nama,is(not(nullValue())));        
    }
    
    //ini untuk mengetes huruf awal harus sama kaya value
    @Test
    public void startWithVal(){
        System.out.println("\n-----Test Nama Star With----");
        String nama = BeratIdeal.nama();
        assertThat(nama,startsWith("Ang"));   
    }
    
    @Test
    public void startWithJenisKelamin(){
        System.out.println("\n----Test Jenis Kelamin Star With----");
        String jawabanJenisKelamin = BeratIdeal.rumusByJenisKelamin();
        assertThat(jawabanJenisKelamin,startsWith("P"));   
    }
    
    @Test
    public void testUmur() {
        System.out.println("\n----Test Umur----");
        int expResult = 20;
        int umur = BeratIdeal.umur();
        System.out.println("Exp Result :"+ expResult);
        System.out.println("Result :" + umur);
        assertEquals(expResult, umur);  
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
