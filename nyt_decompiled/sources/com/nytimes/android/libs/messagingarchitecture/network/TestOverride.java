package com.nytimes.android.libs.messagingarchitecture.network;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
final class TestOverride {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return TestOverride$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestOverride(int i, String str, String str2, String str3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, TestOverride$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final /* synthetic */ void a(TestOverride testOverride, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, testOverride.a);
        dVar.y(serialDescriptor, 1, testOverride.b);
        dVar.y(serialDescriptor, 2, testOverride.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestOverride)) {
            return false;
        }
        TestOverride testOverride = (TestOverride) obj;
        return zq3.c(this.a, testOverride.a) && zq3.c(this.b, testOverride.b) && zq3.c(this.c, testOverride.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TestOverride(integration=" + this.a + ", test=" + this.b + ", variant=" + this.c + ")";
    }

    public TestOverride(String str, String str2, String str3) {
        zq3.h(str, ParamProviderKt.PARAM_INTEGRATION);
        zq3.h(str2, "test");
        zq3.h(str3, "variant");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
