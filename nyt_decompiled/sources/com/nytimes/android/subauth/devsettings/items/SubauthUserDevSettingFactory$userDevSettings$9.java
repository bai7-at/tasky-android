package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import android.widget.Toast;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.q98;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$9", f = "SubauthUserDevSettingFactory.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$userDevSettings$9 extends SuspendLambda implements it2 {
    final /* synthetic */ q98 $subauthUser;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$userDevSettings$9(q98 q98Var, by0 by0Var) {
        super(3, by0Var);
        this.$subauthUser = q98Var;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, String str, by0 by0Var) {
        SubauthUserDevSettingFactory$userDevSettings$9 subauthUserDevSettingFactory$userDevSettings$9 = new SubauthUserDevSettingFactory$userDevSettings$9(this.$subauthUser, by0Var);
        subauthUserDevSettingFactory$userDevSettings$9.L$0 = context;
        subauthUserDevSettingFactory$userDevSettings$9.L$1 = str;
        return subauthUserDevSettingFactory$userDevSettings$9.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Context context2 = (Context) this.L$0;
            String obj2 = h.c1((String) this.L$1).toString();
            if (h.d0(obj2) || obj2.length() == 0) {
                obj2 = null;
            }
            q98 q98Var = this.$subauthUser;
            this.L$0 = context2;
            this.L$1 = obj2;
            this.label = 1;
            if (q98Var.l(obj2, this) == h) {
                return h;
            }
            context = context2;
            str = obj2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            context = (Context) this.L$0;
            f.b(obj);
        }
        Toast.makeText(context, "Setting NYT-S Cookie to: " + str, 0).show();
        return ww8.a;
    }
}
