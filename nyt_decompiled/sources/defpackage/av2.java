package defpackage;

import com.nytimes.android.hybrid.HybridUserInfo;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class av2 {
    public static final HybridUserInfo a(zu2 zu2Var) {
        zq3.h(zu2Var, "<this>");
        String e = zu2Var.e();
        String f = zu2Var.f();
        return new HybridUserInfo(e, (f == null || h.d0(f)) ? null : zu2Var.f(), null, null, zu2Var.c());
    }
}
