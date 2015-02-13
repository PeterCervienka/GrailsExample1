package ch.erni.example

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import org.junit.Test
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ItemsService)
@Mock(Item)
class ItemsServiceSpec extends Specification {

    def setup() {
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

        Item i = new Item(text: "t", description: "d", name: "n", createdBy: u, created: new Date())

        service.save(i);

        int countAfter = service.count();

        System.out.println("Before: " + countBefore + ", after: " + countAfter);

        expect: (countAfter > countBefore);
        and: (countAfter == countBefore + 1);
    }
}
