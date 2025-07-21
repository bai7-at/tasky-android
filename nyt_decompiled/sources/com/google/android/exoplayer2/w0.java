package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.w0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.pe0;
import defpackage.ur;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class w0 implements com.google.android.exoplayer2.g {
    public static final w0 i = new c().a();
    private static final String j = z19.t0(0);
    private static final String k = z19.t0(1);
    private static final String l = z19.t0(2);
    private static final String m = z19.t0(3);
    private static final String n = z19.t0(4);
    private static final String r = z19.t0(5);
    public static final g.a s = new g.a() { // from class: di4
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            w0 d2;
            d2 = w0.d(bundle);
            return d2;
        }
    };
    public final String a;
    public final h b;
    public final h c;
    public final g d;
    public final x0 e;
    public final d f;
    public final e g;
    public final i h;

    public static final class b implements com.google.android.exoplayer2.g {
        private static final String c = z19.t0(0);
        public static final g.a d = new g.a() { // from class: ei4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.b c2;
                c2 = w0.b.c(bundle);
                return c2;
            }
        };
        public final Uri a;
        public final Object b;

        public static final class a {
            private Uri a;
            private Object b;

            public a(Uri uri) {
                this.a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(c);
            ur.e(uri);
            return new a(uri).c();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(c, this.a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && z19.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }
    }

    public static final class c {
        private String a;
        private Uri b;
        private String c;
        private d.a d;
        private f.a e;
        private List f;
        private String g;
        private ImmutableList h;
        private b i;
        private Object j;
        private x0 k;
        private g.a l;
        private i m;

        public w0 a() {
            h hVar;
            ur.g(this.e.b == null || this.e.a != null);
            Uri uri = this.b;
            if (uri != null) {
                hVar = new h(uri, this.c, this.e.a != null ? this.e.i() : null, this.i, this.f, this.g, this.h, this.j);
            } else {
                hVar = null;
            }
            String str = this.a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g = this.d.g();
            g f = this.l.f();
            x0 x0Var = this.k;
            if (x0Var == null) {
                x0Var = x0.h0;
            }
            return new w0(str2, g, hVar, f, x0Var, this.m);
        }

        public c b(f fVar) {
            this.e = fVar != null ? fVar.d() : new f.a();
            return this;
        }

        public c c(g gVar) {
            this.l = gVar.c();
            return this;
        }

        public c d(String str) {
            this.a = (String) ur.e(str);
            return this;
        }

        public c e(List list) {
            this.h = ImmutableList.t(list);
            return this;
        }

        public c f(Object obj) {
            this.j = obj;
            return this;
        }

        public c g(Uri uri) {
            this.b = uri;
            return this;
        }

        public c h(String str) {
            return g(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.d = new d.a();
            this.e = new f.a();
            this.f = Collections.emptyList();
            this.h = ImmutableList.x();
            this.l = new g.a();
            this.m = i.d;
        }

        private c(w0 w0Var) {
            this();
            f.a aVar;
            this.d = w0Var.f.c();
            this.a = w0Var.a;
            this.k = w0Var.e;
            this.l = w0Var.d.c();
            this.m = w0Var.h;
            h hVar = w0Var.b;
            if (hVar != null) {
                this.g = hVar.f;
                this.c = hVar.b;
                this.b = hVar.a;
                this.f = hVar.e;
                this.h = hVar.g;
                this.j = hVar.i;
                f fVar = hVar.c;
                if (fVar != null) {
                    aVar = fVar.d();
                } else {
                    aVar = new f.a();
                }
                this.e = aVar;
                this.i = hVar.d;
            }
        }
    }

    public static class d implements com.google.android.exoplayer2.g {
        public static final d f = new a().f();
        private static final String g = z19.t0(0);
        private static final String h = z19.t0(1);
        private static final String i = z19.t0(2);
        private static final String j = z19.t0(3);
        private static final String k = z19.t0(4);
        public static final g.a l = new g.a() { // from class: fi4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.e d;
                d = w0.d.d(bundle);
                return d;
            }
        };
        public final long a;
        public final long b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public static final class a {
            private long a;
            private long b;
            private boolean c;
            private boolean d;
            private boolean e;

            public d f() {
                return g();
            }

            public e g() {
                return new e(this);
            }

            public a h(long j) {
                ur.a(j == Long.MIN_VALUE || j >= 0);
                this.b = j;
                return this;
            }

            public a i(boolean z) {
                this.d = z;
                return this;
            }

            public a j(boolean z) {
                this.c = z;
                return this;
            }

            public a k(long j) {
                ur.a(j >= 0);
                this.a = j;
                return this;
            }

            public a l(boolean z) {
                this.e = z;
                return this;
            }

            public a() {
                this.b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.a = dVar.a;
                this.b = dVar.b;
                this.c = dVar.c;
                this.d = dVar.d;
                this.e = dVar.e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e d(Bundle bundle) {
            a aVar = new a();
            String str = g;
            d dVar = f;
            return aVar.k(bundle.getLong(str, dVar.a)).h(bundle.getLong(h, dVar.b)).j(bundle.getBoolean(i, dVar.c)).i(bundle.getBoolean(j, dVar.d)).l(bundle.getBoolean(k, dVar.e)).g();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            long j2 = this.a;
            d dVar = f;
            if (j2 != dVar.a) {
                bundle.putLong(g, j2);
            }
            long j3 = this.b;
            if (j3 != dVar.b) {
                bundle.putLong(h, j3);
            }
            boolean z = this.c;
            if (z != dVar.c) {
                bundle.putBoolean(i, z);
            }
            boolean z2 = this.d;
            if (z2 != dVar.d) {
                bundle.putBoolean(j, z2);
            }
            boolean z3 = this.e;
            if (z3 != dVar.e) {
                bundle.putBoolean(k, z3);
            }
            return bundle;
        }

        public a c() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public int hashCode() {
            long j2 = this.a;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.b;
            return ((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
        }

        private d(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    public static final class e extends d {
        public static final e m = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f implements com.google.android.exoplayer2.g {
        private static final String l = z19.t0(0);
        private static final String m = z19.t0(1);
        private static final String n = z19.t0(2);
        private static final String r = z19.t0(3);
        private static final String s = z19.t0(4);
        private static final String t = z19.t0(5);
        private static final String u = z19.t0(6);
        private static final String w = z19.t0(7);
        public static final g.a x = new g.a() { // from class: gi4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.f e;
                e = w0.f.e(bundle);
                return e;
            }
        };
        public final UUID a;
        public final UUID b;
        public final Uri c;
        public final ImmutableMap d;
        public final ImmutableMap e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final ImmutableList i;
        public final ImmutableList j;
        private final byte[] k;

        /* JADX INFO: Access modifiers changed from: private */
        public static f e(Bundle bundle) {
            UUID fromString = UUID.fromString((String) ur.e(bundle.getString(l)));
            Uri uri = (Uri) bundle.getParcelable(m);
            ImmutableMap b = pe0.b(pe0.f(bundle, n, Bundle.EMPTY));
            boolean z = bundle.getBoolean(r, false);
            boolean z2 = bundle.getBoolean(s, false);
            boolean z3 = bundle.getBoolean(t, false);
            ImmutableList t2 = ImmutableList.t(pe0.g(bundle, u, new ArrayList()));
            return new a(fromString).n(uri).m(b).o(z).j(z3).p(z2).k(t2).l(bundle.getByteArray(w)).i();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString(l, this.a.toString());
            Uri uri = this.c;
            if (uri != null) {
                bundle.putParcelable(m, uri);
            }
            if (!this.e.isEmpty()) {
                bundle.putBundle(n, pe0.h(this.e));
            }
            boolean z = this.f;
            if (z) {
                bundle.putBoolean(r, z);
            }
            boolean z2 = this.g;
            if (z2) {
                bundle.putBoolean(s, z2);
            }
            boolean z3 = this.h;
            if (z3) {
                bundle.putBoolean(t, z3);
            }
            if (!this.j.isEmpty()) {
                bundle.putIntegerArrayList(u, new ArrayList<>(this.j));
            }
            byte[] bArr = this.k;
            if (bArr != null) {
                bundle.putByteArray(w, bArr);
            }
            return bundle;
        }

        public a d() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && z19.c(this.c, fVar.c) && z19.c(this.e, fVar.e) && this.f == fVar.f && this.h == fVar.h && this.g == fVar.g && this.j.equals(fVar.j) && Arrays.equals(this.k, fVar.k);
        }

        public byte[] f() {
            byte[] bArr = this.k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Uri uri = this.c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + (this.f ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.j.hashCode()) * 31) + Arrays.hashCode(this.k);
        }

        public static final class a {
            private UUID a;
            private Uri b;
            private ImmutableMap c;
            private boolean d;
            private boolean e;
            private boolean f;
            private ImmutableList g;
            private byte[] h;

            public f i() {
                return new f(this);
            }

            public a j(boolean z) {
                this.f = z;
                return this;
            }

            public a k(List list) {
                this.g = ImmutableList.t(list);
                return this;
            }

            public a l(byte[] bArr) {
                this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a m(Map map) {
                this.c = ImmutableMap.f(map);
                return this;
            }

            public a n(Uri uri) {
                this.b = uri;
                return this;
            }

            public a o(boolean z) {
                this.d = z;
                return this;
            }

            public a p(boolean z) {
                this.e = z;
                return this;
            }

            public a(UUID uuid) {
                this.a = uuid;
                this.c = ImmutableMap.o();
                this.g = ImmutableList.x();
            }

            private a() {
                this.c = ImmutableMap.o();
                this.g = ImmutableList.x();
            }

            private a(f fVar) {
                this.a = fVar.a;
                this.b = fVar.c;
                this.c = fVar.e;
                this.d = fVar.f;
                this.e = fVar.g;
                this.f = fVar.h;
                this.g = fVar.j;
                this.h = fVar.k;
            }
        }

        private f(a aVar) {
            ur.g((aVar.f && aVar.b == null) ? false : true);
            UUID uuid = (UUID) ur.e(aVar.a);
            this.a = uuid;
            this.b = uuid;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.c;
            this.f = aVar.d;
            this.h = aVar.f;
            this.g = aVar.e;
            this.i = aVar.g;
            this.j = aVar.g;
            this.k = aVar.h != null ? Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }
    }

    public static final class g implements com.google.android.exoplayer2.g {
        public static final g f = new a().f();
        private static final String g = z19.t0(0);
        private static final String h = z19.t0(1);
        private static final String i = z19.t0(2);
        private static final String j = z19.t0(3);
        private static final String k = z19.t0(4);
        public static final g.a l = new g.a() { // from class: hi4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.g d;
                d = w0.g.d(bundle);
                return d;
            }
        };
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        public static final class a {
            private long a;
            private long b;
            private long c;
            private float d;
            private float e;

            public g f() {
                return new g(this);
            }

            public a g(long j) {
                this.c = j;
                return this;
            }

            public a h(float f) {
                this.e = f;
                return this;
            }

            public a i(long j) {
                this.b = j;
                return this;
            }

            public a j(float f) {
                this.d = f;
                return this;
            }

            public a k(long j) {
                this.a = j;
                return this;
            }

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.a = gVar.a;
                this.b = gVar.b;
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g d(Bundle bundle) {
            String str = g;
            g gVar = f;
            return new g(bundle.getLong(str, gVar.a), bundle.getLong(h, gVar.b), bundle.getLong(i, gVar.c), bundle.getFloat(j, gVar.d), bundle.getFloat(k, gVar.e));
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            long j2 = this.a;
            g gVar = f;
            if (j2 != gVar.a) {
                bundle.putLong(g, j2);
            }
            long j3 = this.b;
            if (j3 != gVar.b) {
                bundle.putLong(h, j3);
            }
            long j4 = this.c;
            if (j4 != gVar.c) {
                bundle.putLong(i, j4);
            }
            float f2 = this.d;
            if (f2 != gVar.d) {
                bundle.putFloat(j, f2);
            }
            float f3 = this.e;
            if (f3 != gVar.e) {
                bundle.putFloat(k, f3);
            }
            return bundle;
        }

        public a c() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.c;
            int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
            float f2 = this.d;
            int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.e;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        private g(a aVar) {
            this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
        }

        public g(long j2, long j3, long j4, float f2, float f3) {
            this.a = j2;
            this.b = j3;
            this.c = j4;
            this.d = f2;
            this.e = f3;
        }
    }

    public static final class h implements com.google.android.exoplayer2.g {
        private static final String j = z19.t0(0);
        private static final String k = z19.t0(1);
        private static final String l = z19.t0(2);
        private static final String m = z19.t0(3);
        private static final String n = z19.t0(4);
        private static final String r = z19.t0(5);
        private static final String s = z19.t0(6);
        public static final g.a t = new g.a() { // from class: ii4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.h c;
                c = w0.h.c(bundle);
                return c;
            }
        };
        public final Uri a;
        public final String b;
        public final f c;
        public final b d;
        public final List e;
        public final String f;
        public final ImmutableList g;
        public final List h;
        public final Object i;

        /* JADX INFO: Access modifiers changed from: private */
        public static h c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(l);
            f fVar = bundle2 == null ? null : (f) f.x.a(bundle2);
            Bundle bundle3 = bundle.getBundle(m);
            b bVar = bundle3 != null ? (b) b.d.a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(n);
            ImmutableList x = parcelableArrayList == null ? ImmutableList.x() : pe0.d(new g.a() { // from class: ji4
                @Override // com.google.android.exoplayer2.g.a
                public final g a(Bundle bundle4) {
                    return StreamKey.c(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
            return new h((Uri) ur.e((Uri) bundle.getParcelable(j)), bundle.getString(k), fVar, bVar, x, bundle.getString(r), parcelableArrayList2 == null ? ImmutableList.x() : pe0.d(k.r, parcelableArrayList2), null);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(j, this.a);
            String str = this.b;
            if (str != null) {
                bundle.putString(k, str);
            }
            f fVar = this.c;
            if (fVar != null) {
                bundle.putBundle(l, fVar.a());
            }
            b bVar = this.d;
            if (bVar != null) {
                bundle.putBundle(m, bVar.a());
            }
            if (!this.e.isEmpty()) {
                bundle.putParcelableArrayList(n, pe0.i(this.e));
            }
            String str2 = this.f;
            if (str2 != null) {
                bundle.putString(r, str2);
            }
            if (!this.g.isEmpty()) {
                bundle.putParcelableArrayList(s, pe0.i(this.g));
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && z19.c(this.b, hVar.b) && z19.c(this.c, hVar.c) && z19.c(this.d, hVar.d) && this.e.equals(hVar.e) && z19.c(this.f, hVar.f) && this.g.equals(hVar.g) && z19.c(this.i, hVar.i);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.c;
            int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.d;
            int hashCode4 = (((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.e.hashCode()) * 31;
            String str2 = this.f;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.g.hashCode()) * 31;
            Object obj = this.i;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, ImmutableList immutableList, Object obj) {
            this.a = uri;
            this.b = str;
            this.c = fVar;
            this.d = bVar;
            this.e = list;
            this.f = str2;
            this.g = immutableList;
            ImmutableList.a p = ImmutableList.p();
            for (int i = 0; i < immutableList.size(); i++) {
                p.a(((k) immutableList.get(i)).c().j());
            }
            this.h = p.k();
            this.i = obj;
        }
    }

    public static final class i implements com.google.android.exoplayer2.g {
        public static final i d = new a().d();
        private static final String e = z19.t0(0);
        private static final String f = z19.t0(1);
        private static final String g = z19.t0(2);
        public static final g.a h = new g.a() { // from class: ki4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.i c;
                c = w0.i.c(bundle);
                return c;
            }
        };
        public final Uri a;
        public final String b;
        public final Bundle c;

        public static final class a {
            private Uri a;
            private String b;
            private Bundle c;

            public i d() {
                return new i(this);
            }

            public a e(Bundle bundle) {
                this.c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.a = uri;
                return this;
            }

            public a g(String str) {
                this.b = str;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ i c(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(e)).g(bundle.getString(f)).e(bundle.getBundle(g)).d();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            Uri uri = this.a;
            if (uri != null) {
                bundle.putParcelable(e, uri);
            }
            String str = this.b;
            if (str != null) {
                bundle.putString(f, str);
            }
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putBundle(g, bundle2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return z19.c(this.a, iVar.a) && z19.c(this.b, iVar.b);
        }

        public int hashCode() {
            Uri uri = this.a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        private i(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k implements com.google.android.exoplayer2.g {
        private static final String h = z19.t0(0);
        private static final String i = z19.t0(1);
        private static final String j = z19.t0(2);
        private static final String k = z19.t0(3);
        private static final String l = z19.t0(4);
        private static final String m = z19.t0(5);
        private static final String n = z19.t0(6);
        public static final g.a r = new g.a() { // from class: li4
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                w0.k d;
                d = w0.k.d(bundle);
                return d;
            }
        };
        public final Uri a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public final String g;

        public static final class a {
            private Uri a;
            private String b;
            private String c;
            private int d;
            private int e;
            private String f;
            private String g;

            /* JADX INFO: Access modifiers changed from: private */
            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.g = str;
                return this;
            }

            public a l(String str) {
                this.f = str;
                return this;
            }

            public a m(String str) {
                this.c = str;
                return this;
            }

            public a n(String str) {
                this.b = str;
                return this;
            }

            public a o(int i) {
                this.e = i;
                return this;
            }

            public a p(int i) {
                this.d = i;
                return this;
            }

            public a(Uri uri) {
                this.a = uri;
            }

            private a(k kVar) {
                this.a = kVar.a;
                this.b = kVar.b;
                this.c = kVar.c;
                this.d = kVar.d;
                this.e = kVar.e;
                this.f = kVar.f;
                this.g = kVar.g;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static k d(Bundle bundle) {
            Uri uri = (Uri) ur.e((Uri) bundle.getParcelable(h));
            String string = bundle.getString(i);
            String string2 = bundle.getString(j);
            int i2 = bundle.getInt(k, 0);
            int i3 = bundle.getInt(l, 0);
            String string3 = bundle.getString(m);
            return new a(uri).n(string).m(string2).p(i2).o(i3).l(string3).k(bundle.getString(n)).i();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(h, this.a);
            String str = this.b;
            if (str != null) {
                bundle.putString(i, str);
            }
            String str2 = this.c;
            if (str2 != null) {
                bundle.putString(j, str2);
            }
            int i2 = this.d;
            if (i2 != 0) {
                bundle.putInt(k, i2);
            }
            int i3 = this.e;
            if (i3 != 0) {
                bundle.putInt(l, i3);
            }
            String str3 = this.f;
            if (str3 != null) {
                bundle.putString(m, str3);
            }
            String str4 = this.g;
            if (str4 != null) {
                bundle.putString(n, str4);
            }
            return bundle;
        }

        public a c() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a.equals(kVar.a) && z19.c(this.b, kVar.b) && z19.c(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && z19.c(this.f, kVar.f) && z19.c(this.g, kVar.g);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
            String str3 = this.f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w0 d(Bundle bundle) {
        String str = (String) ur.e(bundle.getString(j, ""));
        Bundle bundle2 = bundle.getBundle(k);
        g gVar = bundle2 == null ? g.f : (g) g.l.a(bundle2);
        Bundle bundle3 = bundle.getBundle(l);
        x0 x0Var = bundle3 == null ? x0.h0 : (x0) x0.P0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(m);
        e eVar = bundle4 == null ? e.m : (e) d.l.a(bundle4);
        Bundle bundle5 = bundle.getBundle(n);
        i iVar = bundle5 == null ? i.d : (i) i.h.a(bundle5);
        Bundle bundle6 = bundle.getBundle(r);
        return new w0(str, eVar, bundle6 == null ? null : (h) h.t.a(bundle6), gVar, x0Var, iVar);
    }

    public static w0 e(Uri uri) {
        return new c().g(uri).a();
    }

    public static w0 f(String str) {
        return new c().h(str).a();
    }

    private Bundle g(boolean z) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.a.equals("")) {
            bundle.putString(j, this.a);
        }
        if (!this.d.equals(g.f)) {
            bundle.putBundle(k, this.d.a());
        }
        if (!this.e.equals(x0.h0)) {
            bundle.putBundle(l, this.e.a());
        }
        if (!this.f.equals(d.f)) {
            bundle.putBundle(m, this.f.a());
        }
        if (!this.h.equals(i.d)) {
            bundle.putBundle(n, this.h.a());
        }
        if (z && (hVar = this.b) != null) {
            bundle.putBundle(r, hVar.a());
        }
        return bundle;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        return g(false);
    }

    public c c() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return z19.c(this.a, w0Var.a) && this.f.equals(w0Var.f) && z19.c(this.b, w0Var.b) && z19.c(this.d, w0Var.d) && z19.c(this.e, w0Var.e) && z19.c(this.h, w0Var.h);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h hVar = this.b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31) + this.h.hashCode();
    }

    private w0(String str, e eVar, h hVar, g gVar, x0 x0Var, i iVar) {
        this.a = str;
        this.b = hVar;
        this.c = hVar;
        this.d = gVar;
        this.e = x0Var;
        this.f = eVar;
        this.g = eVar;
        this.h = iVar;
    }
}
