package com.nytimes.android.entitlements.debugging;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.h;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import defpackage.by0;
import defpackage.c78;
import defpackage.ck6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ic6;
import defpackage.jk;
import defpackage.p16;
import defpackage.w68;
import defpackage.ww8;
import defpackage.x68;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public final class SubauthShowNewsUserStatePreference extends Preference {
    public Subauth subauth;
    public c78 subauthEntitlementClient;

    @fc1(c = "com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$1", f = "SubauthShowNewsUserStatePreference.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return SubauthShowNewsUserStatePreference.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference2 = SubauthShowNewsUserStatePreference.this;
                this.L$0 = subauthShowNewsUserStatePreference2;
                this.label = 1;
                Object T0 = subauthShowNewsUserStatePreference2.T0(this);
                if (T0 == h) {
                    return h;
                }
                obj = T0;
                subauthShowNewsUserStatePreference = subauthShowNewsUserStatePreference2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                subauthShowNewsUserStatePreference = (SubauthShowNewsUserStatePreference) this.L$0;
                f.b(obj);
            }
            subauthShowNewsUserStatePreference.C0((CharSequence) obj);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubauthShowNewsUserStatePreference(Context context) {
        this(context, null, 0, 0, 14, null);
        zq3.h(context, "context");
    }

    private final String P0() {
        StringBuilder sb = new StringBuilder();
        List i = N0().i().i();
        if (i.isEmpty()) {
            sb.append("No Entitlements.");
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
        } else {
            sb.append("ALL Entitlements:");
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            Iterator it2 = i.iterator();
            while (it2.hasNext()) {
                sb.append(((String) it2.next()) + ", ");
            }
            sb.append('\n');
            zq3.g(sb, "append(...)");
        }
        sb.append('\n');
        zq3.g(sb, "append(...)");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    private final String Q0() {
        StringBuilder sb = new StringBuilder();
        boolean F = O0().F();
        boolean Q = O0().Q();
        boolean p = O0().p();
        boolean z = O0().z();
        List N = O0().N();
        sb.append("isSubscribedForNews: " + F);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isSubscribedAndLinked: " + Q);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("hasUnlinkedSubscription: " + p);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isSubscribedViaGooglePlay: " + z);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        if (N != null) {
            sb.append("News SKUs (used to compare entitlements for subscription)");
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            if (N.size() > 3) {
                Iterator it2 = N.subList(0, 3).iterator();
                while (it2.hasNext()) {
                    sb.append("- " + ((String) it2.next()));
                    zq3.g(sb, "append(...)");
                    sb.append('\n');
                    zq3.g(sb, "append(...)");
                }
                sb.append("...");
            } else {
                Iterator it3 = N.iterator();
                while (it3.hasNext()) {
                    sb.append("- " + ((String) it3.next()));
                    zq3.g(sb, "append(...)");
                    sb.append('\n');
                    zq3.g(sb, "append(...)");
                }
            }
        } else {
            sb.append("No known News SKUs to compare subscription for!!!");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(defpackage.by0 r8) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference.R0(by0):java.lang.Object");
    }

    private final String S0() {
        StringBuilder sb = new StringBuilder();
        String d = N0().i().d();
        if (N0().i().r()) {
            sb.append("Registered User.\nEmail:" + d);
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
        } else {
            sb.append("Anonymous User.");
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$parseUserState$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$parseUserState$1 r0 = (com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$parseUserState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$parseUserState$1 r0 = new com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference$parseUserState$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 10
            java.lang.String r5 = "append(...)"
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.L$2
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            java.lang.Object r1 = r0.L$1
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference r0 = (com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference) r0
            kotlin.f.b(r7)
            goto L6c
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.f.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = r6.S0()
            r7.append(r2)
            defpackage.zq3.g(r7, r5)
            r7.append(r4)
            defpackage.zq3.g(r7, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r6.R0(r0)
            if (r0 != r1) goto L68
            return r1
        L68:
            r1 = r7
            r7 = r0
            r0 = r6
            r6 = r1
        L6c:
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            defpackage.zq3.g(r6, r5)
            r6.append(r4)
            defpackage.zq3.g(r6, r5)
            java.lang.String r6 = r0.P0()
            r1.append(r6)
            defpackage.zq3.g(r1, r5)
            r1.append(r4)
            defpackage.zq3.g(r1, r5)
            java.lang.String r6 = r0.Q0()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r7 = "toString(...)"
            defpackage.zq3.g(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference.T0(by0):java.lang.Object");
    }

    public final Subauth N0() {
        Subauth subauth = this.subauth;
        if (subauth != null) {
            return subauth;
        }
        zq3.z("subauth");
        return null;
    }

    public final c78 O0() {
        c78 c78Var = this.subauthEntitlementClient;
        if (c78Var != null) {
            return c78Var;
        }
        zq3.z("subauthEntitlementClient");
        return null;
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        View W = hVar.W(R.id.summary);
        TextView textView = W instanceof TextView ? (TextView) W : null;
        if (textView == null) {
            return;
        }
        textView.setMaxLines(100);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubauthShowNewsUserStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        zq3.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubauthShowNewsUserStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        zq3.h(context, "context");
    }

    public /* synthetic */ SubauthShowNewsUserStatePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? ic6.preferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubauthShowNewsUserStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        w68 a;
        zq3.h(context, "context");
        Activity a2 = p16.a(this, context);
        jk jkVar = a2 instanceof jk ? (jk) a2 : null;
        if (jkVar != null && (a = x68.a(jkVar)) != null) {
            a.G(this);
        }
        u0(context.getString(ck6.com_nytimes_android_phoenix_beta_subauth_user_state));
        F0("Subauth User State");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
    }
}
