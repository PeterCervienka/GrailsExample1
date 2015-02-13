package ch.erni.example.list

import ch.erni.example.Item
import ch.erni.example.User

class ItemsDetailController {

    def usersService;
    def itemsService;

    def index() {
        if (params.id != null) {

            def item = itemsService.get(params.getLong("id"))
            [itemObj: item]
        }

    }

    def save() {
        User user = usersService.get(1);

        Item item

        System.out.print(params)

        if (params.id != null && params.getLong("id") > 0) {
            item = itemsService.get(params.getLong("id"))
            item.name = params.name;
            item.description = params.description;
            item.text = params.text;
            item.updated = new Date();
            item.updatedBy = user;
        } else {
            item = new Item(name: params.name, description: params.description, text: params.text, created: new Date(), createdBy: user);
        }

        itemsService.save(item);

        redirect(view: "index", controller: "itemsList");
    }
}
