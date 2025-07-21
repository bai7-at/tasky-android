package com.nytimes.android.assetretriever;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.assetretriever.h;
import defpackage.et;
import defpackage.tt;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class h {
    public static final a Companion = new a(null);
    private final AssetRetrieverDatabase a;
    private final com.nytimes.android.assetretriever.a b;
    private final tt c;
    private final i d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(AssetRetrieverDatabase assetRetrieverDatabase, com.nytimes.android.assetretriever.a aVar, tt ttVar, i iVar) {
        zq3.h(assetRetrieverDatabase, "database");
        zq3.h(aVar, "assetDao");
        zq3.h(ttVar, "assetSourceDao");
        zq3.h(iVar, "assetRequestDao");
        this.a = assetRetrieverDatabase;
        this.b = aVar;
        this.c = ttVar;
        this.d = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h hVar, e eVar, String str) {
        zq3.h(hVar, "this$0");
        zq3.h(eVar, "$assetIdentifier");
        zq3.h(str, "$type");
        k o = hVar.d.o(eVar);
        if (o != null) {
            hVar.c.a(o.e(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(h hVar, e eVar) {
        zq3.h(hVar, "this$0");
        zq3.h(eVar, "$assetIdentifier");
        i.d(hVar.d, eVar, 30L, 5, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(h hVar, Asset asset, e eVar, List list) {
        zq3.h(hVar, "this$0");
        zq3.h(asset, "$asset");
        zq3.h(eVar, "$assetIdentifier");
        zq3.h(list, "$sources");
        com.nytimes.android.assetretriever.a.d(hVar.b, asset, null, 2, null);
        String uri = asset.getUri();
        zq3.e(uri);
        e.b bVar = new e.b(uri);
        long m = i.m(hVar.d, eVar, bVar, asset.getLastModifiedInstant(), null, 8, null);
        String url = asset.getUrl();
        e.c cVar = url != null ? new e.c(url) : null;
        if (cVar != null && !zq3.c(cVar, eVar)) {
            i.m(hVar.d, cVar, bVar, asset.getLastModifiedInstant(), null, 8, null);
        }
        if (!zq3.c(bVar, eVar)) {
            i.m(hVar.d, bVar, bVar, asset.getLastModifiedInstant(), null, 8, null);
        }
        hVar.t(m, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(h hVar, et etVar, List list) {
        zq3.h(hVar, "this$0");
        zq3.h(etVar, "$input");
        zq3.h(list, "$sources");
        hVar.t(i.g(hVar.d, etVar.a(), etVar.b(), null, 4, null), list);
    }

    private final void t(long j, List list) {
        if (list.isEmpty()) {
            return;
        }
        this.c.f(j, list);
    }

    public final void e() {
        tt ttVar = this.c;
        Instant now = Instant.now();
        zq3.g(now, "now(...)");
        ttVar.d(now);
        this.b.a();
    }

    public final void f(final e eVar, final String str) {
        zq3.h(eVar, "assetIdentifier");
        zq3.h(str, TransferTable.COLUMN_TYPE);
        this.a.runInTransaction(new Runnable() { // from class: at
            @Override // java.lang.Runnable
            public final void run() {
                h.g(h.this, eVar, str);
            }
        });
    }

    public final void h() {
        this.c.b();
        e();
    }

    public final void i(String str, long j) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        this.c.c(str, j);
    }

    public final void j(e eVar) {
        zq3.h(eVar, "assetIdentifier");
        this.d.a(eVar);
    }

    public final void k(final e eVar) {
        zq3.h(eVar, "assetIdentifier");
        this.a.runInTransaction(new Runnable() { // from class: bt
            @Override // java.lang.Runnable
            public final void run() {
                h.l(h.this, eVar);
            }
        });
    }

    public final void m(final e eVar, final Asset asset, final List list) {
        zq3.h(eVar, "assetIdentifier");
        zq3.h(asset, "asset");
        zq3.h(list, "sources");
        this.a.runInTransaction(new Runnable() { // from class: ys
            @Override // java.lang.Runnable
            public final void run() {
                h.n(h.this, asset, eVar, list);
            }
        });
    }

    public final void o(e eVar, boolean z) {
        zq3.h(eVar, "assetIdentifier");
        this.d.h(eVar, z);
    }

    public final Instant p() {
        return this.b.e();
    }

    public final void q() {
        this.d.k();
    }

    public final void r(final et etVar, final List list) {
        zq3.h(etVar, "input");
        zq3.h(list, "sources");
        this.a.runInTransaction(new Runnable() { // from class: zs
            @Override // java.lang.Runnable
            public final void run() {
                h.s(h.this, etVar, list);
            }
        });
    }

    public final Asset u(e eVar) {
        zq3.h(eVar, "assetIdentifier");
        return this.b.f(eVar);
    }

    public final e v() {
        i iVar = this.d;
        Instant now = Instant.now();
        zq3.g(now, "now(...)");
        n n = iVar.n(now);
        if (n == null) {
            return null;
        }
        e.b a2 = n.a();
        return a2 != null ? a2 : n.b();
    }
}
