package com.nytimes.android.ribbon.destinations.cooking;

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
public final class RecipeCardData {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;
    private final Rating d;
    private final String e;
    private final String f;
    private final String g;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return RecipeCardData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RecipeCardData(int i, String str, String str2, String str3, Rating rating, String str4, String str5, String str6, mk7 mk7Var) {
        if (127 != (i & 127)) {
            wv5.a(i, 127, RecipeCardData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rating;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public static final /* synthetic */ void h(RecipeCardData recipeCardData, d dVar, SerialDescriptor serialDescriptor) {
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, recipeCardData.a);
        dVar.l(serialDescriptor, 1, l48Var, recipeCardData.b);
        dVar.l(serialDescriptor, 2, l48Var, recipeCardData.c);
        dVar.l(serialDescriptor, 3, Rating$$serializer.INSTANCE, recipeCardData.d);
        dVar.l(serialDescriptor, 4, l48Var, recipeCardData.e);
        dVar.l(serialDescriptor, 5, l48Var, recipeCardData.f);
        dVar.l(serialDescriptor, 6, l48Var, recipeCardData.g);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.a;
    }

    public final Rating e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeCardData)) {
            return false;
        }
        RecipeCardData recipeCardData = (RecipeCardData) obj;
        return zq3.c(this.a, recipeCardData.a) && zq3.c(this.b, recipeCardData.b) && zq3.c(this.c, recipeCardData.c) && zq3.c(this.d, recipeCardData.d) && zq3.c(this.e, recipeCardData.e) && zq3.c(this.f, recipeCardData.f) && zq3.c(this.g, recipeCardData.g);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Rating rating = this.d;
        int hashCode4 = (hashCode3 + (rating == null ? 0 : rating.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "RecipeCardData(imageUrl=" + this.a + ", title=" + this.b + ", byline=" + this.c + ", rating=" + this.d + ", contentUrl=" + this.e + ", cookingTime=" + this.f + ", uri=" + this.g + ")";
    }

    public RecipeCardData(String str, String str2, String str3, Rating rating, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rating;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
