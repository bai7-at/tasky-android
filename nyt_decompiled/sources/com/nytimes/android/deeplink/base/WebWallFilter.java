package com.nytimes.android.deeplink.base;

import android.content.Context;
import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.a;
import com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse;
import defpackage.by0;
import defpackage.hc1;
import defpackage.hk6;
import defpackage.lk6;
import defpackage.pf9;
import defpackage.rb5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class WebWallFilter implements pf9 {
    private final com.nytimes.android.entitlements.a a;

    static final class a implements DialogInterface.OnClickListener {
        final /* synthetic */ CancellableContinuation a;

        a(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(Boolean.TRUE));
        }
    }

    static final class b implements DialogInterface.OnClickListener {
        final /* synthetic */ CancellableContinuation a;

        b(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(Boolean.FALSE));
        }
    }

    public WebWallFilter(com.nytimes.android.entitlements.a aVar) {
        zq3.h(aVar, "eCommClient");
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(androidx.activity.ComponentActivity r10, defpackage.by0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.nytimes.android.deeplink.base.WebWallFilter$login$1
            if (r0 == 0) goto L14
            r0 = r11
            com.nytimes.android.deeplink.base.WebWallFilter$login$1 r0 = (com.nytimes.android.deeplink.base.WebWallFilter$login$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.nytimes.android.deeplink.base.WebWallFilter$login$1 r0 = new com.nytimes.android.deeplink.base.WebWallFilter$login$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.f.b(r11)
            goto L71
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r5.L$1
            r10 = r9
            androidx.activity.ComponentActivity r10 = (androidx.activity.ComponentActivity) r10
            java.lang.Object r9 = r5.L$0
            com.nytimes.android.deeplink.base.WebWallFilter r9 = (com.nytimes.android.deeplink.base.WebWallFilter) r9
            kotlin.f.b(r11)
            goto L54
        L44:
            kotlin.f.b(r11)
            r5.L$0 = r9
            r5.L$1 = r10
            r5.label = r3
            java.lang.Object r11 = r9.e(r10, r5)
            if (r11 != r0) goto L54
            return r0
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L82
            com.nytimes.android.entitlements.a r1 = r9.a
            r5.L$0 = r8
            r5.L$1 = r8
            r5.label = r2
            r3 = 0
            java.lang.String r4 = "Cooking Log In Prompt"
            r6 = 2
            r7 = 0
            r2 = r10
            java.lang.Object r11 = com.nytimes.android.entitlements.b.a.a(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L71
            return r0
        L71:
            r9 = r11
            oa4 r9 = (defpackage.oa4) r9
            boolean r9 = r9 instanceof oa4.c
            if (r9 == 0) goto L79
            goto L7a
        L79:
            r11 = r8
        L7a:
            oa4 r11 = (defpackage.oa4) r11
            boolean r9 = r11 instanceof oa4.c
            if (r9 == 0) goto L82
            com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse r8 = com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse.SUCCESS
        L82:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.deeplink.base.WebWallFilter.c(androidx.activity.ComponentActivity, by0):java.lang.Object");
    }

    private final boolean d(String str) {
        return this.a.q() || !rb5.h(str);
    }

    private final Object e(Context context, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        final androidx.appcompat.app.a p = new a.C0012a(context).e(hk6.loginToCooking).setPositiveButton(lk6.login, new a(cancellableContinuationImpl)).setNegativeButton(lk6.cancel, new b(cancellableContinuationImpl)).p();
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: com.nytimes.android.deeplink.base.WebWallFilter$showDialog$2$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                a.this.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // defpackage.pf9
    public Object a(ComponentActivity componentActivity, String str, by0 by0Var) {
        return d(str) ? SimpleLoginResponse.SUCCESS : c(componentActivity, by0Var);
    }
}
