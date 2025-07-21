package com.nytimes.android.ribbon.destinations.opinions;

import defpackage.l48;
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
public final class ThePointAuthorData {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ThePointAuthorData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ThePointAuthorData(int i, String str, String str2, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, ThePointAuthorData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void a(ThePointAuthorData thePointAuthorData, d dVar, SerialDescriptor serialDescriptor) {
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, thePointAuthorData.a);
        dVar.l(serialDescriptor, 1, l48Var, thePointAuthorData.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThePointAuthorData)) {
            return false;
        }
        ThePointAuthorData thePointAuthorData = (ThePointAuthorData) obj;
        return zq3.c(this.a, thePointAuthorData.a) && zq3.c(this.b, thePointAuthorData.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ThePointAuthorData(kicker=" + this.a + ", authorImageUrl=" + this.b + ")";
    }

    public ThePointAuthorData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
