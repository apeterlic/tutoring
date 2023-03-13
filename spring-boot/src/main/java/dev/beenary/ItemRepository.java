package dev.beenary;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>
{
        @Lock(LockModeType.PESSIMISTIC_READ)
        @Query("SELECT COUNT(*) FROM Item i")
        long getItemCount();
}



