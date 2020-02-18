package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {

    @Before
    public void before() {
        user.login("michael.orekh@gmail.com", "Or.ru1999");
    }

    @Test
    public void searchBySearchTermTest() {

    }
}
