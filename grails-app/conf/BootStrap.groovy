import ch.erni.example.Item
import ch.erni.example.User

class BootStrap {

    def usersService
    def itemsService

    def init = { servletContext ->

        def u1, u2

        if (usersService.count() == 0) {
            u1 = new User(id: 1, firstName: "Peter", lastName: "Červienka");
            u2 = new User(id: 2, firstName: "FirstName", lastName: "Lastname")
            usersService.save(u1);
            usersService.save(u2);
        } else {
            u1 = usersService.get(1);
            u2 = usersService.get(2);
        }

        if (itemsService.count() == 0) {
            itemsService.save(new Item(text: "text1", description: "description1", name: "name1", created: new Date(), createdBy: u1))
            itemsService.save(new Item(text: "text2", description: "description2", name: "name2", created: new Date(), createdBy: u2))
            itemsService.save(new Item(text: "text3", description: "description3", name: "name3", created: new Date(), createdBy: u1))
            itemsService.save(new Item(text: "text4", description: "description4", name: "name4", created: new Date(), createdBy: u2))
            itemsService.save(new Item(text: "text5", description: "description5", name: "name5", created: new Date(), createdBy: u1))
        }
    }
    def destroy = {
    }
}
