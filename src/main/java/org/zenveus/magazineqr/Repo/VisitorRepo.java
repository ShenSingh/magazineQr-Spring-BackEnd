package org.zenveus.magazineqr.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zenveus.magazineqr.entity.Visitor;

public interface VisitorRepo extends JpaRepository<Visitor, String> {

    @Query(value = "SELECT * FROM Visitor WHERE visitor_id = ?1", nativeQuery = true)
    Visitor findVisitorById(String id);
}
