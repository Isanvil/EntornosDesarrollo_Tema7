import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;


class PasswordVerifyTest {

    @Test
    public void testVacio() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial", fe.getMensaje());
    }

    @Test
    public void test_hola() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("hola");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial", fe.getMensaje());
    }

    @Test
    public void test_holacaracola() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("holacaracola");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial", fe.getMensaje());

        ///ToDo La siguiente linea es a posteriori
        //assertEquals(new EsCorrecto(true, "Es correcto"), p.verificaContrasenya("holacaracola"));
    }

    @Test
    public void test_hola12() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("hola12");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                "La contrasenya ha de contenir almenys un caràcter especial", fe.getMensaje());
    }

    @Test
    public void test_holA() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("holA");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys un caràcter especial", fe.getMensaje());
    }

    @Test
    public void test_holaExcalamacion() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("hola!");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula", fe.getMensaje());
    }

    @Test
    public void test_holaAExclamacion() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("holA!");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys 2 números", fe.getMensaje());
    }

    @Test
    public void test_hola12Exclamacion() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("hola12!");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula", fe.getMensaje());
    }

    @Test
    public void test_hola12A() {
        PasswordVerify p = new PasswordVerify();
        EsCorrecto fe = p.verificaContrasenya("hola12A");

        assertEquals(false, fe.isCorrect());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                "La contrasenya ha de contenir almenys un caràcter especial", fe.getMensaje());
    }

    @Test
    public void test_holacaracola12() {

    }

    @Test
    public void test_holacaracolaExclamacion() {

    }

    @Test
    public void test_holacaracolA() {

    }

    @Test
    public void test_hol12A() {

    }

    @Test
    public void test_holacaracolaAExclamacion() {

    }

    @Test
    public void test_holacaracola12Exclamacion() {

    }

    @Test
    public void test_holacaracola12A() {

    }

    @Test
    public void test_holacaracola12AExclamacion() {

    }

    @Test
    void test_hashP4blit0cl4v0uncl4vit0Hash() {

    }
}