package defpackage;

import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.BaseConstraintController;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class m45 extends BaseConstraintController {
    public static final a c = new a(null);
    private static final String d;
    private final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String i = h94.i("NetworkNotRoamingCtrlr");
        zq3.g(i, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m45(dv0 dv0Var) {
        super(dv0Var);
        zq3.h(dv0Var, "tracker");
        this.b = 7;
    }

    @Override // defpackage.yu0
    public boolean c(dk9 dk9Var) {
        zq3.h(dk9Var, "workSpec");
        return dk9Var.j.f() == NetworkType.NOT_ROAMING;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected int e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(y45 y45Var) {
        zq3.h(y45Var, "value");
        return (y45Var.a() && y45Var.c()) ? false : true;
    }
}
