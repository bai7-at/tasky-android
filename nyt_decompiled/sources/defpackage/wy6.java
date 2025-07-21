package defpackage;

import com.nytimes.android.subauth.core.auth.models.b;
import defpackage.tl5;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class wy6 {
    public static final b a(tl5 tl5Var) {
        zq3.h(tl5Var, "<this>");
        if (zq3.c(tl5Var, tl5.b.a)) {
            return b.C0410b.a;
        }
        if (zq3.c(tl5Var, tl5.a.a)) {
            return new b.a.c(500);
        }
        throw new NoWhenBranchMatchedException();
    }
}
