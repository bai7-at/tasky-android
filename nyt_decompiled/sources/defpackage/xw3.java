package defpackage;

import com.comscore.streaming.ContentFeedType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class xw3 {
    private int a;
    private int b;
    private final ay4 c;

    public /* synthetic */ xw3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final ay4 c() {
        return this.c;
    }

    public final void d(int i) {
        this.a = i;
    }

    public final tw3 e(tw3 tw3Var, vx1 vx1Var) {
        tw3Var.c(vx1Var);
        return tw3Var;
    }

    private xw3() {
        this.a = ContentFeedType.OTHER;
        this.c = um3.a();
    }
}
