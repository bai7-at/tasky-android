package com.nytimes.android.entitlements;

import android.content.Context;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fp6;
import defpackage.id9;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ReAuthLauncherImpl implements fp6 {
    private final z58 a;
    private final id9 b;

    public ReAuthLauncherImpl(z58 z58Var, id9 id9Var) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(id9Var, "webActivityNavigator");
        this.a = z58Var;
        this.b = id9Var;
    }

    @Override // defpackage.fp6
    public Object a(final Context context, final String str, by0 by0Var) {
        Object j = this.a.j(context, RegiInterface.RegiGateway, new qs2() { // from class: com.nytimes.android.entitlements.ReAuthLauncherImpl$reAuthAndNavigate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m363invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m363invoke() {
                id9 id9Var;
                id9Var = ReAuthLauncherImpl.this.b;
                id9Var.c(context, str);
            }
        }, by0Var);
        return j == kotlin.coroutines.intrinsics.a.h() ? j : ww8.a;
    }
}
