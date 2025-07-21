package com.nytimes.android.share;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.comscore.streaming.ContentType;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.logging.NYTLogger;
import defpackage.du8;
import defpackage.e52;
import defpackage.qs2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ue4;
import defpackage.y32;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ShareAnalyticsReporter {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final ET2Scope a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ShareAnalyticsReporter(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    private final String a(Context context, ComponentName componentName) {
        String str;
        try {
            PackageManager packageManager = context.getPackageManager();
            zq3.e(componentName);
            str = packageManager.getApplicationLabel(packageManager.getApplicationInfo(componentName.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            NYTLogger.g("Unable to find app name", new Object[0]);
            str = null;
        }
        return str == null ? DatasetUtils.UNKNOWN_IDENTITY_ID : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "share-tools";
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(str4, str, str2, bool, str3, objArr, str5, new y32(null, str, str2, "share-igstory", str3, null, 55, null), str6, 382, null), new u32(null, null, "complete", 3, null), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "share-tools";
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(str4, str, str2, bool, str3, objArr, str5, new y32(null, str, str2, "custom-sheet", str3, null, 55, null), str6, 382, null), new u32(null, null, "open", 3, null), null, 8, null);
    }

    public final void d() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("share-tools", null, "screenshot-menu", null, null, null, null, null, null, 506, null), new u32(null, null, "open", 3, null), null, 8, null);
    }

    public final void e() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("share-tools", null, null, null, null, null, null, null, "share-menu", 254, null), new u32(null, null, "open", 3, null), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        String str = null;
        String str2 = null;
        String str3 = "share-tools";
        String str4 = "custom-sheet";
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(str3, str, str4, bool, str2, objArr, str5, new y32(null, str, null, "share-url", str2, null, 55, null), str6, 378, null), new u32(null, null, "complete", 3, null), null, 8, null);
    }

    public final void g() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("share-tools", null, "native-sheet", null, null, null, null, null, null, 506, null), new u32(null, null, "open", 3, null), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Context context, ComponentName componentName, String str, final String str2, final String str3, String str4) {
        zq3.h(context, "context");
        String a2 = a(context, componentName);
        String str5 = null;
        String str6 = null;
        String str7 = "share-tools";
        String str8 = null;
        Boolean bool = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        this.a.a(new e52.e(), new s42(str7, str8, str4, bool, str9, str10, str11, new y32(null, str5, str6, a2, null, null, 55, null), str, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(str5, str6, "complete", 3, 0 == true ? 1 : 0), new qs2() { // from class: com.nytimes.android.share.ShareAnalyticsReporter$reportShareEventFromBroadcast$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                return new ue4(du8.a("item", new y32(null, str3, str2, null, null, null, 57, null)));
            }
        });
    }
}
