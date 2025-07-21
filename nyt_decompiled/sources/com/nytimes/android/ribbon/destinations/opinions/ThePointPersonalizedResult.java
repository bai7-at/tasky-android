package com.nytimes.android.ribbon.destinations.opinions;

import defpackage.i54;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class ThePointPersonalizedResult {
    public static final Companion Companion = new Companion(null);
    public static final int d = 8;
    private static final KSerializer[] e;
    private final ThePointArticleData a;
    private final ThePointAuthorData b;
    private final Map c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ThePointPersonalizedResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        l48 l48Var = l48.a;
        e = new KSerializer[]{null, null, new i54(l48Var, l48Var)};
    }

    public /* synthetic */ ThePointPersonalizedResult(int i, ThePointArticleData thePointArticleData, ThePointAuthorData thePointAuthorData, Map map, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, ThePointPersonalizedResult$$serializer.INSTANCE.getDescriptor());
        }
        this.a = thePointArticleData;
        this.b = thePointAuthorData;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static final /* synthetic */ void b(ThePointPersonalizedResult thePointPersonalizedResult, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.z(serialDescriptor, 0, ThePointArticleData$$serializer.INSTANCE, thePointPersonalizedResult.a);
        dVar.l(serialDescriptor, 1, ThePointAuthorData$$serializer.INSTANCE, thePointPersonalizedResult.b);
        if (!dVar.A(serialDescriptor, 2) && thePointPersonalizedResult.c == null) {
            return;
        }
        dVar.l(serialDescriptor, 2, kSerializerArr[2], thePointPersonalizedResult.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThePointPersonalizedResult)) {
            return false;
        }
        ThePointPersonalizedResult thePointPersonalizedResult = (ThePointPersonalizedResult) obj;
        return zq3.c(this.a, thePointPersonalizedResult.a) && zq3.c(this.b, thePointPersonalizedResult.b) && zq3.c(this.c, thePointPersonalizedResult.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ThePointAuthorData thePointAuthorData = this.b;
        int hashCode2 = (hashCode + (thePointAuthorData == null ? 0 : thePointAuthorData.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ThePointPersonalizedResult(articleData=" + this.a + ", authorData=" + this.b + ", trackingParams=" + this.c + ")";
    }

    public ThePointPersonalizedResult(ThePointArticleData thePointArticleData, ThePointAuthorData thePointAuthorData, Map map) {
        zq3.h(thePointArticleData, "articleData");
        this.a = thePointArticleData;
        this.b = thePointAuthorData;
        this.c = map;
    }

    public /* synthetic */ ThePointPersonalizedResult(ThePointArticleData thePointArticleData, ThePointAuthorData thePointAuthorData, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(thePointArticleData, thePointAuthorData, (i & 4) != 0 ? null : map);
    }
}
