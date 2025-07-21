package com.nytimes.android.push;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.g;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.at7;
import defpackage.td4;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* loaded from: classes4.dex */
public final class MessagingHelper {
    private static final String ACTION = "breaking_news";
    public static final a Companion = new a(null);
    private static final String PREV_MSG = "previousMessage";
    private final BreakingNewsAlertManager bnaManager;
    private final DeepLinkManager deepLinkManager;
    private final td4 mainActivityNavigator;
    private final at7 singleArticleActivityNavigator;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(Context context, String str) {
            SharedPreferences b = g.b(context);
            if (zq3.c(b.getString(MessagingHelper.PREV_MSG, ""), str)) {
                return true;
            }
            b.edit().putString(MessagingHelper.PREV_MSG, str).apply();
            return false;
        }

        public final void c(Context context) {
            zq3.h(context, "context");
            context.getApplicationContext().sendBroadcast(new Intent(MessagingHelper.ACTION));
        }

        private a() {
        }
    }

    public MessagingHelper(td4 td4Var, at7 at7Var, BreakingNewsAlertManager breakingNewsAlertManager, DeepLinkManager deepLinkManager) {
        zq3.h(td4Var, "mainActivityNavigator");
        zq3.h(at7Var, "singleArticleActivityNavigator");
        zq3.h(breakingNewsAlertManager, "bnaManager");
        zq3.h(deepLinkManager, "deepLinkManager");
        this.mainActivityNavigator = td4Var;
        this.singleArticleActivityNavigator = at7Var;
        this.bnaManager = breakingNewsAlertManager;
        this.deepLinkManager = deepLinkManager;
    }

    private final String getAnyUrl(BreakingNewsAlert breakingNewsAlert) {
        String o = breakingNewsAlert.o();
        return o == null ? breakingNewsAlert.l() : o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getBnaLaunchAppIntent(android.content.Context r12, com.nytimes.android.push.BreakingNewsAlert r13, defpackage.by0<? super android.app.PendingIntent> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.nytimes.android.push.MessagingHelper$getBnaLaunchAppIntent$1
            if (r0 == 0) goto L13
            r0 = r14
            com.nytimes.android.push.MessagingHelper$getBnaLaunchAppIntent$1 r0 = (com.nytimes.android.push.MessagingHelper$getBnaLaunchAppIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.push.MessagingHelper$getBnaLaunchAppIntent$1 r0 = new com.nytimes.android.push.MessagingHelper$getBnaLaunchAppIntent$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r11 = r0.L$1
            r13 = r11
            com.nytimes.android.push.BreakingNewsAlert r13 = (com.nytimes.android.push.BreakingNewsAlert) r13
            java.lang.Object r11 = r0.L$0
            r12 = r11
            android.content.Context r12 = (android.content.Context) r12
            kotlin.f.b(r14)
        L32:
            r3 = r12
            goto L94
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            kotlin.f.b(r14)
            java.lang.String r14 = r11.getAnyUrl(r13)
            if (r14 != 0) goto L58
            java.lang.String r14 = r13.n()
            if (r14 == 0) goto L4c
            goto L58
        L4c:
            td4 r11 = r11.mainActivityNavigator
            android.content.Intent r11 = r11.d(r12)
            r13 = 0
            android.app.PendingIntent r11 = defpackage.wq5.a(r11, r12, r13, r13)
            goto Lca
        L58:
            java.lang.String r14 = r11.getAnyUrl(r13)
            defpackage.zq3.e(r14)
            com.nytimes.navigation.deeplink.DeepLinkManager$a r2 = com.nytimes.navigation.deeplink.DeepLinkManager.g
            boolean r2 = r2.a(r14)
            if (r2 == 0) goto La7
            com.nytimes.navigation.deeplink.DeepLinkManager r2 = r11.deepLinkManager
            b65$a r4 = defpackage.b65.Companion
            java.lang.String r5 = r13.a()
            java.lang.String r6 = r13.g()
            java.lang.String r7 = r13.i()
            java.lang.String r8 = r13.e()
            java.lang.String r9 = r11.getAnyUrl(r13)
            java.lang.String r10 = r13.n()
            b65 r11 = r4.a(r5, r6, r7, r8, r9, r10)
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r14 = r2.f(r12, r14, r11, r0)
            if (r14 != r1) goto L32
            return r1
        L94:
            r2 = r14
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto La5
            int r4 = r13.h()
            r6 = 4
            r7 = 0
            r5 = 0
            android.app.PendingIntent r11 = defpackage.wq5.b(r2, r3, r4, r5, r6, r7)
            goto Lca
        La5:
            r11 = 0
            goto Lca
        La7:
            at7 r0 = r11.singleArticleActivityNavigator
            java.lang.String r2 = r13.n()
            int r3 = r13.h()
            java.lang.String r4 = r13.a()
            java.lang.String r5 = r13.g()
            java.lang.String r6 = r13.i()
            java.lang.String r7 = r13.e()
            java.lang.String r8 = r11.getAnyUrl(r13)
            r1 = r12
            android.app.PendingIntent r11 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        Lca:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.MessagingHelper.getBnaLaunchAppIntent(android.content.Context, com.nytimes.android.push.BreakingNewsAlert, by0):java.lang.Object");
    }

    public final void onMessage(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            BreakingNewsAlert a2 = BreakingNewsAlert.Companion.a(extras, context);
            if (a2.b() == null) {
                NYTLogger.l("Skip bna with null alertMsg", new Object[0]);
                return;
            }
            if (!Companion.b(context, a2.b())) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MessagingHelper$onMessage$1(this, context, a2, null), 3, null);
                return;
            }
            NYTLogger.l("Skip dup bna " + a2.b(), new Object[0]);
        }
    }
}
