package com.nytimes.android.utils.composeutils;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SingleActionHandler {
    private long a;
    private final long b;

    public SingleActionHandler(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static /* synthetic */ void b(SingleActionHandler singleActionHandler, long j, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = singleActionHandler.b;
        }
        singleActionHandler.a(j, qs2Var);
    }

    public final void a(long j, qs2 qs2Var) {
        zq3.h(qs2Var, "action");
        c(j, qs2Var, new qs2() { // from class: com.nytimes.android.utils.composeutils.SingleActionHandler$tryAction$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m776invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m776invoke();
                return ww8.a;
            }
        });
    }

    public final void c(long j, qs2 qs2Var, qs2 qs2Var2) {
        zq3.h(qs2Var, "action");
        zq3.h(qs2Var2, "tooEarly");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.a <= j) {
            qs2Var2.mo865invoke();
        } else {
            this.a = currentTimeMillis;
            qs2Var.mo865invoke();
        }
    }
}
