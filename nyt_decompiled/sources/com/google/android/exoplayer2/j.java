package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.j;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class j implements g {
    public static final j e = new b(0).e();
    private static final String f = z19.t0(0);
    private static final String g = z19.t0(1);
    private static final String h = z19.t0(2);
    private static final String i = z19.t0(3);
    public static final g.a j = new g.a() { // from class: fp1
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            j c;
            c = j.c(bundle);
            return c;
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public static final class b {
        private final int a;
        private int b;
        private int c;
        private String d;

        public b(int i) {
            this.a = i;
        }

        public j e() {
            ur.a(this.b <= this.c);
            return new j(this);
        }

        public b f(int i) {
            this.c = i;
            return this;
        }

        public b g(int i) {
            this.b = i;
            return this;
        }

        public b h(String str) {
            ur.a(this.a != 0 || str == null);
            this.d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j c(Bundle bundle) {
        int i2 = bundle.getInt(f, 0);
        int i3 = bundle.getInt(g, 0);
        int i4 = bundle.getInt(h, 0);
        return new b(i2).g(i3).f(i4).h(bundle.getString(i)).e();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        int i2 = this.a;
        if (i2 != 0) {
            bundle.putInt(f, i2);
        }
        int i3 = this.b;
        if (i3 != 0) {
            bundle.putInt(g, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            bundle.putInt(h, i4);
        }
        String str = this.d;
        if (str != null) {
            bundle.putString(i, str);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && z19.c(this.d, jVar.d);
    }

    public int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    private j(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
    }
}
