package com.nytimes.android.subauth.core.purr.network;

import android.content.SharedPreferences;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.exception.ApolloException;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.devsettings.purr.PurrEmailOptInResultOverride;
import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.model.PrivacyDirectives;
import com.nytimes.android.subauth.core.purr.model.QueryPrivacyDirectivesResult;
import com.nytimes.android.subauth.core.util.ControlledRunner;
import defpackage.a36;
import defpackage.by0;
import defpackage.cg5;
import defpackage.fm5;
import defpackage.g78;
import defpackage.n96;
import defpackage.q22;
import defpackage.s86;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.w88;
import defpackage.wf5;
import defpackage.ww8;
import defpackage.xe8;
import defpackage.yj;
import defpackage.zq3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrClientImpl implements s86 {
    public static final a Companion = new a(null);
    private final ApolloClient a;
    private final w88 b;
    private final ss2 c;
    private final n96 d;
    private final xe8 e;
    private final String f;
    private final SharedPreferences g;
    private final SubauthListenerManager h;
    private final ControlledRunner i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PurrEmailOptInResultOverride.values().length];
            try {
                iArr[PurrEmailOptInResultOverride.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurrEmailOptInResultOverride.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurrEmailOptInResultOverride.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[EmailMarketingOptInDirectiveValue.values().length];
            try {
                iArr2[EmailMarketingOptInDirectiveValue.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EmailMarketingOptInDirectiveValue.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EmailMarketingOptInDirectiveValue.DO_NOT_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public PurrClientImpl(ApolloClient apolloClient, w88 w88Var, ss2 ss2Var, n96 n96Var, xe8 xe8Var, String str, SharedPreferences sharedPreferences, SubauthListenerManager subauthListenerManager) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(w88Var, "networkStatus");
        zq3.h(ss2Var, "doNotTrack");
        zq3.h(n96Var, "purrResponseParser");
        zq3.h(xe8Var, "tcfPurrResponseParser");
        zq3.h(str, "purrSourceName");
        zq3.h(sharedPreferences, "defaultSharedPrefs");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        this.a = apolloClient;
        this.b = w88Var;
        this.c = ss2Var;
        this.d = n96Var;
        this.e = xe8Var;
        this.f = str;
        this.g = sharedPreferences;
        this.h = subauthListenerManager;
        this.i = new ControlledRunner();
    }

    private final String l(EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue) {
        int i = b.b[emailMarketingOptInDirectiveValue.ordinal()];
        if (i == 1) {
            return "checked";
        }
        if (i == 2) {
            return "unchecked";
        }
        if (i == 3) {
            return "do-not-display";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QueryPrivacyDirectivesResult n(yj yjVar) {
        a36.d b2;
        cg5 a2;
        PrivacyDirectives s;
        wf5 a3;
        List list = yjVar.d;
        wf5.a aVar = null;
        q22 q22Var = list != null ? (q22) i.m0(list) : null;
        if (q22Var != null) {
            g78.a.a(this.h, "PrivacyDirectivesV2 Query", q22Var, null, 4, null);
            throw new PurrClientException("Response error on Query PURR Directives: " + q22Var.b(), null, false, 6, null);
        }
        a36.f m = m(yjVar);
        if (m == null || (b2 = m.b()) == null || (a2 = b2.a()) == null || (s = this.d.s(a2)) == null) {
            throw new PurrClientException("Response missing expected data.\n" + yjVar, null, false, 6, null);
        }
        a36.b a4 = m.a();
        a36.e c = m.c();
        if (c != null && (a3 = c.a()) != null) {
            aVar = a3.a();
        }
        return new QueryPrivacyDirectivesResult(s, this.e.a(a4, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #1 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0078, B:13:0x007a, B:15:0x007e, B:20:0x008b, B:21:0x00cb, B:42:0x00cc, B:43:0x00e6, B:34:0x0060), top: B:7:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[Catch: Exception -> 0x0032, TRY_ENTER, TryCatch #1 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0078, B:13:0x007a, B:15:0x007e, B:20:0x008b, B:21:0x00cb, B:42:0x00cc, B:43:0x00e6, B:34:0x0060), top: B:7:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(boolean r15, com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue r16, boolean r17, defpackage.by0 r18) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.network.PurrClientImpl.o(boolean, com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue, boolean, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: Exception -> 0x0037, ApolloException -> 0x00c3, LOOP:0: B:37:0x00af->B:39:0x00b5, LOOP_END, TryCatch #0 {ApolloException -> 0x00c3, blocks: (B:36:0x0094, B:37:0x00af, B:39:0x00b5, B:41:0x00c6), top: B:35:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.s86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName r20, com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue r21, java.util.List r22, defpackage.by0 r23) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.network.PurrClientImpl.a(com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName, com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue, java.util.List, by0):java.lang.Object");
    }

    @Override // defpackage.s86
    public Object b(List list, AgentTCFInfo agentTCFInfo, by0 by0Var) {
        return this.i.b(new PurrClientImpl$queryPrivacyDirectives$2(this, agentTCFInfo, list, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x006c, B:13:0x006e, B:15:0x0072, B:17:0x007c, B:19:0x0082, B:21:0x0088, B:23:0x008e, B:25:0x0094, B:29:0x009d, B:30:0x00b8, B:31:0x00b9, B:32:0x00d8, B:52:0x00d9, B:53:0x00f3, B:41:0x0051), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x006c, B:13:0x006e, B:15:0x0072, B:17:0x007c, B:19:0x0082, B:21:0x0088, B:23:0x008e, B:25:0x0094, B:29:0x009d, B:30:0x00b8, B:31:0x00b9, B:32:0x00d8, B:52:0x00d9, B:53:0x00f3, B:41:0x0051), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x006c, B:13:0x006e, B:15:0x0072, B:17:0x007c, B:19:0x0082, B:21:0x0088, B:23:0x008e, B:25:0x0094, B:29:0x009d, B:30:0x00b8, B:31:0x00b9, B:32:0x00d8, B:52:0x00d9, B:53:0x00f3, B:41:0x0051), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.s86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r13, java.lang.String r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.network.PurrClientImpl.c(java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.s86
    public Object d(boolean z, EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue, boolean z2, by0 by0Var) {
        PurrEmailOptInResultOverride purrEmailOptInResultOverride;
        String string = this.g.getString("Purr.Mutate.EmailOptIn.Override", null);
        if (string == null || (purrEmailOptInResultOverride = fm5.a(string)) == null) {
            purrEmailOptInResultOverride = PurrEmailOptInResultOverride.NO_OVERRIDE;
        }
        int i = b.a[purrEmailOptInResultOverride.ordinal()];
        if (i == 1) {
            Object o = o(z, emailMarketingOptInDirectiveValue, z2, by0Var);
            return o == kotlin.coroutines.intrinsics.a.h() ? o : ww8.a;
        }
        if (i == 2) {
            ul8.a.z("PURR").a("Dev Setting Override: Returning success", new Object[0]);
            return ww8.a;
        }
        if (i != 3) {
            return ww8.a;
        }
        ul8.a.z("PURR").a("Dev Setting Override: Returning failure", new Object[0]);
        throw new PurrClientException("Dev Setting Override: Error on Mutate Update Email Pref", null, false, 6, null);
    }

    public final a36.f m(yj yjVar) {
        zq3.h(yjVar, "queryResponse");
        List list = yjVar.d;
        q22 q22Var = list != null ? (q22) i.m0(list) : null;
        if (q22Var != null) {
            g78.a.a(this.h, "PrivacyDirectivesV2 Query", q22Var, null, 4, null);
            throw new PurrClientException("Response error on Query PURR Directives: " + q22Var.b(), null, false, 6, null);
        }
        try {
            return ((a36.c) yjVar.a()).a();
        } catch (ApolloException e) {
            String message = e.getMessage();
            this.h.f("PrivacyDirectivesV2 Query", message);
            throw new PurrClientException("Partial Response on Query PURR Directives: " + message, e, false, 4, null);
        }
    }
}
