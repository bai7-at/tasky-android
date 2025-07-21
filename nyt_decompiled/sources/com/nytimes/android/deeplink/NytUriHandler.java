package com.nytimes.android.deeplink;

import androidx.lifecycle.Lifecycle;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.a44;
import defpackage.id9;
import defpackage.jk;
import defpackage.ld1;
import defpackage.vy8;
import defpackage.zq3;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class NytUriHandler implements vy8 {
    public static final int e = 8;
    private final jk a;
    private final DeepLinkManager b;
    private final ld1 c;
    private final id9 d;

    public NytUriHandler(jk jkVar, DeepLinkManager deepLinkManager, ld1 ld1Var, id9 id9Var) {
        zq3.h(jkVar, "activity");
        zq3.h(deepLinkManager, "deepLinkManager");
        zq3.h(ld1Var, "deepLinkUtils");
        zq3.h(id9Var, "navigator");
        this.a = jkVar;
        this.b = deepLinkManager;
        this.c = ld1Var;
        this.d = id9Var;
    }

    private final boolean e(String str) {
        return h.P(str, "/section/sports", false, 2, null);
    }

    @Override // defpackage.vy8
    public void a(String str) {
        zq3.h(str, "uri");
        if (e(str)) {
            this.d.a(this.a, str);
            return;
        }
        if (DeepLinkManager.g.d(str)) {
            Lifecycle lifecycle = this.a.getLifecycle();
            zq3.g(lifecycle, "<get-lifecycle>(...)");
            BuildersKt__Builders_commonKt.launch$default(a44.a(lifecycle), null, null, new NytUriHandler$openUri$1(this, str, null), 3, null);
        } else {
            NYTLogger.l("External URL - path: " + str, new Object[0]);
            this.c.c(this.a, str);
        }
    }

    public final void f(String str, String str2) {
        zq3.h(str, "uri");
        if (e(str)) {
            this.d.a(this.a, str);
            return;
        }
        if (DeepLinkManager.g.d(str)) {
            Lifecycle lifecycle = this.a.getLifecycle();
            zq3.g(lifecycle, "<get-lifecycle>(...)");
            BuildersKt__Builders_commonKt.launch$default(a44.a(lifecycle), null, null, new NytUriHandler$openUriWithUrlExtra$1(this, str, str2, null), 3, null);
        } else {
            NYTLogger.l("External URL - path: " + str, new Object[0]);
            this.c.c(this.a, str);
        }
    }
}
