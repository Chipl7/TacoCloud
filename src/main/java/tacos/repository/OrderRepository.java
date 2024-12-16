package tacos.repository;

import tacos.model.TacoOrder;

import java.util.Optional;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);

    Optional<TacoOrder> findById(Long id);
}
