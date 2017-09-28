
package org.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.models.Org;

public interface OrgRepository
    extends JpaRepository<Org, Long>
{


}
