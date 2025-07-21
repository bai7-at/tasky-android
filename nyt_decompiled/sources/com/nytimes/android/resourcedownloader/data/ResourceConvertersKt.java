package com.nytimes.android.resourcedownloader.data;

import com.nytimes.android.resourcedownloader.model.AssetResourceSource;
import com.nytimes.android.resourcedownloader.model.BlockResourceSource;
import com.nytimes.android.resourcedownloader.model.GlobalResourceSource;
import com.nytimes.android.resourcedownloader.model.ResourceSource;
import com.nytimes.android.resourcedownloader.model.VersionedResourceSource;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.i;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ResourceConvertersKt {
    private static final i moshi = configureResourceSourceAdapter(new i.b()).d();

    public static final i.b configureResourceSourceAdapter(i.b bVar) {
        zq3.h(bVar, "<this>");
        bVar.a(PolymorphicJsonAdapterFactory.a(ResourceSource.class, "_json_type_").b(GlobalResourceSource.class, "global").b(AssetResourceSource.class, "asset").b(BlockResourceSource.class, "block").b(VersionedResourceSource.class, "versioned"));
        return bVar;
    }

    public static final i getMoshi() {
        return moshi;
    }
}
