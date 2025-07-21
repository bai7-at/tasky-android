package com.nytimes.android.resourcedownloader.data;

import com.nytimes.android.resourcedownloader.utils.FileSystemPersister;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class ResourceRepository_Factory implements ba2 {
    private final p76 databaseProvider;
    private final p76 fileSystemPersisterProvider;
    private final p76 resourceDaoProvider;
    private final p76 sourceDaoProvider;

    public ResourceRepository_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.databaseProvider = p76Var;
        this.resourceDaoProvider = p76Var2;
        this.sourceDaoProvider = p76Var3;
        this.fileSystemPersisterProvider = p76Var4;
    }

    public static ResourceRepository_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ResourceRepository_Factory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static ResourceRepository newInstance(ResourceDatabase resourceDatabase, ResourceDao resourceDao, SourceDao sourceDao, FileSystemPersister fileSystemPersister) {
        return new ResourceRepository(resourceDatabase, resourceDao, sourceDao, fileSystemPersister);
    }

    @Override // defpackage.p76
    public ResourceRepository get() {
        return newInstance((ResourceDatabase) this.databaseProvider.get(), (ResourceDao) this.resourceDaoProvider.get(), (SourceDao) this.sourceDaoProvider.get(), (FileSystemPersister) this.fileSystemPersisterProvider.get());
    }
}
