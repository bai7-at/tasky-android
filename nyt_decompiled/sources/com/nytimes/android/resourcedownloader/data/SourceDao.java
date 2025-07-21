package com.nytimes.android.resourcedownloader.data;

import java.util.List;

/* loaded from: classes4.dex */
public interface SourceDao {
    void delete(long j);

    List<ResourceSourceEntity> getAll();

    long insertSource(ResourceSourceEntity resourceSourceEntity);

    List<ResourceSourceEntity> selectAllByResourceUrl(String str);
}
