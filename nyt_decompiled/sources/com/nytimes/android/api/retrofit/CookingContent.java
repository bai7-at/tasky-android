package com.nytimes.android.api.retrofit;

import defpackage.ez0;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes3.dex */
public final class CookingContent {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] c = {null, new qo(Post$$serializer.INSTANCE)};
    private final String a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CookingContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CookingContent(int i, String str, List list, mk7 mk7Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = i.l();
        } else {
            this.b = list;
        }
    }

    public static final /* synthetic */ void d(CookingContent cookingContent, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = c;
        if (dVar.A(serialDescriptor, 0) || !zq3.c(cookingContent.a, "")) {
            dVar.z(serialDescriptor, 0, ez0.b, cookingContent.a);
        }
        if (!dVar.A(serialDescriptor, 1) && zq3.c(cookingContent.b, i.l())) {
            return;
        }
        dVar.z(serialDescriptor, 1, kSerializerArr[1], cookingContent.b);
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookingContent)) {
            return false;
        }
        CookingContent cookingContent = (CookingContent) obj;
        return zq3.c(this.a, cookingContent.a) && zq3.c(this.b, cookingContent.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CookingContent(title=" + this.a + ", posts=" + this.b + ")";
    }
}
