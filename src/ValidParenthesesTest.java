import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    private ValidParentheses vp;
    String st1;
    String st2;
    String st3;
    String sf1;
    String sf2;
    String sf3;
    String st1bis;
    String st2bis;
    String st3bis;
    String sf1bis;
    String sf2bis;
    String sf3bis;

    @Before
    public void init(){
        vp = new ValidParentheses();
        st1 = "((+2+(4+3/4)-2)+4)*4";
        st2 = "(([{3/4}-2]+3)+32)";
        st3 = "{((223+4)+3)-4}";

        st1bis = "";
        st2bis = "(([{}]))";
        st3bis = "{(())}";

        sf1 = "{1+2+3(4+32))/2}";
        sf2 = "{34{33+4)}";
        sf3 = "[33+90[)-4+3}";
        sf1bis = "{(}";
        sf2bis = "{{)}";
        sf3bis = "[[)}";

    }

    @Test
    public void isValid_test() {
        assertEquals(true, vp.isValid2(st1));}


    @Test
    public void isValid_test2() {
        assertEquals(true, vp.isValid2(st2));}

    @Test
    public void isValid_test3() {
        assertEquals(true, vp.isValid2(st3));}

    @Test
    public void isValid_test4() {
        assertEquals(false, vp.isValid2(sf1));}

    @Test
    public void isValid_test5() {
        assertEquals(false, vp.isValid2(sf2));}

    @Test
    public void isValid_test6() {
        assertEquals(false, vp.isValid2(sf3));}

    @Test
    public void isValid_test7() {
        assertEquals(true, vp.isValid2(st1bis));}

    @Test
    public void isValid_test8() {
        assertEquals(true, vp.isValid2(st2bis));}

    @Test
    public void isValid_test9() {
        assertEquals(true, vp.isValid2(st3bis));}

    @Test
    public void isValid_test10() {
        assertEquals(false, vp.isValid2(sf1bis));}

    @Test
    public void isValid_test11() {
        assertEquals(false, vp.isValid2(sf2bis));}

    @Test
    public void isValid_test12() {
        assertEquals(false, vp.isValid2(sf3bis));}



    }


