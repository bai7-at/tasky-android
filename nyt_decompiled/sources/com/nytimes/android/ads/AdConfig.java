package com.nytimes.android.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.ads.models.CoreAdKeys;
import defpackage.by0;
import defpackage.dc9;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.l7;
import defpackage.s7;
import defpackage.ww8;
import defpackage.xc8;
import defpackage.y5;
import defpackage.z38;
import defpackage.zq3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes2.dex */
public final class AdConfig {
    public static final a Companion = new a(null);
    private final boolean a;
    private final Map b;
    private final l7 c;
    private final String d;
    private dc9 e;
    private String f;
    private final String g;
    private s7[] h;

    public static final class Builder {
        public static final a Companion = new a(null);
        private final SharedPreferences a;
        private final com.nytimes.android.ads.a b;
        private final CoroutineScope c;
        private final HashMap d;
        private l7 e;
        private final String f;

        @fc1(c = "com.nytimes.android.ads.AdConfig$Builder$3", f = "AdConfig.kt", l = {200}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.ads.AdConfig$Builder$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements gt2 {
            Object L$0;
            int label;

            AnonymousClass3(by0 by0Var) {
                super(2, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return Builder.this.new AnonymousClass3(by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Builder builder;
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    Builder builder2 = Builder.this;
                    com.nytimes.android.ads.a aVar = builder2.b;
                    this.L$0 = builder2;
                    this.label = 1;
                    Object c = aVar.c(this);
                    if (c == h) {
                        return h;
                    }
                    obj = c;
                    builder = builder2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    builder = (Builder) this.L$0;
                    f.b(obj);
                }
                builder.d((l7) obj);
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                z38 z38Var = z38.a;
                String format = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Random.a.d(1.0d, 2.0d) * Math.pow(10.0d, 15))}, 1));
                zq3.g(format, "format(...)");
                return format;
            }

