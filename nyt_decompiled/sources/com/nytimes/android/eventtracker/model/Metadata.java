package com.nytimes.android.eventtracker.model;

import android.content.Context;
import defpackage.bt3;
import defpackage.et3;
import defpackage.tc6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Metadata {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Viewport i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a(Context context) {
            return context.getResources().getBoolean(tc6.is_tablet) ? "tablet" : "mobile";
        }

        private final String c(Context context) {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode());
        }

        private final String d(Context context) {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "1.0.0" : str;
        }

        public final Metadata b(Context context) {
            zq3.h(context, "context");
            String packageName = context.getPackageName();
            zq3.g(packageName, "getPackageName(...)");
            return new Metadata(packageName, d(context), c(context), null, null, null, null, a(context), Viewport.Companion.a(context), 120, null);
        }

        private a() {
        }
    }

    public Metadata(@bt3(name = "app_name") String str, @bt3(name = "version") String str2, @bt3(name = "build_number") String str3, @bt3(name = "os") String str4, @bt3(name = "os_version") String str5, @bt3(name = "device_model") String str6, @bt3(name = "device_name") String str7, @bt3(name = "device") String str8, Viewport viewport) {
        zq3.h(str, "appName");
        zq3.h(str2, "versionName");
        zq3.h(str3, "versionCode");
        zq3.h(str4, "osName");
        zq3.h(str5, "osCode");
        zq3.h(str6, "deviceModel");
        zq3.h(str7, "deviceName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = viewport;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final Metadata copy(@bt3(name = "app_name") String str, @bt3(name = "version") String str2, @bt3(name = "build_number") String str3, @bt3(name = "os") String str4, @bt3(name = "os_version") String str5, @bt3(name = "device_model") String str6, @bt3(name = "device_name") String str7, @bt3(name = "device") String str8, Viewport viewport) {
        zq3.h(str, "appName");
        zq3.h(str2, "versionName");
        zq3.h(str3, "versionCode");
        zq3.h(str4, "osName");
        zq3.h(str5, "osCode");
        zq3.h(str6, "deviceModel");
        zq3.h(str7, "deviceName");
        return new Metadata(str, str2, str3, str4, str5, str6, str7, str8, viewport);
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return zq3.c(this.a, metadata.a) && zq3.c(this.b, metadata.b) && zq3.c(this.c, metadata.c) && zq3.c(this.d, metadata.d) && zq3.c(this.e, metadata.e) && zq3.c(this.f, metadata.f) && zq3.c(this.g, metadata.g) && zq3.c(this.h, metadata.h) && zq3.c(this.i, metadata.i);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Viewport viewport = this.i;
        return hashCode2 + (viewport != null ? viewport.hashCode() : 0);
    }

    public final Viewport i() {
        return this.i;
    }

    public String toString() {
        return "Metadata(appName=" + this.a + ", versionName=" + this.b + ", versionCode=" + this.c + ", osName=" + this.d + ", osCode=" + this.e + ", deviceModel=" + this.f + ", deviceName=" + this.g + ", deviceFormFactor=" + this.h + ", viewport=" + this.i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Metadata(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.nytimes.android.eventtracker.model.Viewport r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22 & 8
            if (r0 == 0) goto Ld
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "RELEASE"
            defpackage.zq3.g(r0, r1)
            r6 = r0
            goto Lf
        Ld:
            r6 = r16
        Lf:
            r0 = r22 & 16
            if (r0 == 0) goto L1b
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7 = r0
            goto L1d
        L1b:
            r7 = r17
        L1d:
            r0 = r22 & 32
            if (r0 == 0) goto L3b
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r8 = r0
            goto L3d
        L3b:
            r8 = r18
        L3d:
            r0 = r22 & 64
            if (r0 == 0) goto L4a
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            defpackage.zq3.g(r0, r1)
            r9 = r0
            goto L4c
        L4a:
            r9 = r19
        L4c:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r10 = r20
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.model.Metadata.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nytimes.android.eventtracker.model.Viewport, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
