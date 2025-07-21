package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q98;
import defpackage.ww8;
import defpackage.xn1;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$handleUserStateChange$2", f = "SubauthUserDevSettingFactory.kt", l = {351, 355, 359, 363, 364, 374}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$handleUserStateChange$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ q98 $subauthUserDebugAPI;
    final /* synthetic */ NYTUser $user;
    final /* synthetic */ String $value;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$handleUserStateChange$2$1", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$handleUserStateChange$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ xn1 $result;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(xn1 xn1Var, Context context, String str, by0 by0Var) {
            super(2, by0Var);
            this.$result = xn1Var;
            this.$context = context;
            this.$value = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$result, this.$context, this.$value, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            xn1 xn1Var = this.$result;
            if (xn1Var instanceof xn1.c) {
                Toast.makeText(this.$context, this.$value + " SUCCESS. Logged In!", 1).show();
            } else if (xn1Var instanceof xn1.b) {
                Toast.makeText(this.$context, this.$value + " FAILURE. " + ((xn1.b) xn1Var).a(), 1).show();
            } else if (xn1Var instanceof xn1.a) {
                Toast.makeText(this.$context, this.$value + " CANCELLED", 1).show();
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$handleUserStateChange$2(String str, Context context, NYTUser nYTUser, q98 q98Var, by0 by0Var) {
        super(2, by0Var);
        this.$value = str;
        this.$context = context;
        this.$user = nYTUser;
        this.$subauthUserDebugAPI = q98Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserDevSettingFactory$handleUserStateChange$2(this.$value, this.$context, this.$user, this.$subauthUserDebugAPI, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$handleUserStateChange$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserDevSettingFactory$handleUserStateChange$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
