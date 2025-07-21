package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class fh7 implements hb6 {
    public static final a Companion = new a(null);
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query SectionFrontVideoPlaylist($id: String!, $count: Int!, $prop: String!, $edn: String!, $plat: String!, $ver: String!) { playlist(id: $id) { uri videos(first: $count) { edges { node { __typename ...VideoAsset } } } } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Data(playlist=" + this.a + ")";
        }
    }

    public static final class c {
        private final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Edge(node=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final n59 b;

        public d(String str, n59 n59Var) {
            zq3.h(str, "__typename");
            zq3.h(n59Var, "videoAsset");
            this.a = str;
            this.b = n59Var;
        }

        public final n59 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", videoAsset=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final f b;

        public e(String str, f fVar) {
            zq3.h(str, "uri");
            this.a = str;
            this.b = fVar;
        }

        public final String a() {
            return this.a;
        }

        public final f b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            f fVar = this.b;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Playlist(uri=" + this.a + ", videos=" + this.b + ")";
        }
    }

    public static final class f {
        private final List a;

        public f(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.a, ((f) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Videos(edges=" + this.a + ")";
        }
    }

    public fh7(String str, int i, String str2, String str3, String str4, String str5) {
        zq3.h(str, "id");
        zq3.h(str2, "prop");
        zq3.h(str3, "edn");
        zq3.h(str4, "plat");
        zq3.h(str5, "ver");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(gh7.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        lh7.a.a(lu3Var, this, w41Var, z);
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh7)) {
            return false;
        }
        fh7 fh7Var = (fh7) obj;
        return zq3.c(this.a, fh7Var.a) && this.b == fh7Var.b && zq3.c(this.c, fh7Var.c) && zq3.c(this.d, fh7Var.d) && zq3.c(this.e, fh7Var.e) && zq3.c(this.f, fh7Var.f);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String i() {
        return this.f;
    }

    @Override // defpackage.ii5
    public String id() {
        return "e2b5a4bbe3d887e6b09cb6073f7a861065561c0f6815279bc96c891a281c2fc7";
    }

    @Override // defpackage.ii5
    public String name() {
        return "SectionFrontVideoPlaylist";
    }

    public String toString() {
        return "SectionFrontVideoPlaylistQuery(id=" + this.a + ", count=" + this.b + ", prop=" + this.c + ", edn=" + this.d + ", plat=" + this.e + ", ver=" + this.f + ")";
    }
}
