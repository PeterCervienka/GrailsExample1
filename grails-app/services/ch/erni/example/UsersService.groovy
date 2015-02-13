package ch.erni.example

import grails.transaction.Transactional

@Transactional
class UsersService implements IBaseService<User> {

    @Override
    List<User> getAll() {
        return User.list();
    }

    @Override
    User get(Long id) {
        if (id == null) return null;
        return User.load(id);
    }

    @Override
    User save(User obj) {
        if (obj != null) {
            return obj.save()
        }
        return null;
    }

    @Override
    void remove(User obj) {
        if (obj != null) {
            obj.delete()
        }
    }

    @Override
    int count() {
        return User.count();
    }
}
