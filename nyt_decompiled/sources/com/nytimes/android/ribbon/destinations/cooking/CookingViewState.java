package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.he0;
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
public final class CookingViewState {
    public static final Companion Companion = new Companion(null);
    public static final int d = 8;
    private static final KSerializer[] e = {null, null, new qo(he0.u(CookingCarouselModule$$serializer.INSTANCE))};
    private final CookingHeroData a;
    private final ProgrammedArticleData b;
    private final List c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CookingViewState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CookingViewState(int i, CookingHeroData cookingHeroData, ProgrammedArticleData programmedArticleData, List list, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, CookingViewState$$serializer.INSTANCE.getDescriptor());
        }
        this.a = cookingHeroData;
        this.b = programmedArticleData;
        this.c = list;
    }

    public static final /* synthetic */ void e(CookingViewState cookingViewState, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.z(serialDescriptor, 0, CookingHeroData$$serializer.INSTANCE, cookingViewState.a);
        dVar.l(serialDescriptor, 1, ProgrammedArticleData$$serializer.INSTANCE, cookingViewState.b);
        dVar.z(serialDescriptor, 2, kSerializerArr[2], cookingViewState.c);
    }

    public final List b() {
        return this.c;
    }

    public final CookingHeroData c() {
        return this.a;
    }

    public final ProgrammedArticleData d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookingViewState)) {
            return false;
        }
        CookingViewState cookingViewState = (CookingViewState) obj;
        return zq3.c(this.a, cookingViewState.a) && zq3.c(this.b, cookingViewState.b) && zq3.c(this.c, cookingViewState.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ProgrammedArticleData programmedArticleData = this.b;
        return ((hashCode + (programmedArticleData == null ? 0 : programmedArticleData.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CookingViewState(hero=" + this.a + ", programmedArticleData=" + this.b + ", carouselModules=" + this.c + ")";
    }

    public CookingViewState(CookingHeroData cookingHeroData, ProgrammedArticleData programmedArticleData, List list) {
        zq3.h(cookingHeroData, "hero");
        zq3.h(list, "carouselModules");
        this.a = cookingHeroData;
        this.b = programmedArticleData;
        this.c = list;
    }
}
