package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.c;
import androidx.constraintlayout.core.state.State;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.bu1;
import defpackage.ca3;
import defpackage.fc9;
import defpackage.g59;
import defpackage.l60;
import defpackage.ss2;
import defpackage.u08;
import defpackage.wu0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ConstrainScope {
    private final Object a;
    private final List b;
    private final wu0 c;
    private final g59 d;
    private final g59 e;
    private final ca3 f;
    private final g59 g;
    private final g59 h;
    private final ca3 i;
    private final l60 j;
    private Dimension k;
    private Dimension l;
    private fc9 m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;

    public ConstrainScope(Object obj) {
        zq3.h(obj, "id");
        this.a = obj;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Integer num = State.f;
        zq3.g(num, "PARENT");
        this.c = new wu0(num);
        this.d = new f(obj, -2, arrayList);
        this.e = new f(obj, 0, arrayList);
        this.f = new b(obj, 0, arrayList);
        this.g = new f(obj, -1, arrayList);
        this.h = new f(obj, 1, arrayList);
        this.i = new b(obj, 1, arrayList);
        this.j = new a(obj, arrayList);
        Dimension.Companion companion = Dimension.a;
        this.k = companion.a();
        this.l = companion.a();
        this.m = fc9.b.a();
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = 1.0f;
        float f = 0;
        this.q = bu1.g(f);
        this.r = bu1.g(f);
        this.s = bu1.g(f);
        this.t = 0.5f;
        this.u = 0.5f;
        this.v = Float.NaN;
        this.w = Float.NaN;
    }

    public static /* synthetic */ void c(ConstrainScope constrainScope, wu0 wu0Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.b(wu0Var, f);
    }

    public static /* synthetic */ void i(ConstrainScope constrainScope, c.C0069c c0069c, c.C0069c c0069c2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        constrainScope.h(c0069c, c0069c2, (i & 4) != 0 ? bu1.g(0) : f, (i & 8) != 0 ? bu1.g(0) : f2, (i & 16) != 0 ? bu1.g(0) : f3, (i & 32) != 0 ? bu1.g(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    public final void a(u08 u08Var) {
        zq3.h(u08Var, TransferTable.COLUMN_STATE);
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((ss2) it2.next()).invoke(u08Var);
        }
    }

    public final void b(wu0 wu0Var, float f) {
        zq3.h(wu0Var, "other");
        i(this, wu0Var.d(), wu0Var.b(), 0.0f, 0.0f, 0.0f, 0.0f, f, 60, null);
    }

    public final g59 d() {
        return this.g;
    }

    public final Object e() {
        return this.a;
    }

    public final wu0 f() {
        return this.c;
    }

    public final ca3 g() {
        return this.f;
    }

    public final void h(c.C0069c c0069c, c.C0069c c0069c2, float f, float f2, float f3, float f4, final float f5) {
        zq3.h(c0069c, "start");
        zq3.h(c0069c2, "end");
        this.d.a(c0069c, f, f3);
        this.g.a(c0069c2, f2, f4);
        this.b.add(new ss2() { // from class: androidx.constraintlayout.compose.ConstrainScope$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(u08 u08Var) {
                zq3.h(u08Var, TransferTable.COLUMN_STATE);
                u08Var.b(this.e()).q(u08Var.m() == LayoutDirection.Rtl ? 1 - f5 : f5);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((u08) obj);
                return ww8.a;
            }
        });
    }
}
