
package org.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.models.Product;

public interface ProductRepository
    extends JpaRepository<Product, Long>
{


}
