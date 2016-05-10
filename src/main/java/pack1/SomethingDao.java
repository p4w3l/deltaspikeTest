package pack1;

import java.util.List;
import javax.transaction.Transactional;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

//@Transactional
@Repository
public interface SomethingDao extends EntityRepository<Something, Long> { }
