package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class e {
    private final a a;
    private final a b;
    private final boolean c;

    public static final class a {
        private final ResolvedTextDirection a;
        private final int b;
        private final long c;

        public a(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.a = resolvedTextDirection;
            this.b = i;
            this.c = j;
        }

        public static /* synthetic */ a b(a aVar, ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = aVar.a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.b;
            }
            if ((i2 & 4) != 0) {
                j = aVar.c;
            }
            return aVar.a(resolvedTextDirection, i, j);
        }

        public final a a(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            return new a(resolvedTextDirection, i, j);
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    public e(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static /* synthetic */ e b(e eVar, a aVar, a aVar2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = eVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = eVar.b;
        }
        if ((i & 4) != 0) {
            z = eVar.c;
        }
        return eVar.a(aVar, aVar2, z);
    }

    public final e a(a aVar, a aVar2, boolean z) {
        return new e(aVar, aVar2, z);
    }

    public final a c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final a e() {
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
        return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && this.c == eVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
