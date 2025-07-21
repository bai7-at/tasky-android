package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import defpackage.ki7;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cy6 {
    public final long a;
    public final t0 b;
    public final ImmutableList c;
    public final long d;
    public final List e;
    public final List f;
    public final List g;
    private final to6 h;

    public static class b extends cy6 implements x81 {
        final ki7.a i;

        public b(long j, t0 t0Var, List list, ki7.a aVar, List list2, List list3, List list4) {
            super(j, t0Var, list, aVar, list2, list3, list4);
            this.i = aVar;
        }

        @Override // defpackage.cy6
        public String a() {
            return null;
        }

        @Override // defpackage.x81
        public long b(long j) {
            return this.i.j(j);
        }

        @Override // defpackage.x81
        public long c(long j, long j2) {
            return this.i.h(j, j2);
        }

        @Override // defpackage.x81
        public long d(long j, long j2) {
            return this.i.d(j, j2);
        }

        @Override // defpackage.x81
        public long e(long j, long j2) {
            return this.i.f(j, j2);
        }

        @Override // defpackage.x81
        public to6 f(long j) {
            return this.i.k(this, j);
        }

        @Override // defpackage.x81
        public long g(long j, long j2) {
            return this.i.i(j, j2);
        }

        @Override // defpackage.x81
        public long h(long j) {
            return this.i.g(j);
        }

        @Override // defpackage.x81
        public boolean i() {
            return this.i.l();
        }

        @Override // defpackage.x81
        public long j() {
            return this.i.e();
        }

        @Override // defpackage.x81
        public long k(long j, long j2) {
            return this.i.c(j, j2);
        }

        @Override // defpackage.cy6
        public x81 l() {
            return this;
        }

        @Override // defpackage.cy6
        public to6 m() {
            return null;
        }
    }

    public static class c extends cy6 {
        public final Uri i;
        public final long j;
        private final String k;
        private final to6 l;
        private final tt7 m;

        public c(long j, t0 t0Var, List list, ki7.e eVar, List list2, List list3, List list4, String str, long j2) {
            super(j, t0Var, list, eVar, list2, list3, list4);
            this.i = Uri.parse(((i60) list.get(0)).a);
            to6 c = eVar.c();
            this.l = c;
            this.k = str;
            this.j = j2;
            this.m = c != null ? null : new tt7(new to6(null, 0L, j2));
        }

        @Override // defpackage.cy6
        public String a() {
            return this.k;
        }

        @Override // defpackage.cy6
        public x81 l() {
            return this.m;
        }

        @Override // defpackage.cy6
        public to6 m() {
            return this.l;
        }
    }

    public static cy6 o(long j, t0 t0Var, List list, ki7 ki7Var, List list2, List list3, List list4, String str) {
        if (ki7Var instanceof ki7.e) {
            return new c(j, t0Var, list, (ki7.e) ki7Var, list2, list3, list4, str, -1L);
        }
        if (ki7Var instanceof ki7.a) {
            return new b(j, t0Var, list, (ki7.a) ki7Var, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract x81 l();

    public abstract to6 m();

    public to6 n() {
        return this.h;
    }

    private cy6(long j, t0 t0Var, List list, ki7 ki7Var, List list2, List list3, List list4) {
        ur.a(!list.isEmpty());
        this.a = j;
        this.b = t0Var;
        this.c = ImmutableList.t(list);
        this.e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f = list3;
        this.g = list4;
        this.h = ki7Var.a(this);
        this.d = ki7Var.b();
    }
}
