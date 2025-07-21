package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class uy0 implements hb6 {
    public static final b Companion = new b(null);
    private final String a;

    public static final class a {
        private final String a;
        private final mz0 b;

        public a(String str, mz0 mz0Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = mz0Var;
        }

        public final mz0 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            mz0 mz0Var = this.b;
            return hashCode + (mz0Var == null ? 0 : mz0Var.hashCode());
        }

        public String toString() {
            return "AnyWork(__typename=" + this.a + ", cookingRecipe=" + this.b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query CookingHeroPromoImage($assetID: String!) { anyWork(id: $assetID) { __typename ...CookingRecipe } }  fragment CookingImage on Image { id crops(renditionNames: [\"square640\",\"square320\"]) { renditions { url width height name } } caption { text } credit }  fragment CookingVideo on Video { id promotionalImage { image { __typename id ...CookingImage } } }  fragment CookingPromotional on HasPromotionalProperties { __typename promotionalHeadline promotionalSummary promotionalMedia { __typename ...CookingVideo ...CookingImage } }  fragment CookingRecipe on Recipe { __typename ...CookingPromotional }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Data(anyWork=" + this.a + ")";
        }
    }

    public uy0(String str) {
        zq3.h(str, "assetID");
        this.a = str;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(wy0.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        xy0.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy0) && zq3.c(this.a, ((uy0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "23aafb79c3478686426f1727a430ac5b8fba4208b935526756f423deacd6a6a6";
    }

    @Override // defpackage.ii5
    public String name() {
        return "CookingHeroPromoImage";
    }

    public String toString() {
        return "CookingHeroPromoImageQuery(assetID=" + this.a + ")";
    }
}
