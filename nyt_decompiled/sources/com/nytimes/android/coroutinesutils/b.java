package com.nytimes.android.coroutinesutils;

import kotlin.Pair;

/* loaded from: classes4.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ void a(b bVar, boolean z, Pair[] pairArr, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            bVar.b(z, pairArr);
        }
    }

    void a();

    void b(boolean z, Pair... pairArr);

    b c(String str);

    void error(String str);

    void error(Throwable th);
}
