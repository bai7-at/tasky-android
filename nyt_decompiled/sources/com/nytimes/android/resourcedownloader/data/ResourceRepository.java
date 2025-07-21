package com.nytimes.android.resourcedownloader.data;

import com.nytimes.android.resourcedownloader.data.ResourceRepository;
import com.nytimes.android.resourcedownloader.model.GlobalResourceSource;
import com.nytimes.android.resourcedownloader.model.Resource;
import com.nytimes.android.resourcedownloader.model.ResourceSource;
import com.nytimes.android.resourcedownloader.utils.FileSystemPersister;
import defpackage.vu3;
import defpackage.zq3;
import defpackage.zt6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ResourceRepository {
    private final ResourceDatabase database;
    private final FileSystemPersister fileSystemPersister;
    private final ResourceDao resourceDao;
    private final SourceDao sourceDao;

    public ResourceRepository(ResourceDatabase resourceDatabase, ResourceDao resourceDao, SourceDao sourceDao, FileSystemPersister fileSystemPersister) {
        zq3.h(resourceDatabase, "database");
        zq3.h(resourceDao, "resourceDao");
        zq3.h(sourceDao, "sourceDao");
        zq3.h(fileSystemPersister, "fileSystemPersister");
        this.database = resourceDatabase;
        this.resourceDao = resourceDao;
        this.sourceDao = sourceDao;
        this.fileSystemPersister = fileSystemPersister;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearGlobalResources$lambda$9(ResourceRepository resourceRepository, List list) {
        zq3.h(resourceRepository, "this$0");
        zq3.h(list, "$globalResourceUrls");
        for (ResourceSourceEntity resourceSourceEntity : resourceRepository.sourceDao.getAll()) {
            if ((resourceSourceEntity.getResourceSource() instanceof GlobalResourceSource) && !list.contains(resourceSourceEntity.getResourceEntityUrl())) {
                resourceRepository.sourceDao.delete(resourceSourceEntity.getId());
            }
        }
        Iterator<T> it2 = resourceRepository.resourceDao.getAndDeleteResourcesWithNoSources().iterator();
        while (it2.hasNext()) {
            resourceRepository.fileSystemPersister.a((String) it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearResourcesWithoutSources$lambda$6(ResourceRepository resourceRepository, Set set, Set set2) {
        zq3.h(resourceRepository, "this$0");
        zq3.h(set, "$types");
        zq3.h(set2, "$sourcesToKeep");
        for (ResourceSourceEntity resourceSourceEntity : resourceRepository.sourceDao.getAll()) {
            ResourceSource resourceSource = resourceSourceEntity.getResourceSource();
            if (set.contains(zt6.b(resourceSource.getClass())) && !set2.contains(resourceSource)) {
                resourceRepository.sourceDao.delete(resourceSourceEntity.getId());
            }
        }
        Iterator<T> it2 = resourceRepository.resourceDao.getAndDeleteResourcesWithNoSources().iterator();
        while (it2.hasNext()) {
            resourceRepository.fileSystemPersister.a((String) it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertOrUpdateResource$lambda$0(ResourceRepository resourceRepository, Resource resource, ResourceSource resourceSource) {
        zq3.h(resourceRepository, "this$0");
        zq3.h(resource, "$resource");
        zq3.h(resourceSource, "$source");
        resourceRepository.resourceDao.insertResource(resource.toResourceEntity$resource_downloader_release(resourceRepository.fileSystemPersister.e(resource.getUrl(), resource.getBody())));
        resourceRepository.insertSourceIfNecessary(resource.getUrl(), resourceSource);
    }

    public final void clearGlobalResources(final List<String> list) {
        zq3.h(list, "globalResourceUrls");
        this.database.runInTransaction(new Runnable() { // from class: g07
            @Override // java.lang.Runnable
            public final void run() {
                ResourceRepository.clearGlobalResources$lambda$9(ResourceRepository.this, list);
            }
        });
    }

    public final void clearResourcesWithoutSources(final Set<? extends vu3> set, final Set<? extends ResourceSource> set2) {
        zq3.h(set, "types");
        zq3.h(set2, "sourcesToKeep");
        this.database.runInTransaction(new Runnable() { // from class: e07
            @Override // java.lang.Runnable
            public final void run() {
                ResourceRepository.clearResourcesWithoutSources$lambda$6(ResourceRepository.this, set, set2);
            }
        });
    }

    public final Resource getResource(String str) {
        String d;
        zq3.h(str, "url");
        ResourceEntity selectResourceByUrl = this.resourceDao.selectResourceByUrl(str);
        if (selectResourceByUrl == null || (d = this.fileSystemPersister.d(selectResourceByUrl.getUrl())) == null) {
            return null;
        }
        return selectResourceByUrl.toResource(d);
    }

    public final void insertOrUpdateResource(final Resource resource, final ResourceSource resourceSource) {
        zq3.h(resource, "resource");
        zq3.h(resourceSource, "source");
        this.database.runInTransaction(new Runnable() { // from class: f07
            @Override // java.lang.Runnable
            public final void run() {
                ResourceRepository.insertOrUpdateResource$lambda$0(ResourceRepository.this, resource, resourceSource);
            }
        });
    }

    public final void insertSourceIfNecessary(String str, ResourceSource resourceSource) {
        zq3.h(str, "url");
        zq3.h(resourceSource, "source");
        List<ResourceSourceEntity> selectAllByResourceUrl = this.sourceDao.selectAllByResourceUrl(str);
        ArrayList arrayList = new ArrayList(i.w(selectAllByResourceUrl, 10));
        Iterator<T> it2 = selectAllByResourceUrl.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ResourceSourceEntity) it2.next()).getResourceSource());
        }
        if (arrayList.contains(resourceSource)) {
            return;
        }
        this.sourceDao.insertSource(ResourceSourceEntity.Companion.from(str, resourceSource));
    }

    public final boolean shouldFetchResource(String str) {
        zq3.h(str, "url");
        ResourceEntity selectResourceByUrl = this.resourceDao.selectResourceByUrl(str);
        return selectResourceByUrl == null || selectResourceByUrl.isExpired();
    }
}
