package com.google.firebase.remoteconfig.internal;

import defpackage.gj2;
import defpackage.ij2;

/* loaded from: classes3.dex */
public class f implements gj2 {
    private final long a;
    private final int b;
    private final ij2 c;

    public static class b {
        private long a;
        private int b;
        private ij2 c;

        public f a() {
            return new f(this.a, this.b, this.c);
        }

        b b(ij2 ij2Var) {
            this.c = ij2Var;
            return this;
        }

        b c(int i) {
            this.b = i;
            return this;
        }

        public b d(long j) {
            this.a = j;
            return this;
        }

        private b() {
        }
    }

    static b b() {
        return new b();
    }

    @Override // defpackage.gj2
    public long a() {
        return this.a;
    }

    private f(long j, int i, ij2 ij2Var) {
        this.a = j;
        this.b = i;
        this.c = ij2Var;
    }
}
