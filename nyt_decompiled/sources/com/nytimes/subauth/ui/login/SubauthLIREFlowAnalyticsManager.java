package com.nytimes.subauth.ui.login;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.a;
import com.nytimes.subauth.ui.models.LoginType;
import defpackage.by0;
import defpackage.i78;
import defpackage.j78;
import defpackage.na4;
import defpackage.o98;
import defpackage.oa4;
import defpackage.p54;
import defpackage.u52;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public final class SubauthLIREFlowAnalyticsManager {
    private final MutableSharedFlow a;
    private final SubauthListenerManager b;
    private final j78 c;

    public SubauthLIREFlowAnalyticsManager(o98 o98Var, MutableSharedFlow mutableSharedFlow, SubauthListenerManager subauthListenerManager) {
        zq3.h(o98Var, "subauthUser");
        zq3.h(mutableSharedFlow, "analyticsEventFlow");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        this.a = mutableSharedFlow;
        this.b = subauthListenerManager;
        this.c = new j78(o98Var.b());
    }

    public final Object A(by0 by0Var) {
        Object emit = this.a.emit(j78.c(this.c, u52.l0.f, null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object a(boolean z, p54 p54Var, by0 by0Var) {
        this.b.V("Checkbox Email Opt In (" + z + ", " + p54Var.a() + ")");
        Object emit = this.a.emit(j78.c(this.c, new u52.a(p54Var, z), null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object b(p54 p54Var, by0 by0Var) {
        this.b.V("Continue (Account Ready)");
        Object emit = this.a.emit(j78.c(this.c, new u52.b(p54Var), null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object c(by0 by0Var) {
        this.b.V("Set New Password (RegiLite)");
        Object emit = this.a.emit(j78.c(this.c, u52.c.f, null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object d(String str, by0 by0Var) {
        this.b.K("Create New Password Failed Error (" + str);
        Object emit = this.a.emit(this.c.b(u52.d.f, str), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object e(by0 by0Var) {
        Object emit = this.a.emit(j78.c(this.c, u52.e.f, null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object f(String str, p54 p54Var, by0 by0Var) {
        this.b.K("Custom NYT-S Login Failed Error Dialog");
        Object emit = this.a.emit(this.c.b(new u52.f(p54Var), str), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object g(p54 p54Var, by0 by0Var) {
        Object emit = this.a.emit(j78.c(this.c, new u52.h(p54Var), null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object h(by0 by0Var) {
        this.b.V("Continue (Email First)");
        Object emit = this.a.emit(j78.c(this.c, u52.i.f, null, 2, null), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object i(com.nytimes.android.subauth.core.auth.network.response.a aVar, by0 by0Var) {
        String str = aVar instanceof a.C0413a ? "locked account" : DatasetUtils.UNKNOWN_IDENTITY_ID;
        this.b.K("Email First Continue Fail: " + str);
        Object emit = this.a.emit(this.c.b(u52.j.f, str), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object j(by0 by0Var) {
        this.b.V("Continue (Email First to RegiLite Create Password)");
        Object emit = this.a.emit(j78.c(this.c, u52.k.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object k(by0 by0Var) {
        this.b.V("Continue (Email First to Login)");
        Object emit = this.a.emit(j78.c(this.c, u52.l.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object l(by0 by0Var) {
        this.b.V("Continue (Email First to Register)");
        Object emit = this.a.emit(j78.c(this.c, u52.m.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object m(by0 by0Var) {
        this.b.V("Continue (Email First to RegiLite Verify Email)");
        Object emit = this.a.emit(j78.c(this.c, u52.n.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object n(by0 by0Var) {
        this.b.V("Login");
        Object emit = this.a.emit(j78.c(this.c, u52.o.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object o(by0 by0Var) {
        this.b.V("Create Account");
        Object emit = this.a.emit(j78.c(this.c, u52.r.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object p(na4.b bVar, by0 by0Var) {
        oa4.b d;
        LoginError a;
        oa4.b d2;
        this.b.V("Email Support Requested");
        String str = null;
        boolean z = ((bVar == null || (d2 = bVar.d()) == null) ? null : d2.f()) != null;
        if (bVar != null && (d = bVar.d()) != null && (a = d.a()) != null) {
            str = a.c();
        }
        Object emit = this.a.emit(new i78.c(z, str), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object q(by0 by0Var) {
        this.b.V("Facebook SSO");
        Object emit = this.a.emit(j78.c(this.c, u52.u.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object r(by0 by0Var) {
        this.b.V("Google SSO");
        Object emit = this.a.emit(j78.c(this.c, u52.x.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object s(boolean z, by0 by0Var) {
        Object emit = this.a.emit(new i78.d(z), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.r54 r6, boolean r7, defpackage.nk8 r8, defpackage.p54 r9, defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager.t(r54, boolean, nk8, p54, by0):java.lang.Object");
    }

    public final Object u(LoginType loginType, na4.b bVar, by0 by0Var) {
        u52 u52Var;
        if (zq3.c(loginType, LoginType.EmailLogin.INSTANCE)) {
            u52Var = u52.p.f;
        } else if (zq3.c(loginType, LoginType.Registration.INSTANCE)) {
            u52Var = u52.s.f;
        } else if (loginType instanceof LoginType.FacebookSSOLogin) {
            u52Var = u52.v.f;
        } else if (loginType instanceof LoginType.GoogleSSOLogin) {
            u52Var = u52.y.f;
        } else {
            if (!(loginType instanceof LoginType.RegiLiteLogin)) {
                throw new NoWhenBranchMatchedException();
            }
            u52Var = null;
        }
        if (u52Var != null) {
            this.b.K("Login Fail (" + loginType + "): " + bVar.a());
            Object emit = this.a.emit(this.c.b(u52Var, bVar.a()), by0Var);
            if (emit == kotlin.coroutines.intrinsics.a.h()) {
                return emit;
            }
        }
        return ww8.a;
    }

    public final Object v(LoginType loginType, by0 by0Var) {
        if (loginType instanceof LoginType.EmailLogin) {
            Object emit = this.a.emit(j78.c(this.c, u52.q.f, null, 2, null), by0Var);
            return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
        }
        if (loginType instanceof LoginType.Registration) {
            Object emit2 = this.a.emit(j78.c(this.c, u52.t.f, null, 2, null), by0Var);
            return emit2 == kotlin.coroutines.intrinsics.a.h() ? emit2 : ww8.a;
        }
        if (loginType instanceof LoginType.FacebookSSOLogin) {
            Object emit3 = this.a.emit(j78.c(this.c, u52.w.f, null, 2, null), by0Var);
            return emit3 == kotlin.coroutines.intrinsics.a.h() ? emit3 : ww8.a;
        }
        if (loginType instanceof LoginType.GoogleSSOLogin) {
            Object emit4 = this.a.emit(j78.c(this.c, u52.z.f, null, 2, null), by0Var);
            return emit4 == kotlin.coroutines.intrinsics.a.h() ? emit4 : ww8.a;
        }
        zq3.c(loginType, LoginType.RegiLiteLogin.INSTANCE);
        return ww8.a;
    }

    public final Object w(by0 by0Var) {
        this.b.K("NYT-S Login Failed Error Dialog");
        Object emit = this.a.emit(this.c.a(u52.g.f), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object x(by0 by0Var) {
        this.b.V("Submit Email Verification Code");
        Object emit = this.a.emit(j78.c(this.c, u52.j0.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object y(String str, by0 by0Var) {
        this.b.K("Verify Email Failed Error (" + str);
        Object emit = this.a.emit(this.c.b(u52.k0.f, str), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }

    public final Object z(by0 by0Var) {
        this.b.V("Request New Email Code (RegiLite)");
        Object emit = this.a.emit(j78.c(this.c, u52.i0.f, null, 2, null), by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }
}
