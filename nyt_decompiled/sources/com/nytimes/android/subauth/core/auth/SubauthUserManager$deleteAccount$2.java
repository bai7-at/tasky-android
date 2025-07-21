package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.api.client.SubscriptionLevel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$deleteAccount$2", f = "SubauthUserManager.kt", l = {678, 679, 687, 703}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$deleteAccount$2 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SubscriptionLevel.values().length];
            try {
                iArr[SubscriptionLevel.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionLevel.ANONYMOUSLY_SUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionLevel.REGISTERED_SUBSCRIBED_UNLINKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$deleteAccount$2(SubauthUserManager subauthUserManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$deleteAccount$2(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:14:0x0028, B:15:0x00a3, B:30:0x008e), top: B:2:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.SubauthUserManager$deleteAccount$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$deleteAccount$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
