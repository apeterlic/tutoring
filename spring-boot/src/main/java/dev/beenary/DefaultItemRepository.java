package dev.beenary;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

public class DefaultItemRepository
{

    private final EntityManager entityManager;

    public DefaultItemRepository(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

   /* public Item findById(Long id)
    {
        Item item = entityManager.find(Item.class, id);
        entityManager.lock(item, LockModeType.OPTIMISTIC);
        return item;
    }

    public Item findBy(Long id)
    {
        return entityManager.find(Item.class, id, LockModeType.OPTIMISTIC);
    }*/

    public Item findById(Long id)
    {
        Item item = entityManager.find(Item.class, id);
        entityManager.lock(item, LockModeType.PESSIMISTIC_READ);
        return item;
    }

    public Item findBy(Long id)
    {
        return entityManager.find(Item.class, id, LockModeType.PESSIMISTIC_WRITE);
    }
}
