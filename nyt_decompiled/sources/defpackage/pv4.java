package defpackage;

import androidx.compose.ui.Modifier;

/* loaded from: classes4.dex */
public abstract class pv4 {
    public static final Modifier a(Modifier modifier, Object obj, gt2 gt2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(gt2Var, "onNotNull");
        return obj != null ? modifier.h((Modifier) gt2Var.invoke(modifier, obj)) : modifier;
    }
}
