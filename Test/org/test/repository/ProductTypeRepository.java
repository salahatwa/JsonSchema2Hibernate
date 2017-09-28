
package org.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.models.ProductType;

public interface ProductTypeRepository
    extends JpaRepository<ProductType, Long>
{


}
