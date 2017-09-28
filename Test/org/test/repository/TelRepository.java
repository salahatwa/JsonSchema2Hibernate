
package org.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.models.Tel;

public interface TelRepository
    extends JpaRepository<Tel, Long>
{


}
