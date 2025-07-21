package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.b0;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.cy4;
import defpackage.fd5;
import defpackage.g14;
import defpackage.gh;
import defpackage.gt2;
import defpackage.ow7;
import defpackage.sy4;
import defpackage.t26;
import defpackage.uo6;
import defpackage.yx4;
import defpackage.zq3;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes4.dex */
public final class DragDropState {
    public static final int m = 8;
    private final boolean a;
    private final LazyListState b;
    private final int c;
    private final int d;
    private final CoroutineScope e;
    private final gt2 f;
    private final sy4 g;
    private final Channel h;
    private final yx4 i;
    private final cy4 j;
    private final sy4 k;
    private Animatable l;

    public DragDropState(boolean z, LazyListState lazyListState, int i, int i2, CoroutineScope coroutineScope, gt2 gt2Var) {
        zq3.h(lazyListState, TransferTable.COLUMN_STATE);
        zq3.h(coroutineScope, "scope");
        zq3.h(gt2Var, "onMove");
        this.a = z;
        this.b = lazyListState;
        this.c = i;
        this.d = i2;
        this.e = coroutineScope;
        this.f = gt2Var;
        this.g = b0.e(null, null, 2, null);
        this.h = ChannelKt.Channel$default(0, null, null, 7, null);
        this.i = t26.a(0.0f);
        this.j = ow7.a(0);
        this.k = b0.e(null, null, 2, null);
        this.l = gh.b(0.0f, 0.0f, 2, null);
    }

    private final float d() {
        return this.i.a();
    }

    private final int f() {
        return this.j.d();
    }

    private final g14 g() {
        Object obj;
        Iterator it2 = this.b.x().k().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            int index = ((g14) obj).getIndex();
            Integer e = e();
            if (e != null && index == e.intValue()) {
                break;
            }
        }
        return (g14) obj;
    }

    private final int i(g14 g14Var) {
        return g14Var.b() + g14Var.a();
    }

    private final void q(float f) {
        this.i.r(f);
    }

    private final void r(Integer num) {
        this.g.setValue(num);
    }

    private final void s(int i) {
        this.j.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Integer num) {
        this.k.setValue(num);
    }

    public final Integer e() {
        return (Integer) this.g.getValue();
    }

    public final float h() {
        if (g() != null) {
            return (f() + d()) - r0.b();
        }
        return 0.0f;
    }

    public final Integer j() {
        return (Integer) this.k.getValue();
    }

    public final Animatable k() {
        return this.l;
    }

    public final Channel l() {
        return this.h;
    }

    public final boolean m() {
        return this.a;
    }

    public final void n(long j) {
        Integer num;
        Object obj;
        Integer valueOf;
        q(d() + fd5.p(j));
        g14 g = g();
        if (g == null) {
            return;
        }
        float b = g.b() + h();
        float a = g.a() + b;
        float f = ((a - b) / 2.0f) + b;
        Iterator it2 = this.b.x().k().iterator();
        while (true) {
            num = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            g14 g14Var = (g14) obj;
            int b2 = g14Var.b();
            int i = i(g14Var);
            int i2 = (int) f;
            if (b2 <= i2 && i2 <= i && g.getIndex() != g14Var.getIndex()) {
                break;
            }
        }
        g14 g14Var2 = (g14) obj;
        if (g.getIndex() < this.c) {
            return;
        }
        if (g14Var2 == null) {
            float c = d() > 0.0f ? uo6.c(a - this.b.x().g(), 0.0f) : d() < 0.0f ? uo6.h(b - this.b.x().j(), 0.0f) : 0.0f;
            if (c == 0.0f) {
                return;
            }
            this.h.mo129trySendJP2dKIU(Float.valueOf(c));
            return;
        }
        if (g14Var2.getIndex() < this.c) {
            return;
        }
        if (g14Var2.getIndex() != this.b.s()) {
            if (g.getIndex() == this.b.s()) {
                valueOf = Integer.valueOf(g14Var2.getIndex());
            }
            if (g.getIndex() < this.d || g14Var2.getIndex() >= this.d) {
            }
            if (num != null) {
                BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new DragDropState$onDrag$1(this, num, g, g14Var2, null), 3, null);
            } else {
                this.f.invoke(Integer.valueOf(g.getIndex()), Integer.valueOf(g14Var2.getIndex()));
            }
            r(Integer.valueOf(g14Var2.getIndex()));
            return;
        }
        valueOf = Integer.valueOf(g.getIndex());
        num = valueOf;
        if (g.getIndex() < this.d) {
        }
    }

    public final void o() {
        if (e() != null) {
            t(e());
            BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new DragDropState$onDragInterrupted$1(this, h(), null), 3, null);
        }
        q(0.0f);
        r(null);
        s(0);
    }

    public final void p(long j) {
        Object obj;
        Iterator it2 = this.b.x().k().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            g14 g14Var = (g14) obj;
            int b = g14Var.b();
            int b2 = g14Var.b() + g14Var.a();
            int p = (int) fd5.p(j);
            if (b <= p && p <= b2) {
                break;
            }
        }
        g14 g14Var2 = (g14) obj;
        if (g14Var2 != null) {
            r(Integer.valueOf(g14Var2.getIndex()));
            s(g14Var2.b());
        }
    }
}
