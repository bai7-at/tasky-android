package defpackage;

import defpackage.pb8;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class qb8 {
    public static final boolean a(pb8 pb8Var) {
        zq3.h(pb8Var, "<this>");
        if (pb8Var instanceof pb8.c ? true : pb8Var instanceof pb8.a) {
            return true;
        }
        if (pb8Var instanceof pb8.b) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
