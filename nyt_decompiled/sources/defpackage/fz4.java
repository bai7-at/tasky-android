package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class fz4 implements jz4 {
    public static final a Companion = new a(null);
    private final xg8 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation MutateTcfPreference($input: TcfPreferenceInputData!) { updateTcfPref(tcfData: $input) { __typename ...onTcfPreference } }  fragment onTcfPreference on TcfPreferenceData { userTcfData { tcString noticeVersion tcDecodedData } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Data(updateTcfPref=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final wf5 b;

        public c(String str, wf5 wf5Var) {
            zq3.h(str, "__typename");
            zq3.h(wf5Var, "onTcfPreference");
            this.a = str;
            this.b = wf5Var;
        }

        public final wf5 a() {
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
            return "UpdateTcfPref(__typename=" + this.a + ", onTcfPreference=" + this.b + ")";
        }
    }

    public fz4(xg8 xg8Var) {
        zq3.h(xg8Var, "input");
        this.a = xg8Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(gz4.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        iz4.a.a(lu3Var, this, w41Var, z);
    }

    public final xg8 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz4) && zq3.c(this.a, ((fz4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "fd637e9f64eadb33ab4f6aebc42d12af33e276483cfc436efdf69dcb3c701dbc";
    }

    @Override // defpackage.ii5
    public String name() {
        return "MutateTcfPreference";
    }

    public String toString() {
        return "MutateTcfPreferenceMutation(input=" + this.a + ")";
    }
}
