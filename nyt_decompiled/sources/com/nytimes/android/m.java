package com.nytimes.android;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.LegacyCollectionAsset;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public interface m {

    public static final class a implements e {
        private final c a;
        private final AudioAsset b;

        public a(c cVar, AudioAsset audioAsset) {
            zq3.h(cVar, "commonData");
            zq3.h(audioAsset, "asset");
            this.a = cVar;
            this.b = audioAsset;
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return e.a.d(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return e.a.b(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return e.a.g(this);
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

        @Override // com.nytimes.android.m
        public String f() {
            return e.a.f(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return e.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return e.a.a(this);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return e.a.c(this);
        }

        @Override // com.nytimes.android.m.e, com.nytimes.android.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AudioAsset a() {
            return this.b;
        }

        public String toString() {
            return "Audio(commonData=" + this.a + ", asset=" + this.b + ")";
        }
    }

    public static final class b implements e {
        private final c a;
        private final Asset b;

        public b(c cVar, Asset asset) {
            zq3.h(cVar, "commonData");
            zq3.h(asset, "asset");
            this.a = cVar;
            this.b = asset;
        }

        @Override // com.nytimes.android.m.e, com.nytimes.android.m
        public Asset a() {
            return this.b;
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return e.a.d(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return e.a.b(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return e.a.g(this);
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

        @Override // com.nytimes.android.m
        public String f() {
            return e.a.f(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return e.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return e.a.a(this);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return e.a.c(this);
        }

        public String toString() {
            return "Blank(commonData=" + this.a + ", asset=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final boolean e;

        public c(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }

        public static /* synthetic */ c b(c cVar, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                z = cVar.b;
            }
            boolean z5 = z;
            if ((i & 4) != 0) {
                z2 = cVar.c;
            }
            boolean z6 = z2;
            if ((i & 8) != 0) {
                z3 = cVar.d;
            }
            boolean z7 = z3;
            if ((i & 16) != 0) {
                z4 = cVar.e;
            }
            return cVar.a(str, z5, z6, z7, z4);
        }

        public final c a(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            return new c(str, z, z2, z3, z4);
        }

        public final boolean c() {
            return this.e;
        }

        public final boolean d() {
            return this.c;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final boolean f() {
            return this.b;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            String str = this.a;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            return "CommonData(startUrl=" + this.a + ", overrideMeter=" + this.b + ", deepLink=" + this.c + ", forceLoadInApp=" + this.d + ", allowOfflineLinking=" + this.e + ")";
        }
    }

    public static final class d {
        public static boolean a(m mVar) {
            return mVar.d().c();
        }

        public static Asset b(m mVar) {
            e eVar = mVar instanceof e ? (e) mVar : null;
            if (eVar != null) {
                return eVar.a();
            }
            return null;
        }

        public static boolean c(m mVar) {
            return mVar.d().d();
        }

        public static boolean d(m mVar) {
            return mVar.d().e();
        }

        public static boolean e(m mVar) {
            return mVar.d().f();
        }

        public static String f(m mVar) {
            return mVar.d().g();
        }

        public static String g(m mVar) {
            String g = mVar.g();
            if (g != null) {
                return g;
            }
            Asset a = mVar.a();
            if (a != null) {
                return a.getUrl();
            }
            return null;
        }

        public static HybridType h(m mVar) {
            if (mVar instanceof k) {
                return HybridType.Today;
            }
            if (mVar instanceof g) {
                return HybridType.Article;
            }
            return mVar instanceof i ? true : mVar instanceof j ? true : mVar instanceof l ? HybridType.Interactive : HybridType.Unknown;
        }
    }

    public interface e extends m {

        public static final class a {
            public static boolean a(e eVar) {
                return d.a(eVar);
            }

            public static boolean b(e eVar) {
                return d.c(eVar);
            }

            public static boolean c(e eVar) {
                return d.d(eVar);
            }

            public static boolean d(e eVar) {
                return d.e(eVar);
            }

            public static String e(e eVar) {
                return d.f(eVar);
            }

            public static String f(e eVar) {
                return d.g(eVar);
            }

            public static HybridType g(e eVar) {
                return d.h(eVar);
            }
        }

        @Override // com.nytimes.android.m
        Asset a();
    }

    public interface f extends m {

        public static final class a {
            public static boolean a(f fVar) {
                return d.a(fVar);
            }

            public static Asset b(f fVar) {
                return d.b(fVar);
            }

            public static boolean c(f fVar) {
                return d.c(fVar);
            }

            public static boolean d(f fVar) {
                return d.d(fVar);
            }

            public static boolean e(f fVar) {
                return d.e(fVar);
            }

            public static String f(f fVar) {
                return d.f(fVar);
            }

            public static String g(f fVar) {
                return d.g(fVar);
            }

            public static HybridType h(f fVar) {
                return d.h(fVar);
            }
        }

        String getUrl();
    }

    public static final class g implements e {
        private final c a;
        private final ArticleAsset b;

        public g(c cVar, ArticleAsset articleAsset) {
            zq3.h(cVar, "commonData");
            zq3.h(articleAsset, "asset");
            this.a = cVar;
            this.b = articleAsset;
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return e.a.d(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return e.a.b(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return e.a.g(this);
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

        @Override // com.nytimes.android.m
        public String f() {
            return e.a.f(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return e.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return e.a.a(this);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return e.a.c(this);
        }

        @Override // com.nytimes.android.m.e, com.nytimes.android.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public ArticleAsset a() {
            return this.b;
        }

        public String toString() {
            return "HybridArticle(commonData=" + this.a + ", asset=" + this.b + ")";
        }
    }

    public static final class h implements e {
        private final c a;
        private final Asset b;

        public h(c cVar, Asset asset) {
            zq3.h(cVar, "commonData");
            zq3.h(asset, "asset");
            this.a = cVar;
            this.b = asset;
        }

        @Override // com.nytimes.android.m.e, com.nytimes.android.m
        public Asset a() {
            return this.b;
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return e.a.d(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return e.a.b(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return e.a.g(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
        }

        @Override // com.nytimes.android.m
        public String f() {
            return e.a.f(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return e.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return e.a.a(this);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return e.a.c(this);
        }

        public String toString() {
            return "Media(commonData=" + this.a + ", asset=" + this.b + ")";
        }
    }

    public static final class i implements f, e {
        private final c a;
        private final InteractiveAsset b;
        private final long c;

        public i(c cVar, InteractiveAsset interactiveAsset, long j) {
            zq3.h(cVar, "commonData");
            zq3.h(interactiveAsset, "asset");
            this.a = cVar;
            this.b = interactiveAsset;
            this.c = j;
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return f.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return f.a.c(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return f.a.h(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b) && this.c == iVar.c;
        }

        @Override // com.nytimes.android.m
        public String f() {
            return f.a.g(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return f.a.f(this);
        }

        @Override // com.nytimes.android.m.f
        public String getUrl() {
            String url = a().getUrl();
            zq3.e(url);
            return url;
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return f.a.a(this);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c);
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return f.a.d(this);
        }

        @Override // com.nytimes.android.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public InteractiveAsset a() {
            return this.b;
        }

        public String toString() {
            return "StandaloneInteractive(commonData=" + this.a + ", asset=" + this.b + ", loadingTimestamp=" + this.c + ")";
        }
    }

    public static final class j implements f, e {
        private final c a;
        private final LegacyCollectionAsset b;
        private final long c;

        public j(c cVar, LegacyCollectionAsset legacyCollectionAsset, long j) {
            zq3.h(cVar, "commonData");
            zq3.h(legacyCollectionAsset, "asset");
            this.a = cVar;
            this.b = legacyCollectionAsset;
            this.c = j;
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return f.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return f.a.c(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return f.a.h(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b) && this.c == jVar.c;
        }

        @Override // com.nytimes.android.m
        public String f() {
            return f.a.g(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return f.a.f(this);
        }

        @Override // com.nytimes.android.m.f
        public String getUrl() {
            String url = a().getUrl();
            zq3.e(url);
            return url;
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return f.a.a(this);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c);
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return f.a.d(this);
        }

        @Override // com.nytimes.android.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public LegacyCollectionAsset a() {
            return this.b;
        }

        public String toString() {
            return "StandaloneLegacyCollection(commonData=" + this.a + ", asset=" + this.b + ", loadingTimestamp=" + this.c + ")";
        }
    }

    public static final class l implements f {
        private final c a;
        private final String b;
        private final long c;
        private final boolean d;

        public l(c cVar, String str, long j, boolean z) {
            zq3.h(cVar, "commonData");
            this.a = cVar;
            this.b = str;
            this.c = j;
            this.d = z;
        }

        @Override // com.nytimes.android.m
        public Asset a() {
            return f.a.b(this);
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return f.a.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return f.a.c(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.a;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return f.a.h(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b) && this.c == lVar.c && this.d == lVar.d;
        }

        @Override // com.nytimes.android.m
        public String f() {
            return f.a.g(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return f.a.f(this);
        }

        @Override // com.nytimes.android.m.f
        public String getUrl() {
            String g = g();
            zq3.e(g);
            return g;
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return f.a.a(this);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return f.a.d(this);
        }

        public final String j() {
            return this.b;
        }

        public final boolean k() {
            return this.d;
        }

        public String toString() {
            return "Web(commonData=" + this.a + ", uri=" + this.b + ", loadingTimestamp=" + this.c + ", isInjectHybridConfig=" + this.d + ")";
        }
    }

    Asset a();

    boolean b();

    boolean c();

    c d();

    HybridType e();

    String f();

    String g();

    boolean h();

    boolean i();

    public static final class k implements m {
        private final String a;
        private final c b;

        public k(String str, c cVar) {
            zq3.h(cVar, "commonData");
            this.a = str;
            this.b = cVar;
        }

        @Override // com.nytimes.android.m
        public Asset a() {
            return d.b(this);
        }

        @Override // com.nytimes.android.m
        public boolean b() {
            return d.e(this);
        }

        @Override // com.nytimes.android.m
        public boolean c() {
            return d.c(this);
        }

        @Override // com.nytimes.android.m
        public c d() {
            return this.b;
        }

        @Override // com.nytimes.android.m
        public HybridType e() {
            return d.h(this);
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

        @Override // com.nytimes.android.m
        public String f() {
            return d.g(this);
        }

        @Override // com.nytimes.android.m
        public String g() {
            return d.f(this);
        }

        @Override // com.nytimes.android.m
        public boolean h() {
            return d.a(this);
        }

        public int hashCode() {
            String str = this.a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        }

        @Override // com.nytimes.android.m
        public boolean i() {
            return d.d(this);
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            return "Today(html=" + this.a + ", commonData=" + this.b + ")";
        }

        public /* synthetic */ k(String str, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new c("", false, false, false, true) : cVar);
        }
    }
}
