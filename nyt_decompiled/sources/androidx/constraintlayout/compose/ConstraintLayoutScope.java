package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.q;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.uo5;
import defpackage.wu0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class ConstraintLayoutScope extends c {
    private a e;
    private final int f;
    private int g = this.f;
    private final ArrayList h = new ArrayList();

    private static final class ConstrainAsModifier extends q implements uo5 {
        private final wu0 c;
        private final ss2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConstrainAsModifier(final wu0 wu0Var, final ss2 ss2Var) {
            super(InspectableValueKt.c() ? new ss2() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(ml3 ml3Var) {
                    zq3.h(ml3Var, "$this$null");
                    throw null;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    lh4.a(obj);
                    b(null);
                    return ww8.a;
                }
            } : InspectableValueKt.a());
            zq3.h(wu0Var, "ref");
            zq3.h(ss2Var, "constrainBlock");
            this.c = wu0Var;
            this.d = ss2Var;
        }

        @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
        public boolean a(ss2 ss2Var) {
            return uo5.a.a(this, ss2Var);
        }

        @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
        public Object b(Object obj, gt2 gt2Var) {
            return uo5.a.b(this, obj, gt2Var);
        }

        public boolean equals(Object obj) {
            ss2 ss2Var = this.d;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return zq3.c(ss2Var, constrainAsModifier != null ? constrainAsModifier.d : null);
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier h(Modifier modifier) {
            return uo5.a.c(this, modifier);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // defpackage.uo5
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public d i(fm1 fm1Var, Object obj) {
            zq3.h(fm1Var, "<this>");
            return new d(this.c, this.d);
        }
    }

    public final class a {
        final /* synthetic */ ConstraintLayoutScope a;

        public a(ConstraintLayoutScope constraintLayoutScope) {
            zq3.h(constraintLayoutScope, "this$0");
            this.a = constraintLayoutScope;
        }

        public final wu0 a() {
            return this.a.e();
        }

        public final wu0 b() {
            return this.a.e();
        }

        public final wu0 c() {
            return this.a.e();
        }
    }

    @Override // androidx.constraintlayout.compose.c
    public void c() {
        super.c();
        this.g = this.f;
    }

    public final Modifier d(Modifier modifier, wu0 wu0Var, ss2 ss2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(wu0Var, "ref");
        zq3.h(ss2Var, "constrainBlock");
        return modifier.h(new ConstrainAsModifier(wu0Var, ss2Var));
    }

    public final wu0 e() {
        ArrayList arrayList = this.h;
        int i = this.g;
        this.g = i + 1;
        wu0 wu0Var = (wu0) i.n0(arrayList, i);
        if (wu0Var != null) {
            return wu0Var;
        }
        wu0 wu0Var2 = new wu0(Integer.valueOf(this.g));
        this.h.add(wu0Var2);
        return wu0Var2;
    }

    public final a f() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.e = aVar2;
        return aVar2;
    }
}
