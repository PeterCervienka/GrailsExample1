package ch.erni.example.list

import ch.erni.example.Item

class ItemsListController {

    def itemsService;

    def index() {
        // add array to controller. Without this, i cant use this array in view
        def list =  itemsService.getAll().sort({ it.id })

        def map = [items : list]

        render(view: "index", model: map)
    }

    def actionShowDetail() {
        redirect(controller: "itemsDetail", params: [id: params.id]);
    }

    def actionRemoveDetail() {

        def item = itemsService.get(params.getLong("id"));
        itemsService.remove(item);

        def map = [items : itemsService.getAll().sort({ it.id })];

        render(view: "_table", model: map)
    }

}
