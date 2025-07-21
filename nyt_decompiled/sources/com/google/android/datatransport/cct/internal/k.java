package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.g;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(ClientInfo clientInfo);

        public abstract a c(List list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(QosTier qosTier);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new g.b();
    }

    public abstract ClientInfo b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract QosTier f();

    public abstract long g();

    public abstract long h();
}
