package com.google.accompanist.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.g14;
import defpackage.gt2;
import defpackage.j14;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tc7;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PagerState implements tc7 {
    public static final a h = new a(null);
    private static final ea7 i = ListSaverKt.a(new gt2() { // from class: com.google.accompanist.pager.PagerState$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(fa7 fa7Var, PagerState pagerState) {
            zq3.h(fa7Var, "$this$listSaver");
            zq3.h(pagerState, "it");
            return i.e(Integer.valueOf(pagerState.k()));
        }
    }, new ss2() { // from class: com.google.accompanist.pager.PagerState$Companion$Saver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PagerState invoke(List list) {
            zq3.h(list, "it");
            Object obj = list.get(0);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return new PagerState(((Integer) obj).intValue());
        }
    });
    private final LazyListState a;
    private final sy4 b;
    private final sy4 c;
    private final x08 d;
    private final x08 e;
    private final sy4 f;
    private final sy4 g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a() {
            return PagerState.i;
        }

        private a() {
        }
    }

    public PagerState(int i2) {
        this.a = new LazyListState(i2, 0, 2, null);
        this.b = b0.e(Integer.valueOf(i2), null, 2, null);
        this.c = b0.e(0, null, 2, null);
        this.d = y.d(new qs2() { // from class: com.google.accompanist.pager.PagerState$pageCount$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(PagerState.this.o().x().h());
            }
        });
        this.e = y.d(new qs2() { // from class: com.google.accompanist.pager.PagerState$currentPageOffset$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                g14 l;
                float f;
                l = PagerState.this.l();
                if (l != null) {
                    f = uo6.l((-l.b()) / (l.a() + PagerState.this.n()), -0.5f, 0.5f);
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            }
        });
        this.f = b0.e(null, null, 2, null);
        this.g = b0.e(null, null, 2, null);
    }

    public static /* synthetic */ Object j(PagerState pagerState, int i2, float f, by0 by0Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.i(i2, f, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g14 l() {
        Object obj;
        List k = this.a.x().k();
        ListIterator listIterator = k.listIterator(k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((g14) obj).getIndex() == k()) {
                break;
            }
        }
        return (g14) obj;
    }

    private final int r() {
        return ((Number) this.b.getValue()).intValue();
    }

    private final void t(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + '[' + i2 + "] must be >= 0").toString());
    }

    private final void u(float f, String str) {
        if (-1.0f > f || f > 1.0f) {
            throw new IllegalArgumentException((str + " must be >= -1 and <= 1").toString());
        }
    }

    private final void v(Integer num) {
        this.f.setValue(num);
    }

    private final void z(int i2) {
        this.b.setValue(Integer.valueOf(i2));
    }

    public final void A() {
        g14 p = p();
        if (p != null) {
            w(p.getIndex());
        }
    }

    @Override // defpackage.tc7
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        Object b = this.a.b(mutatePriority, gt2Var, by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    @Override // defpackage.tc7
    public boolean c() {
        return this.a.c();
    }

    @Override // defpackage.tc7
    public float f(float f) {
        return this.a.f(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:20:0x0174, B:21:0x0184, B:23:0x018a, B:27:0x0198, B:29:0x019c, B:31:0x01a7, B:46:0x00f5, B:47:0x0105, B:49:0x010b, B:53:0x011a, B:55:0x011e, B:58:0x013b, B:60:0x0147, B:71:0x0075, B:72:0x00ba, B:74:0x00c5, B:77:0x00d8, B:82:0x0086, B:84:0x009b, B:86:0x009f, B:88:0x00a6, B:91:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:20:0x0174, B:21:0x0184, B:23:0x018a, B:27:0x0198, B:29:0x019c, B:31:0x01a7, B:46:0x00f5, B:47:0x0105, B:49:0x010b, B:53:0x011a, B:55:0x011e, B:58:0x013b, B:60:0x0147, B:71:0x0075, B:72:0x00ba, B:74:0x00c5, B:77:0x00d8, B:82:0x0086, B:84:0x009b, B:86:0x009f, B:88:0x00a6, B:91:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:20:0x0174, B:21:0x0184, B:23:0x018a, B:27:0x0198, B:29:0x019c, B:31:0x01a7, B:46:0x00f5, B:47:0x0105, B:49:0x010b, B:53:0x011a, B:55:0x011e, B:58:0x013b, B:60:0x0147, B:71:0x0075, B:72:0x00ba, B:74:0x00c5, B:77:0x00d8, B:82:0x0086, B:84:0x009b, B:86:0x009f, B:88:0x00a6, B:91:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:20:0x0174, B:21:0x0184, B:23:0x018a, B:27:0x0198, B:29:0x019c, B:31:0x01a7, B:46:0x00f5, B:47:0x0105, B:49:0x010b, B:53:0x011a, B:55:0x011e, B:58:0x013b, B:60:0x0147, B:71:0x0075, B:72:0x00ba, B:74:0x00c5, B:77:0x00d8, B:82:0x0086, B:84:0x009b, B:86:0x009f, B:88:0x00a6, B:91:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:20:0x0174, B:21:0x0184, B:23:0x018a, B:27:0x0198, B:29:0x019c, B:31:0x01a7, B:46:0x00f5, B:47:0x0105, B:49:0x010b, B:53:0x011a, B:55:0x011e, B:58:0x013b, B:60:0x0147, B:71:0x0075, B:72:0x00ba, B:74:0x00c5, B:77:0x00d8, B:82:0x0086, B:84:0x009b, B:86:0x009f, B:88:0x00a6, B:91:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:20:0x0174, B:21:0x0184, B:23:0x018a, B:27:0x0198, B:29:0x019c, B:31:0x01a7, B:46:0x00f5, B:47:0x0105, B:49:0x010b, B:53:0x011a, B:55:0x011e, B:58:0x013b, B:60:0x0147, B:71:0x0075, B:72:0x00ba, B:74:0x00c5, B:77:0x00d8, B:82:0x0086, B:84:0x009b, B:86:0x009f, B:88:0x00a6, B:91:0x00a3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r12, float r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.PagerState.i(int, float, by0):java.lang.Object");
    }

    public final int k() {
        return r();
    }

    public final float m() {
        return ((Number) this.e.getValue()).floatValue();
    }

    public final int n() {
        return ((Number) this.c.getValue()).intValue();
    }

    public final LazyListState o() {
        return this.a;
    }

    public final g14 p() {
        Object obj;
        j14 x = this.a.x();
        Iterator it2 = x.k().iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                g14 g14Var = (g14) next;
                int min = Math.min(g14Var.b() + g14Var.a(), x.g() - x.b()) - Math.max(g14Var.b(), 0);
                do {
                    Object next2 = it2.next();
                    g14 g14Var2 = (g14) next2;
                    int min2 = Math.min(g14Var2.b() + g14Var2.a(), x.g() - x.b()) - Math.max(g14Var2.b(), 0);
                    if (min < min2) {
                        next = next2;
                        min = min2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (g14) obj;
    }

    public final int q() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final void s() {
        v(null);
    }

    public String toString() {
        return "PagerState(pageCount=" + q() + ", currentPage=" + k() + ", currentPageOffset=" + m() + ')';
    }

    public final void w(int i2) {
        if (i2 != r()) {
            z(i2);
        }
    }

    public final void x(qs2 qs2Var) {
        this.g.setValue(qs2Var);
    }

    public final void y(int i2) {
        this.c.setValue(Integer.valueOf(i2));
    }

    public /* synthetic */ PagerState(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
