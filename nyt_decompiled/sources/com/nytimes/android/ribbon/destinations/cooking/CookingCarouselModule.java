package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class CookingCarouselModule {
    public static final Companion Companion = new Companion(null);
    public static final int d = 8;
    private static final KSerializer[] e = {null, new qo(RecipeCardData$$serializer.INSTANCE), null};
    private final String a;
    private final List b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CookingCarouselModule$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CookingCarouselModule(int i, String str, List list, String str2, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, CookingCarouselModule$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public static final /* synthetic */ void e(CookingCarouselModule cookingCarouselModule, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.y(serialDescriptor, 0, cookingCarouselModule.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], cookingCarouselModule.b);
        dVar.y(serialDescriptor, 2, cookingCarouselModule.c);
    }

    public final String b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookingCarouselModule)) {
            return false;
        }
        CookingCarouselModule cookingCarouselModule = (CookingCarouselModule) obj;
        return zq3.c(this.a, cookingCarouselModule.a) && zq3.c(this.b, cookingCarouselModule.b) && zq3.c(this.c, cookingCarouselModule.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CookingCarouselModule(moduleName=" + this.a + ", recipes=" + this.b + ", url=" + this.c + ")";
    }

    public CookingCarouselModule(String str, List list, String str2) {
        zq3.h(str, "moduleName");
        zq3.h(list, "recipes");
        zq3.h(str2, "url");
        this.a = str;
        this.b = list;
        this.c = str2;
    }
}
