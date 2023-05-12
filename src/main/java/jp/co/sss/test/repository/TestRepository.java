package jp.co.sss.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jp.co.sss.test.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{
    
}
