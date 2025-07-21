package defpackage;

import java.util.List;
import org.threeten.bp.Instant;
import type.PodcastService;

/* loaded from: classes3.dex */
public final class s56 implements rp2 {
    private final String a;
    private final d b;
    private final g c;
    private final f d;
    private final b e;
    private final c f;

    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "HeadlineInfo(__typename=" + this.a + ", headline=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;
        private final int c;
        private final String d;
        private final Instant e;
        private final a f;
        private final h g;

        public b(String str, String str2, int i, String str3, Instant instant, a aVar, h hVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "assetID");
            zq3.h(str3, "fileUrl");
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = instant;
            this.f = aVar;
            this.g = hVar;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final Instant d() {
            return this.e;
        }

        public final a e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && this.c == bVar.c && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e) && zq3.c(this.f, bVar.f) && zq3.c(this.g, bVar.g);
        }

        public final h f() {
            return this.g;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31;
            Instant instant = this.e;
            int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            a aVar = this.f;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            h hVar = this.g;
            return hashCode3 + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "OnAudio(__typename=" + this.a + ", assetID=" + this.b + ", duration=" + this.c + ", fileUrl=" + this.d + ", fingerprint=" + this.e + ", headlineInfo=" + this.f + ", podcastCollection=" + this.g + ")";
        }
    }

    public static final class c {
        private final k a;

        public c(k kVar) {
            this.a = kVar;
        }

        public final k a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            k kVar = this.a;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public String toString() {
            return "OnEmbeddedInteractive(promotionalMedia=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final e31 b;

        public d(String str, e31 e31Var) {
            zq3.h(str, "__typename");
            zq3.h(e31Var, "cropOrPosterFields");
            this.a = str;
            this.b = e31Var;
        }

        public final e31 a() {
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
            return "OnImage(__typename=" + this.a + ", cropOrPosterFields=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final List b;

        public e(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "subscriptionUrls");
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "OnPodcast(__typename=" + this.a + ", subscriptionUrls=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final String b;
        private final List c;
        private final i d;

        public f(String str, String str2, List list, i iVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "assetID");
            zq3.h(list, "slides");
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = iVar;
        }

        public final String a() {
            return this.b;
        }

        public final i b() {
            return this.d;
        }

        public final List c() {
            return this.c;
        }

        public final String d() {
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
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c) && zq3.c(this.d, fVar.d);
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            i iVar = this.d;
            return hashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "OnSlideshow(__typename=" + this.a + ", assetID=" + this.b + ", slides=" + this.c + ", promotionalMedia=" + this.d + ")";
        }
    }

    public static final class g {
        private final String a;
        private final String b;
        private final Instant c;
        private final l d;

        public g(String str, String str2, Instant instant, l lVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "assetID");
            this.a = str;
            this.b = str2;
            this.c = instant;
            this.d = lVar;
        }

        public final String a() {
            return this.b;
        }

        public final Instant b() {
            return this.c;
        }

        public final l c() {
            return this.d;
        }

        public final String d() {
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
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            Instant instant = this.c;
            int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            l lVar = this.d;
            return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
        }

        public String toString() {
            return "OnVideo(__typename=" + this.a + ", assetID=" + this.b + ", lastUpdatedDate=" + this.c + ", promotionalMedia=" + this.d + ")";
        }
    }

    public static final class h {
        private final String a;
        private final j b;
        private final e c;

        public h(String str, j jVar, e eVar) {
            zq3.h(str, "__typename");
            zq3.h(eVar, "onPodcast");
            this.a = str;
            this.b = jVar;
            this.c = eVar;
        }

        public final e a() {
            return this.c;
        }

        public final j b() {
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
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && zq3.c(this.c, hVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            j jVar = this.b;
            return ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "PodcastCollection(__typename=" + this.a + ", promotionalMedia=" + this.b + ", onPodcast=" + this.c + ")";
        }
    }

    public static final class i {
        private final String a;
        private final e31 b;

        public i(String str, e31 e31Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = e31Var;
        }

        public final e31 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e31 e31Var = this.b;
            return hashCode + (e31Var == null ? 0 : e31Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia1(__typename=" + this.a + ", cropOrPosterFields=" + this.b + ")";
        }
    }

    public static final class j {
        private final String a;
        private final xy b;

        public j(String str, xy xyVar) {
            zq3.h(str, "__typename");
            zq3.h(xyVar, "audioPromotionalMediaFields");
            this.a = str;
            this.b = xyVar;
        }

        public final xy a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PromotionalMedia2(__typename=" + this.a + ", audioPromotionalMediaFields=" + this.b + ")";
        }
    }

    public static final class k {
        private final String a;
        private final e31 b;

        public k(String str, e31 e31Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = e31Var;
        }

        public final e31 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return zq3.c(this.a, kVar.a) && zq3.c(this.b, kVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e31 e31Var = this.b;
            return hashCode + (e31Var == null ? 0 : e31Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia3(__typename=" + this.a + ", cropOrPosterFields=" + this.b + ")";
        }
    }

    public static final class l {
        private final String a;
        private final e31 b;

        public l(String str, e31 e31Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = e31Var;
        }

        public final e31 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e31 e31Var = this.b;
            return hashCode + (e31Var == null ? 0 : e31Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", cropOrPosterFields=" + this.b + ")";
        }
    }

    public static final class m {
        private final String a;
        private final String b;

        public m(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "slug");
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
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return zq3.c(this.a, mVar.a) && zq3.c(this.b, mVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Slide(__typename=" + this.a + ", slug=" + this.b + ")";
        }
    }

    public static final class n {
        private final String a;
        private final String b;
        private final PodcastService c;

        public n(String str, String str2, PodcastService podcastService) {
            zq3.h(str, "__typename");
            zq3.h(str2, "url");
            zq3.h(podcastService, "platform");
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
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return zq3.c(this.a, nVar.a) && zq3.c(this.b, nVar.b) && this.c == nVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "SubscriptionUrl(__typename=" + this.a + ", url=" + this.b + ", platform=" + this.c + ")";
        }
    }

    public s56(String str, d dVar, g gVar, f fVar, b bVar, c cVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = dVar;
        this.c = gVar;
        this.d = fVar;
        this.e = bVar;
        this.f = cVar;
    }

    public final b a() {
        return this.e;
    }

    public final c b() {
        return this.f;
    }

    public final d c() {
        return this.b;
    }

    public final f d() {
        return this.d;
    }

    public final g e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s56)) {
            return false;
        }
        s56 s56Var = (s56) obj;
        return zq3.c(this.a, s56Var.a) && zq3.c(this.b, s56Var.b) && zq3.c(this.c, s56Var.c) && zq3.c(this.d, s56Var.d) && zq3.c(this.e, s56Var.e) && zq3.c(this.f, s56Var.f);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g gVar = this.c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        f fVar = this.d;
        int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        b bVar = this.e;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f;
        return hashCode5 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "PromotionalMediaFields(__typename=" + this.a + ", onImage=" + this.b + ", onVideo=" + this.c + ", onSlideshow=" + this.d + ", onAudio=" + this.e + ", onEmbeddedInteractive=" + this.f + ")";
    }
}
