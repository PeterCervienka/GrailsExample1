package ch.erni.example

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import org.junit.Test
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(UsersService)
@Mock(User)
class UsersServiceSpec extends Specification {

    void setup() {

    }

    def cleanup() {
    }

    @Test
    void testService() {
        expect: (service != null);
    }

    @Test
    void testSaveAction() {
        User u = new User(firstName: "fn", lastName: "ln");
        int countBefore = service.count();

        service.save(u);

        int countAfter = service.count();

        System.out.println("Before: " + countBefore + ", after: " + countAfter);

        expect: (countAfter > countBefore);
        and: (countAfter == countBefore + 1);
    }
}
