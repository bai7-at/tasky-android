package com.nytimes.android.features.you.youtab;

import defpackage.sp3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends b {
        private final List a;
        private final Instant b;
        private final Instant c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, Instant instant, Instant instant2) {
            super(null);
            zq3.h(list, "items");
            zq3.h(instant, "fetchingDate");
            zq3.h(instant2, "lastAutoAddedAt");
            this.a = list;
            this.b = instant;
            this.c = instant2;
        }

        public static /* synthetic */ a b(a aVar, List list, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.a;
            }
            if ((i & 2) != 0) {
                instant = aVar.b;
            }
            if ((i & 4) != 0) {
                instant2 = aVar.c;
            }
            return aVar.a(list, instant, instant2);
        }

        public final a a(List list, Instant instant, Instant instant2) {
            zq3.h(list, "items");
            zq3.h(instant, "fetchingDate");
            zq3.h(instant2, "lastAutoAddedAt");
            return new a(list, instant, instant2);
        }

        public final Instant c() {
            return this.b;
        }

        public final List d() {
            return this.a;
        }

        public final Instant e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Content(items=" + this.a + ", fetchingDate=" + this.b + ", lastAutoAddedAt=" + this.c + ")";
        }
    }

    /* renamed from: com.nytimes.android.features.you.youtab.b$b, reason: collision with other inner class name */
    public static final class C0296b extends b {
        public static final C0296b a = new C0296b();

        private C0296b() {
            super(null);
        }
    }

    public static final class c extends b {
        private final sp3 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sp3 sp3Var) {
            super(null);
            zq3.h(sp3Var, "interestOnboardingResponse");
            this.a = sp3Var;
        }

        public final sp3 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Onboarding(interestOnboardingResponse=" + this.a + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
