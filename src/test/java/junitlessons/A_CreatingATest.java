package junitlessons;

import org.junit.Test;

public class A_CreatingATest
{
    //So I typed @Test and pressed enter
    //IntelliJ automatically imported JUnit for me
    //See above it says 'import org.junit.Test;'
    //I can now right-click inside the method and IntellIJ will offer me the option to 'Run MultipleNumbers()'
    //As it has support for running tests directly in the IDE
    @Test
    public void MultipleNumbers()
    {
        int c = 5 * 6;
    }
}
