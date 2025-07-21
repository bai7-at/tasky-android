package com.nytimes.android.resourcedownloader.data;

import java.util.List;

/* loaded from: classes4.dex */
public interface ResourceDao {

    public static final class DefaultImpls {
        public static List<String> getAndDeleteResourcesWithNoSources(ResourceDao resourceDao) {
            List<String> urlsWithNoSources = resourceDao.getUrlsWithNoSources();
            if (!urlsWithNoSources.isEmpty()) {
                resourceDao.deleteResourcesWithNoSources();
            }
            return urlsWithNoSources;
        }
    }

    void delete(ResourceEntity resourceEntity);

    int deleteResourcesWithNoSources();

    List<String> getAndDeleteResourcesWithNoSources();

    List<ResourceWithSources> getResourceWithSources();

    List<String> getUrlsWithNoSources();

    long insertResource(ResourceEntity resourceEntity);

    ResourceEntity selectResourceByUrl(String str);
}
