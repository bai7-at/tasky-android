package com.nytimes.android.saved.persistence;

import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.a97;
import defpackage.at3;
import defpackage.by0;
import defpackage.dt3;
import defpackage.ge2;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class SavedListDiskPersister implements a97 {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final ge2 a;
    private final CoroutineDispatcher b;
    private final com.nytimes.android.entitlements.a c;
    private final at3 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SavedListDiskPersister(ge2 ge2Var, CoroutineDispatcher coroutineDispatcher, com.nytimes.android.entitlements.a aVar) {
        zq3.h(ge2Var, "fileIdProvider");
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(aVar, "eCommClient");
        this.a = ge2Var;
        this.b = coroutineDispatcher;
        this.c = aVar;
        this.d = tt3.b(null, new ss2() { // from class: com.nytimes.android.saved.persistence.SavedListDiskPersister$format$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.f(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(by0 by0Var) {
        String g = this.c.g();
        if (g == null) {
            g = "";
        }
        return "SVLK" + g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(by0 by0Var) {
        return BuildersKt.withContext(this.b, new SavedListDiskPersister$loadSavedAssetIndexList$2(this, null), by0Var);
    }

    @Override // defpackage.a97
    public Object a(SavedAssetIndexList savedAssetIndexList, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.b, new SavedListDiskPersister$saveArticleList$2(this, savedAssetIndexList, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    @Override // defpackage.a97
    public Object b(by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.b, new SavedListDiskPersister$delete$2(this, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    @Override // defpackage.a97
    public Object c(by0 by0Var) {
        return BuildersKt.withContext(this.b, new SavedListDiskPersister$savedArticleList$2(this, null), by0Var);
    }
}
