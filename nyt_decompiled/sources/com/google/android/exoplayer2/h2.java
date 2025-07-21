package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.h2;
import com.google.common.collect.ImmutableList;
import defpackage.db0;
import defpackage.pe0;
import defpackage.sv4;
import defpackage.up8;
import defpackage.ur;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class h2 implements g {
    public static final h2 b = new h2(ImmutableList.x());
    private static final String c = z19.t0(0);
    public static final g.a d = new g.a() { // from class: nq8
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            h2 e;
            e = h2.e(bundle);
            return e;
        }
    };
    private final ImmutableList a;

    public static final class a implements g {
        private static final String f = z19.t0(0);
        private static final String g = z19.t0(1);
        private static final String h = z19.t0(3);
        private static final String i = z19.t0(4);
        public static final g.a j = new g.a() { // from class: oq8
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                h2.a k;
                k = h2.a.k(bundle);
                return k;
            }
        };
        public final int a;
        private final up8 b;
        private final boolean c;
        private final int[] d;
        private final boolean[] e;

        public a(up8 up8Var, boolean z, int[] iArr, boolean[] zArr) {
            int i2 = up8Var.a;
            this.a = i2;
            boolean z2 = false;
            ur.a(i2 == iArr.length && i2 == zArr.length);
            this.b = up8Var;
            if (z && i2 > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a k(Bundle bundle) {
            up8 up8Var = (up8) up8.h.a((Bundle) ur.e(bundle.getBundle(f)));
            return new a(up8Var, bundle.getBoolean(i, false), (int[]) sv4.a(bundle.getIntArray(g), new int[up8Var.a]), (boolean[]) sv4.a(bundle.getBooleanArray(h), new boolean[up8Var.a]));
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f, this.b.a());
            bundle.putIntArray(g, this.d);
            bundle.putBooleanArray(h, this.e);
            bundle.putBoolean(i, this.c);
            return bundle;
        }

        public up8 c() {
            return this.b;
        }

        public t0 d(int i2) {
            return this.b.d(i2);
        }

        public int e() {
            return this.b.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b.equals(aVar.b) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e);
        }

        public boolean f() {
            return this.c;
        }

        public boolean g() {
            return db0.b(this.e, true);
        }

        public boolean h(int i2) {
            return this.e[i2];
        }

        public int hashCode() {
            return (((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
        }

        public boolean i(int i2) {
            return j(i2, false);
        }

        public boolean j(int i2, boolean z) {
            int i3 = this.d[i2];
            return i3 == 4 || (z && i3 == 3);
        }
    }

    public h2(List list) {
        this.a = ImmutableList.t(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h2 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        return new h2(parcelableArrayList == null ? ImmutableList.x() : pe0.d(a.j, parcelableArrayList));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(c, pe0.i(this.a));
        return bundle;
    }

    public ImmutableList c() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean d(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            a aVar = (a) this.a.get(i2);
            if (aVar.g() && aVar.e() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((h2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
