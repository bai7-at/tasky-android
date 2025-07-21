package com.nytimes.android.sectionfront.adapter.model;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.k;
import com.nytimes.android.api.cms.Asset;
import defpackage.b16;
import defpackage.db0;
import defpackage.k57;
import defpackage.sv4;
import defpackage.z57;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b extends k57 {
    private final Asset a;
    private final Optional b;
    private final Optional c;
    private final boolean d;
    private final Optional e;
    private final boolean f;
    private final Optional g;
    private final Optional h;
    private final boolean i;
    private volatile transient C0403b j;

    public static final class a {
        private long a;
        private long b;
        private Asset c;
        private Optional d;
        private Optional e;
        private boolean f;
        private Optional g;
        private boolean h;
        private Optional i;
        private Optional j;
        private boolean k;

        private String o() {
            ArrayList h = k.h();
            if ((this.a & 1) != 0) {
                h.add("asset");
            }
            return "Cannot build SFBlock, some of required attributes are not set " + h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return (this.b & 4) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r() {
            return (this.b & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t() {
            return (this.b & 2) != 0;
        }

        public final a m(Asset asset) {
            this.c = (Asset) b16.l(asset, "asset");
            this.a &= -2;
            return this;
        }

        public b n() {
            if (this.a == 0) {
                return new b(this);
            }
            throw new IllegalStateException(o());
        }

        public final a q(boolean z) {
            this.f = z;
            this.b |= 1;
            return this;
        }

        public final a s(boolean z) {
            this.h = z;
            this.b |= 2;
            return this;
        }

        public final a u(ImmutableList immutableList) {
            this.i = Optional.e(immutableList);
            return this;
        }

        public final a v(Optional optional) {
            this.g = optional;
            return this;
        }

        public final a w(z57 z57Var) {
            this.j = Optional.e(z57Var);
            return this;
        }

        private a() {
            this.a = 1L;
            this.d = Optional.a();
            this.e = Optional.a();
            this.g = Optional.a();
            this.i = Optional.a();
            this.j = Optional.a();
        }
    }

    /* renamed from: com.nytimes.android.sectionfront.adapter.model.b$b, reason: collision with other inner class name */
    private final class C0403b {
        private boolean a;
        private int b;
        private boolean c;
        private int d;
        private boolean e;
        private int f;

        private String a() {
            ArrayList h = k.h();
            if (this.b == -1) {
                h.add("shouldShowTimeStamp");
            }
            if (this.d == -1) {
                h.add("showSummary");
            }
            if (this.f == -1) {
                h.add("shouldHideComments");
            }
            return "Cannot build SFBlock, attribute initializers form cycle" + h;
        }

        void b(boolean z) {
            this.e = z;
            this.f = 1;
        }

        boolean c() {
            int i = this.f;
            if (i == -1) {
                throw new IllegalStateException(a());
            }
            if (i == 0) {
                this.f = -1;
                this.e = b.super.b();
                this.f = 1;
            }
            return this.e;
        }

        void d(boolean z) {
            this.a = z;
            this.b = 1;
        }

        boolean e() {
            int i = this.b;
            if (i == -1) {
                throw new IllegalStateException(a());
            }
            if (i == 0) {
                this.b = -1;
                this.a = b.super.c();
                this.b = 1;
            }
            return this.a;
        }

        void f(boolean z) {
            this.c = z;
            this.d = 1;
        }

        boolean g() {
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException(a());
            }
            if (i == 0) {
                this.d = -1;
                this.c = b.super.d();
                this.d = 1;
            }
            return this.c;
        }

        private C0403b() {
        }
    }

    public static a k() {
        return new a();
    }

    private boolean l(b bVar) {
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d && this.e.equals(bVar.e) && this.f == bVar.f && this.g.equals(bVar.g) && this.h.equals(bVar.h) && this.i == bVar.i;
    }

    @Override // defpackage.k57
    public Asset a() {
        return this.a;
    }

    @Override // defpackage.k57
    public boolean b() {
        C0403b c0403b = this.j;
        return c0403b != null ? c0403b.c() : this.i;
    }

    @Override // defpackage.k57
    public boolean c() {
        C0403b c0403b = this.j;
        return c0403b != null ? c0403b.e() : this.d;
    }

    @Override // defpackage.k57
    public boolean d() {
        C0403b c0403b = this.j;
        return c0403b != null ? c0403b.g() : this.f;
    }

    @Override // defpackage.k57
    public Optional e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l((b) obj);
    }

    @Override // defpackage.k57
    public Optional f() {
        return this.e;
    }

    @Override // defpackage.k57
    public Optional g() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() + 177573;
        int hashCode2 = hashCode + (hashCode << 5) + this.b.hashCode();
        int hashCode3 = hashCode2 + (hashCode2 << 5) + this.c.hashCode();
        int c = hashCode3 + (hashCode3 << 5) + db0.c(this.d);
        int hashCode4 = c + (c << 5) + this.e.hashCode();
        int c2 = hashCode4 + (hashCode4 << 5) + db0.c(this.f);
        int hashCode5 = c2 + (c2 << 5) + this.g.hashCode();
        int hashCode6 = hashCode5 + (hashCode5 << 5) + this.h.hashCode();
        return hashCode6 + (hashCode6 << 5) + db0.c(this.i);
    }

    public String toString() {
        return sv4.b("SFBlock").h().a("asset", this.a).a("shouldHideKicker", this.b.g()).a("isGroupTitleHidden", this.c.g()).b("shouldShowTimeStamp", this.d).a("timeStamp", this.e.g()).b("showSummary", this.f).a("summary", this.g.g()).a("wrappedText", this.h.g()).b("shouldHideComments", this.i).toString();
    }

    private b(a aVar) {
        this.j = new C0403b();
        this.a = aVar.c;
        this.b = aVar.d;
        this.c = aVar.e;
        this.e = aVar.g;
        this.g = aVar.i;
        this.h = aVar.j;
        if (aVar.r()) {
            this.j.d(aVar.f);
        }
        if (aVar.t()) {
            this.j.f(aVar.h);
        }
        if (aVar.p()) {
            this.j.b(aVar.k);
        }
        this.d = this.j.e();
        this.f = this.j.g();
        this.i = this.j.c();
        this.j = null;
    }
}
