package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class ph3 {
    public static final oh3 a(List list) {
        zq3.h(list, "<this>");
        oh3 oh3Var = list instanceof oh3 ? (oh3) list : null;
        return oh3Var == null ? new oh3(list) : oh3Var;
    }
}
