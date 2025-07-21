package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.js5;
import defpackage.l28;
import defpackage.o28;
import defpackage.wd2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface d {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final d a(js5 js5Var, wd2 wd2Var) {
            zq3.h(js5Var, "persister");
            zq3.h(wd2Var, "fetcher");
            l28 d = o28.a().a(wd2Var).f(js5Var).d();
            zq3.g(d, "open(...)");
            return new StoreWrapperImpl(d);
        }

        public final d b(l28 l28Var) {
            zq3.h(l28Var, "store");
            return new StoreWrapperImpl(l28Var);
        }
    }

    Object a(Object obj, by0 by0Var);

    Object b(Object obj, by0 by0Var);
}
