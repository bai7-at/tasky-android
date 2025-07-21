package com.nytimes.android.coroutinesutils;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public abstract class DownloadState {
    public static final Companion Companion = new Companion(null);
    private final Object a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DownloadState a(Object obj, Throwable th) {
            zq3.h(th, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
            return obj == null ? new a(th) : new b(obj, th);
        }

        public final DownloadState b(Object obj) {
            return obj == null ? c.b : new d(obj);
        }

        public final Flow c(qs2 qs2Var, ss2 ss2Var) {
            zq3.h(qs2Var, "currentData");
            zq3.h(ss2Var, "call");
            return FlowKt.flow(new DownloadState$Companion$flowFrom$1(qs2Var, ss2Var, null));
        }

        private Companion() {
        }
    }

    public static final class a extends DownloadState {
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(null);
            zq3.h(th, "error");
            this.b = th;
        }

        public final Throwable c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.b + ")";
        }
    }

    public static final class b extends DownloadState {
        private final Object b;
        private final String c;
        private final Throwable d;

        public /* synthetic */ b(Object obj, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, str, (i & 4) != 0 ? null : th);
        }

        @Override // com.nytimes.android.coroutinesutils.DownloadState
        public Object a() {
            return this.b;
        }

        public final Throwable c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d);
        }

        public int hashCode() {
            Object obj = this.b;
            int hashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + this.c.hashCode()) * 31;
            Throwable th = this.d;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "FetchingError(data=" + this.b + ", message=" + this.c + ", error=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, String str, Throwable th) {
            super(null);
            zq3.h(str, "message");
            this.b = obj;
            this.c = str;
            this.d = th;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(java.lang.Object r2, java.lang.Throwable r3) {
            /*
                r1 = this;
                java.lang.String r0 = "t"
                defpackage.zq3.h(r3, r0)
                java.lang.String r0 = r3.getMessage()
                if (r0 != 0) goto Lf
                java.lang.String r0 = r3.toString()
            Lf:
                r1.<init>(r2, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.DownloadState.b.<init>(java.lang.Object, java.lang.Throwable):void");
        }
    }

    public static final class c extends DownloadState {
        public static final c b = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends DownloadState {
        private final Object b;

        public d(Object obj) {
            super(null);
            this.b = obj;
        }

        @Override // com.nytimes.android.coroutinesutils.DownloadState
        public Object a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "LoadingInBackground(data=" + this.b + ")";
        }
    }

    public static final class e extends DownloadState {
        private final Object b;

        public e(Object obj) {
            super(null);
            this.b = obj;
        }

        @Override // com.nytimes.android.coroutinesutils.DownloadState
        public Object a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.b + ")";
        }
    }

    public /* synthetic */ DownloadState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Object a() {
        return this.a;
    }

    public final boolean b() {
        return (this instanceof c) || (this instanceof d);
    }

    private DownloadState() {
    }
}