            private a() {
            }
        }

        public Builder(SharedPreferences sharedPreferences, com.nytimes.android.ads.a aVar, CoroutineDispatcher coroutineDispatcher) {
            zq3.h(sharedPreferences, "privacyPreferences");
            zq3.h(aVar, "adClient");
            zq3.h(coroutineDispatcher, "dispatcher");
            this.a = sharedPreferences;
            this.b = aVar;
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
            this.c = CoroutineScope;
            HashMap hashMap = new HashMap();
            this.d = hashMap;
            this.e = l7.a.b;
            this.f = aVar.e();
            hashMap.put(CoreAdKeys.PROPERTY.getKey(), aVar.g());
            hashMap.put(CoreAdKeys.PLATFORM.getKey(), aVar.i() ? "tablet" : "phone");
            String f = aVar.f();
            if (f != null) {
                hashMap.put(CoreAdKeys.SUBSCRIBER.getKey(), f);
            }
            hashMap.put(CoreAdKeys.APP_VERSION.getKey(), aVar.getAppVersion());
            hashMap.put(CoreAdKeys.SHARE_OF_VOICE.getKey(), String.valueOf(Random.a.f(4) + 1));
            String b = aVar.b();
            if (b != null) {
                hashMap.put(CoreAdKeys.AD_KEYWORD.getKey(), b);
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass3(null), 3, null);
        }

        private final void e(l7 l7Var) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.remove("gad_has_consent_for_cookies");
            edit.remove("gad_rdp");
            if (l7Var instanceof l7.b) {
                edit.putInt("gad_has_consent_for_cookies", 0);
            } else if (l7Var instanceof l7.d) {
                edit.putInt("gad_rdp", 1);
            }
            edit.apply();
        }

        public final AdConfig b() {
            if (this.f.length() == 0) {
                throw new IllegalStateException("Ad unit path was not properly set. Please make sure to set the ad unit path.");
            }
            CharSequence charSequence = (CharSequence) this.d.get(CoreAdKeys.PLATFORM.getKey());
            if (charSequence == null || charSequence.length() == 0) {
                throw new IllegalStateException("The required kvps were not initialized properly. Please make sure to invoke setIsTablet() to properly initialize.");
            }
            HashMap hashMap = this.d;
            CoreAdKeys coreAdKeys = CoreAdKeys.SUBSCRIBER;
            CharSequence charSequence2 = (CharSequence) hashMap.get(coreAdKeys.getKey());
            if (charSequence2 == null || charSequence2.length() == 0) {
                this.d.put(coreAdKeys.getKey(), "anon");
            }
            HashMap hashMap2 = this.d;
            CoreAdKeys coreAdKeys2 = CoreAdKeys.PROPERTY;
            CharSequence charSequence3 = (CharSequence) hashMap2.get(coreAdKeys2.getKey());
            if (charSequence3 == null || charSequence3.length() == 0) {
                this.d.put(coreAdKeys2.getKey(), "android");
            }
            this.d.put(CoreAdKeys.USER_ACCESS_POINT.getKey(), "android");
            this.d.put(CoreAdKeys.CORRELATOR.getKey(), Companion.a());
            return new AdConfig(this.b.j(), this.d, this.e, this.f);
        }

        public final Builder c(String str) {
            zq3.h(str, "adKeyword");
            String g = y5.g(str);
            if (g != null) {
                this.d.put(CoreAdKeys.AD_KEYWORD.getKey(), g);
            }
            return this;
        }

        public final Builder d(l7 l7Var) {
            zq3.h(l7Var, "adPrivacy");
            this.e = l7Var;
            e(l7Var);
            return this;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AdConfig(boolean z, Map map, l7 l7Var, String str) {
        zq3.h(map, "adRequirements");
        zq3.h(l7Var, "adPrivacy");
        zq3.h(str, "baseAdUnitPath");
        this.a = z;
        this.b = map;
        this.c = l7Var;
        this.d = str;
        this.e = new dc9(0, 0);
        this.f = str;
        this.g = l7Var.a();
    }

    public static /* synthetic */ Bundle e(AdConfig adConfig, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = new Bundle();
        }
        return adConfig.d(bundle);
    }

    public final void a(String str) {
        zq3.h(str, "path");
        if (!h.K(str, this.d, false, 2, null)) {
            if (h.K(str, "/", false, 2, null)) {
                str = this.d + str;
            } else {
                str = this.d + "/" + str;
            }
        }
        this.f = str;
    }

    public final void b(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        this.b.put(str, str2);
    }

    public final void c(Map map) {
        zq3.h(map, "additionalTargeting");
        this.b.putAll(y5.e(map));
    }

    public final Bundle d(Bundle bundle) {
        zq3.h(bundle, "networkBundle");
        for (String str : this.b.keySet()) {
            String str2 = (String) this.b.get(str);
            if (str2 != null && str2.length() != 0) {
                bundle.putString(str, str2);
            }
        }
        if (this.c instanceof l7.c) {
            bundle.putInt("npa", 1);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdConfig)) {
            return false;
        }
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!zq3.c(str, CoreAdKeys.SHARE_OF_VOICE.getKey()) && !zq3.c(str, CoreAdKeys.CORRELATOR.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        AdConfig adConfig = (AdConfig) obj;
        Map map2 = adConfig.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            String str2 = (String) entry2.getKey();
            if (!zq3.c(str2, CoreAdKeys.SHARE_OF_VOICE.getKey()) && !zq3.c(str2, CoreAdKeys.CORRELATOR.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return zq3.c(this.f, adConfig.f) && zq3.c(linkedHashMap, linkedHashMap2) && zq3.c(this.c, adConfig.c);
    }

    public final Map f() {
        return y5.a(this.b);
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return k(CommonAdKeys.CONTENT_URL.getKey());
    }

    public int hashCode() {
        int hashCode = this.f.hashCode();
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!zq3.c((String) entry.getKey(), CoreAdKeys.SHARE_OF_VOICE.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashCode + linkedHashMap.hashCode() + this.c.hashCode();
    }

    public final s7[] i() {
        return this.h;
    }

    public final Map j() {
        return y5.d(this.b);
    }

    public final String k(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return (String) this.b.get(str);
    }

    public final String l() {
        return this.g;
    }

    public final boolean m() {
        return y5.c(this.b);
    }

    public final boolean n() {
        return this.a;
    }

    public final void o(String str) {
        zq3.h(str, "url");
        this.b.put(CommonAdKeys.CONTENT_URL.getKey(), str);
    }

    public final void p(xc8... xc8VarArr) {
        zq3.h(xc8VarArr, "adSizes");
        int length = xc8VarArr.length;
        s7[] s7VarArr = new s7[length];
        for (int i = 0; i < length; i++) {
            s7VarArr[i] = xc8VarArr[i].a();
        }
        this.h = s7VarArr;
    }

    public final void q(int i) {
        r(i, 0);
    }

    public final void r(int i, int i2) {
        this.b.put(CoreAdKeys.VIEWPORT_SIZE.getKey(), y5.b(i));
        this.e = new dc9(i, i2);
    }
}
