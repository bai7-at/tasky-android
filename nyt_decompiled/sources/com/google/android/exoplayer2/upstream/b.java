package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import defpackage.n72;
import defpackage.ur;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    /* renamed from: com.google.android.exoplayer2.upstream.b$b, reason: collision with other inner class name */
    public static final class C0195b {
        private Uri a;
        private long b;
        private int c;
        private byte[] d;
        private Map e;
        private long f;
        private long g;
        private String h;
        private int i;
        private Object j;

        public b a() {
            ur.j(this.a, "The uri must be set.");
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public C0195b b(int i) {
            this.i = i;
            return this;
        }

        public C0195b c(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public C0195b d(int i) {
            this.c = i;
            return this;
        }

        public C0195b e(Map map) {
            this.e = map;
            return this;
        }

        public C0195b f(String str) {
            this.h = str;
            return this;
        }

        public C0195b g(long j) {
            this.g = j;
            return this;
        }

        public C0195b h(long j) {
            this.f = j;
            return this;
        }

        public C0195b i(Uri uri) {
            this.a = uri;
            return this;
        }

        public C0195b j(String str) {
            this.a = Uri.parse(str);
            return this;
        }

        public C0195b k(long j) {
            this.b = j;
            return this;
        }

        public C0195b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        private C0195b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.g;
            this.g = bVar.h;
            this.h = bVar.i;
            this.i = bVar.j;
            this.j = bVar.k;
        }
    }

    static {
        n72.a("goog.exo.datasource");
    }

    public static String c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public C0195b a() {
        return new C0195b();
    }

    public final String b() {
        return c(this.c);
    }

    public boolean d(int i) {
        return (this.j & i) == i;
    }

    public b e(long j) {
        long j2 = this.h;
        return f(j, j2 != -1 ? j2 - j : -1L);
    }

    public b f(long j, long j2) {
        return (j == 0 && this.h == j2) ? this : new b(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + "]";
    }

    public b(Uri uri) {
        this(uri, 0L, -1L);
    }

    public b(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    private b(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        ur.a(j4 >= 0);
        ur.a(j2 >= 0);
        ur.a(j3 > 0 || j3 == -1);
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }
}
