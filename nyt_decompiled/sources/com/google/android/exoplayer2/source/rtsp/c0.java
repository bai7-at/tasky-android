package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.z19;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class c0 {
    public final ImmutableMap a;
    public final ImmutableList b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public static final class b {
        private final HashMap a = new HashMap();
        private final ImmutableList.a b = new ImmutableList.a();
        private int c = -1;
        private String d;
        private String e;
        private String f;
        private Uri g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        public b m(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        public b n(com.google.android.exoplayer2.source.rtsp.a aVar) {
            this.b.a(aVar);
            return this;
        }

        public c0 o() {
            return new c0(this);
        }

        public b p(int i) {
            this.c = i;
            return this;
        }

        public b q(String str) {
            this.h = str;
            return this;
        }

        public b r(String str) {
            this.k = str;
            return this;
        }

        public b s(String str) {
            this.i = str;
            return this;
        }

        public b t(String str) {
            this.e = str;
            return this;
        }

        public b u(String str) {
            this.l = str;
            return this;
        }

        public b v(String str) {
            this.j = str;
            return this;
        }

        public b w(String str) {
            this.d = str;
            return this;
        }

        public b x(String str) {
            this.f = str;
            return this;
        }

        public b y(Uri uri) {
            this.g = uri;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f == c0Var.f && this.a.equals(c0Var.a) && this.b.equals(c0Var.b) && z19.c(this.d, c0Var.d) && z19.c(this.c, c0Var.c) && z19.c(this.e, c0Var.e) && z19.c(this.l, c0Var.l) && z19.c(this.g, c0Var.g) && z19.c(this.j, c0Var.j) && z19.c(this.k, c0Var.k) && z19.c(this.h, c0Var.h) && z19.c(this.i, c0Var.i);
    }

    public int hashCode() {
        int hashCode = (((217 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31;
        String str4 = this.l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    private c0(b bVar) {
        this.a = ImmutableMap.f(bVar.a);
        this.b = bVar.b.k();
        this.c = (String) z19.j(bVar.d);
        this.d = (String) z19.j(bVar.e);
        this.e = (String) z19.j(bVar.f);
        this.g = bVar.g;
        this.h = bVar.h;
        this.f = bVar.c;
        this.i = bVar.i;
        this.j = bVar.k;
        this.k = bVar.l;
        this.l = bVar.j;
    }
}
