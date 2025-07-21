package defpackage;

import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public abstract class uk7 {
    public /* synthetic */ uk7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer c(uk7 uk7Var, vu3 vu3Var, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = i.l();
        }
        return uk7Var.b(vu3Var, list);
    }

    public abstract void a(wk7 wk7Var);

    public abstract KSerializer b(vu3 vu3Var, List list);

    public abstract ym1 d(vu3 vu3Var, String str);

    public abstract nk7 e(vu3 vu3Var, Object obj);

    private uk7() {
    }
}
