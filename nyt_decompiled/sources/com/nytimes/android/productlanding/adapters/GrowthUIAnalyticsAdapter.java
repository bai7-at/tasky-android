package com.nytimes.android.productlanding.adapters;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.e52;
import defpackage.k43;
import defpackage.s42;
import defpackage.u32;
import defpackage.y32;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GrowthUIAnalyticsAdapter implements k43 {
    public static final a Companion = new a(null);
    public static final int b = ET2SimpleScope.b;
    private final ET2SimpleScope a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public GrowthUIAnalyticsAdapter(ET2SimpleScope eT2SimpleScope) {
        zq3.h(eT2SimpleScope, "et2Scope");
        this.a = eT2SimpleScope;
    }

    private final void e(e52 e52Var, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ET2PageScope.DefaultImpls.a(this.a, e52Var, new s42(str, str2, null, null, null, null, null, new y32(str4, null, null, str3, null, null, 54, null), str6, 124, null), new u32(null, str7, str5, 1, null), null, 8, null);
    }

    static /* synthetic */ void f(GrowthUIAnalyticsAdapter growthUIAnalyticsAdapter, e52 e52Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        growthUIAnalyticsAdapter.e(e52Var, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }

    @Override // defpackage.k43
    public void a(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        zq3.h(str, TransferTable.COLUMN_TYPE);
        zq3.h(str2, "section");
        lifecycleCoroutineScope.b(new GrowthUIAnalyticsAdapter$initAnalytics$1(this, str, str2, null));
    }

    @Override // defpackage.k43
    public void b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        zq3.h(str, "eventName");
        e(new e52.e(), str, str2, str4, str5, str6, str3, str7);
    }

    @Override // defpackage.k43
    public void c(String str, String str2, String str3, String str4) {
        zq3.h(str, "eventName");
        f(this, new e52.d(), str, str2, null, null, null, str3, str4, 56, null);
    }
}
