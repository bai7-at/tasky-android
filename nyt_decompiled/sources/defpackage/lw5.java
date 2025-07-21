package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.PodcastService;

/* loaded from: classes3.dex */
public final class lw5 implements hb6 {
    public static final a Companion = new a(null);
    private final String a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query Podcast($id: ID!) { __typename node(id: $id) { __typename ... on Podcast { id subscriptionUrls { __typename url podcastService } stream(first: 50, streamQuery: { types: [AUDIO] } ) { __typename edges { __typename node { __typename ...episode } } } } } }  fragment episodeCrop on Image { crops(renditionNames: [\"smallSquare168\"]) { __typename renditions { __typename name height width url } } }  fragment episode on Audio { id headlineDefault: headline { __typename headline: default } summary firstPublished length fileUrl podcastSeries { __typename title image { __typename ...episodeCrop } } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final String a;
        private final e b;

        public b(String str, e eVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = eVar;
        }

        public final e a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e eVar = this.b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final d b;

        public c(String str, d dVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = dVar;
        }

        public final d a() {
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
            int hashCode = this.a.hashCode() * 31;
            d dVar = this.b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final g22 b;

        public d(String str, g22 g22Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = g22Var;
        }

        public final g22 a() {
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
            int hashCode = this.a.hashCode() * 31;
            g22 g22Var = this.b;
            return hashCode + (g22Var == null ? 0 : g22Var.hashCode());
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", episode=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final f b;

        public e(String str, f fVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = fVar;
        }

        public final f a() {
            return this.b;
        }

        public final String b() {
            return this.a;
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
            return "Node(__typename=" + this.a + ", onPodcast=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final List b;
        private final g c;

        public f(String str, List list, g gVar) {
            zq3.h(str, "id");
            zq3.h(list, "subscriptionUrls");
            this.a = str;
            this.b = list;
            this.c = gVar;
        }

        public final String a() {
            return this.a;
        }

        public final g b() {
            return this.c;
        }

        public final List c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            g gVar = this.c;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "OnPodcast(id=" + this.a + ", subscriptionUrls=" + this.b + ", stream=" + this.c + ")";
        }
    }

    public static final class g {
        private final String a;
        private final List b;

        public g(String str, List list) {
            zq3.h(str, "__typename");
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Stream(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final String b;
        private final PodcastService c;

        public h(String str, String str2, PodcastService podcastService) {
            zq3.h(str, "__typename");
            zq3.h(str2, "url");
            zq3.h(podcastService, "podcastService");
            this.a = str;
            this.b = str2;
            this.c = podcastService;
        }

        public final PodcastService a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && this.c == hVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "SubscriptionUrl(__typename=" + this.a + ", url=" + this.b + ", podcastService=" + this.c + ")";
        }
    }

    public lw5(String str) {
        zq3.h(str, "id");
        this.a = str;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(mw5.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        tw5.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw5) && zq3.c(this.a, ((lw5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "abfad14f13e185d63903b855b34cddcd258386813a60d8a2b76c05cfa70d0887";
    }

    @Override // defpackage.ii5
    public String name() {
        return "Podcast";
    }

    public String toString() {
        return "PodcastQuery(id=" + this.a + ")";
    }
}
