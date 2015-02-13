package ch.erni.example

import grails.transaction.Transactional

@Transactional
class ItemsService implements IBaseService<Item> {

    @Override
    List<Item> getAll() {
        return Item.list();
    }

    @Override
    Item get(Long id) {
        if (id == null) return null;
        return Item.load(id);
    }

    @Override
    Item save(Item obj) {
        if (obj != null) {
            return obj.save()
        }
        return null;
    }

    @Override
    void remove(Item obj) {
        if (obj != null) {
            obj.delete()
        }
    }

    @Override
    int count() {
        return Item.count();
    }
}
