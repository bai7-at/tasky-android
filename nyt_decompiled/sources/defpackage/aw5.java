package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;
import type.PodcastService;

/* loaded from: classes3.dex */
public final class aw5 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query PodcastList { __typename podcastList { __typename lastModified highlights { __typename ... on Podcast { id uri headlineDefault: headline { __typename headline: default } summary promotionalMedia { __typename ...promotionalImages } subscriptionUrls { __typename url podcastService } } } } }  fragment promotionalImages on PromotionalPropertiesMedia { __typename ... on Image { crops(renditionNames: [\"smallSquare252\",\"videoFifteenBySeven2610\",\"largeHorizontalJumbo\"]) { __typename name renditions { __typename name height width url } } } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final String a;
        private final f b;

        public b(String str, f fVar) {
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            f fVar = this.b;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", podcastList=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;

        public c(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "headline");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
            return "HeadlineDefault(__typename=" + this.a + ", headline=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final e b;

        public d(String str, e eVar) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e eVar = this.b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "Highlight(__typename=" + this.a + ", onPodcast=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final String b;
        private final c c;
        private final String d;
        private final g e;
        private final List f;

        public e(String str, String str2, c cVar, String str3, g gVar, List list) {
            zq3.h(str, "id");
            zq3.h(str2, "uri");
            zq3.h(str3, "summary");
            zq3.h(list, "subscriptionUrls");
            this.a = str;
            this.b = str2;
            this.c = cVar;
            this.d = str3;
            this.e = gVar;
            this.f = list;
        }

        public final c a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final g c() {
            return this.e;
        }

        public final List d() {
            return this.f;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d) && zq3.c(this.e, eVar.e) && zq3.c(this.f, eVar.f);
        }

        public final String f() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            c cVar = this.c;
            int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.d.hashCode()) * 31;
            g gVar = this.e;
            return ((hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "OnPodcast(id=" + this.a + ", uri=" + this.b + ", headlineDefault=" + this.c + ", summary=" + this.d + ", promotionalMedia=" + this.e + ", subscriptionUrls=" + this.f + ")";
        }
    }

    public static final class f {
        private final String a;
        private final Instant b;
        private final List c;

        public f(String str, Instant instant, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "highlights");
            this.a = str;
            this.b = instant;
            this.c = list;
        }

        public final List a() {
            return this.c;
        }

        public final Instant b() {
            return this.b;
        }

        public final String c() {
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
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Instant instant = this.b;
            return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "PodcastList(__typename=" + this.a + ", lastModified=" + this.b + ", highlights=" + this.c + ")";
        }
    }

    public static final class g {
        private final String a;
        private final m56 b;

        public g(String str, m56 m56Var) {
            zq3.h(str, "__typename");
            zq3.h(m56Var, "promotionalImages");
            this.a = str;
            this.b = m56Var;
        }

        public final m56 a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", promotionalImages=" + this.b + ")";
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

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(bw5.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == aw5.class;
    }

    public int hashCode() {
        return zt6.b(aw5.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "3b8b4070bc4fd85127625d258d34db5d612bc72429f33463e857625ad1a39d3c";
    }

    @Override // defpackage.ii5
    public String name() {
        return "PodcastList";
    }
}
