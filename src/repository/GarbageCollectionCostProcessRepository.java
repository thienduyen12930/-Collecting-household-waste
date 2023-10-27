package Repository;

import DataAccess.CollectingGarbageDao;
import java.util.List;

public class GarbageCollectionCostProcessRepository implements IGarbageCollectionCostProcessRepository {

    @Override
    public void display(List<Integer> lt) {
        CollectingGarbageDao.Instance().display(lt);
    }

}