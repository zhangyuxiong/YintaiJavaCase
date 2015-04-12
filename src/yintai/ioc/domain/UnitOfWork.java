package yintai.ioc.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyuxiong on 2015/4/12.
 */
public class UnitOfWork {
    private List newObjects = new ArrayList();
    private List dirtyObjects = new ArrayList();
    private List removedObjects = new ArrayList();

    public void registerNew(DomainObject object) {
        this.newObjects.add(object);
    }

    public void registerDirty(DomainObject object){
        this.dirtyObjects.add(object);
    }

    public void registerRemoved(DomainObject object){
        this.removedObjects.add(object);
    }
}
