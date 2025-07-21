package com.nytimes.android.subauth.core.di;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import defpackage.ba1;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.ss2;
import defpackage.zq3;
import defpackage.zt6;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes4.dex */
public abstract class DataStoreKt {
    static final /* synthetic */ iv3[] a = {zt6.i(new PropertyReference1Impl(DataStoreKt.class, "subauthDataStore", "getSubauthDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final hp6 b = PreferenceDataStoreDelegateKt.b("com.nytimes.android.subauth", null, new ss2() { // from class: com.nytimes.android.subauth.core.di.DataStoreKt$subauthDataStore$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context context) {
            zq3.h(context, "context");
            return i.e(SharedPreferencesMigrationKt.b(context, "com.nytimes.android.subauth", null, 4, null));
        }
    }, null, 10, null);

    public static final ba1 a(Context context) {
        zq3.h(context, "<this>");
        return (ba1) b.getValue(context, a[0]);
    }
}
