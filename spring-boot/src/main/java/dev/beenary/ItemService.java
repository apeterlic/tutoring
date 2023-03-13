package dev.beenary;

public class ItemService
{

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }
}
