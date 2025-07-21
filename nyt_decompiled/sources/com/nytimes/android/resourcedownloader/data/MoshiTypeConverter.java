package com.nytimes.android.resourcedownloader.data;

import com.squareup.moshi.JsonAdapter;
import defpackage.zq3;

/* loaded from: classes4.dex */
public class MoshiTypeConverter<T> {
    private final JsonAdapter<T> adapter;

    public MoshiTypeConverter(JsonAdapter<T> jsonAdapter) {
        zq3.h(jsonAdapter, "adapter");
        this.adapter = jsonAdapter;
    }

    public final T fromString(String str) {
        if (str != null) {
            return this.adapter.fromJson(str);
        }
        return null;
    }

    public final String toStringValue(T t) {
        if (t != null) {
            return this.adapter.toJson(t);
        }
        return null;
    }
}
