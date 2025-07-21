package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableMap;
import defpackage.ur;
import defpackage.z19;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class a {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final ImmutableMap i;
    public final c j;

    public static final class b {
        private final String a;
        private final int b;
        private final String c;
        private final int d;
        private final HashMap e = new HashMap();
        private int f = -1;
        private String g;
        private String h;
        private String i;

        public b(String str, int i, String str2, int i2) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = i2;
        }

        private static String k(int i, String str, int i2, int i3) {
            return z19.D("%d %s/%d/%d", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        private static String l(int i) {
            ur.a(i < 96);
            if (i == 0) {
                return k(0, "PCMU", 8000, 1);
            }
            if (i == 8) {
                return k(8, "PCMA", 8000, 1);
            }
            if (i == 10) {
                return k(10, "L16", 44100, 2);
            }
            if (i == 11) {
                return k(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i);
        }

        public b i(String str, String str2) {
            this.e.put(str, str2);
            return this;
        }

        public a j() {
            try {
                return new a(this, ImmutableMap.f(this.e), this.e.containsKey("rtpmap") ? c.a((String) z19.j((String) this.e.get("rtpmap"))) : c.a(l(this.d)));
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        public b m(int i) {
            this.f = i;
            return this;
        }

        public b n(String str) {
            this.h = str;
            return this;
        }

        public b o(String str) {
            this.i = str;
            return this;
        }

        public b p(String str) {
            this.g = str;
            return this;
        }
    }

    public static final class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        private c(int i, String str, int i2, int i3) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        public static c a(String str) {
            String[] W0 = z19.W0(str, " ");
            ur.a(W0.length == 2);
            int h = u.h(W0[0]);
            String[] V0 = z19.V0(W0[1].trim(), "/");
            ur.a(V0.length >= 2);
            return new c(h, V0[0], u.h(V0[1]), V0.length == 3 ? u.h(V0[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b.equals(cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public int hashCode() {
            return ((((((217 + this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
        }
    }

    public ImmutableMap a() {
        String str = (String) this.i.get("fmtp");
        if (str == null) {
            return ImmutableMap.o();
        }
        String[] W0 = z19.W0(str, " ");
        ur.b(W0.length == 2, str);
        String[] split = W0[1].split(";\\s?", 0);
        ImmutableMap.a aVar = new ImmutableMap.a();
        for (String str2 : split) {
            String[] W02 = z19.W0(str2, "=");
            aVar.f(W02[0], W02[1]);
        }
        return aVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.i.equals(aVar.i) && this.j.equals(aVar.j) && z19.c(this.f, aVar.f) && z19.c(this.g, aVar.g) && z19.c(this.h, aVar.h);
    }

    public int hashCode() {
        int hashCode = (((((((((((((217 + this.a.hashCode()) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    private a(b bVar, ImmutableMap immutableMap, c cVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.f = bVar.g;
        this.g = bVar.h;
        this.e = bVar.f;
        this.h = bVar.i;
        this.i = immutableMap;
        this.j = cVar;
    }
}
