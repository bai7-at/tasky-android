package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class sd8 implements hb6 {
    public static final b Companion = new b(null);
    private final String a;
    private final int b;

    public static final class a {
        private final String a;
        private final yr b;

        public a(String str, yr yrVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = yrVar;
        }

        public final yr a() {
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
            yr yrVar = this.b;
            return hashCode + (yrVar == null ? 0 : yrVar.hashCode());
        }

        public String toString() {
            return "Asset(__typename=" + this.a + ", assetCollection=" + this.b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query SyndicatedCollection($id: String!, $first: Int!) { legacyCollection(id: $id) { id groupings { containers { __typename ... on LegacyCollectionContainer { label relations { asset { __typename ...AssetCollection } } } } } } }  fragment AssetPublished on Published { url }  fragment AssetCreativeWork on CreativeWork { headline { default } }  fragment AssetNode on Node { __typename id ...AssetPublished ...AssetCreativeWork }  fragment PromotionalPropertiesSmall on HasPromotionalProperties { promotionalImage { image { id altText crops(renditionNames: [\"square320\"]) { renditions { url } } } } }  fragment AssetCollection on LegacyCollection { id assets(first: $first) { edges { node { __typename ...AssetNode ...PromotionalPropertiesSmall } } } }";
        }

        private b() {
        }
    }

    public static final class c {
        private final String a;
        private final g b;

        public c(String str, g gVar) {
            zq3.h(str, "__typename");
            zq3.h(gVar, "onLegacyCollectionContainer");
            this.a = str;
            this.b = gVar;
        }

        public final g a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Container(__typename=" + this.a + ", onLegacyCollectionContainer=" + this.b + ")";
        }
    }

    public static final class d implements ii5.a {
        private final f a;

        public d(f fVar) {
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            return "Data(legacyCollection=" + this.a + ")";
        }
    }

    public static final class e {
        private final List a;

        public e(List list) {
            zq3.h(list, "containers");
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Grouping(containers=" + this.a + ")";
        }
    }

    public static final class f {
        private final String a;
        private final List b;

        public f(String str, List list) {
            zq3.h(str, "id");
            zq3.h(list, "groupings");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "LegacyCollection(id=" + this.a + ", groupings=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final List b;

        public g(String str, List list) {
            zq3.h(str, "label");
            zq3.h(list, "relations");
            this.a = str;
            this.b = list;
        }

        public final String a() {
            return this.a;
        }

        public final List b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "OnLegacyCollectionContainer(label=" + this.a + ", relations=" + this.b + ")";
        }
    }

    public static final class h {
        private final a a;

        public h(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.a, ((h) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Relation(asset=" + this.a + ")";
        }
    }

    public sd8(String str, int i) {
        zq3.h(str, "id");
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(vd8.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        ae8.a.a(lu3Var, this, w41Var, z);
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd8)) {
            return false;
        }
        sd8 sd8Var = (sd8) obj;
        return zq3.c(this.a, sd8Var.a) && this.b == sd8Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    @Override // defpackage.ii5
    public String id() {
        return "643be4c5dfbfd64d4fb0971e87f77d5247620f8659b295c89b8b3149385deab5";
    }

    @Override // defpackage.ii5
    public String name() {
        return "SyndicatedCollection";
    }

    public String toString() {
        return "SyndicatedCollectionQuery(id=" + this.a + ", first=" + this.b + ")";
    }
}
