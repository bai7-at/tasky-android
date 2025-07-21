package defpackage;

import com.nytimes.android.subauth.core.type.UserPreferenceValue;
import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class rx8 implements jz4 {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final UserPreferenceValue c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation UpdateEmailPref($source: String!, $preference: String!, $value: UserPreferenceValue!, $initialUIState: String!) { updateUserEmailPref(input: { source: $source value: $value preference: $preference metadata: [[\"nyt_send_marketing_email_default\",$initialUIState]] } ) { __typename } }";
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
            return "Data(updateUserEmailPref=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;

        public c(String str) {
            zq3.h(str, "__typename");
            this.a = str;
        }

        public final String a() {
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
            return "UpdateUserEmailPref(__typename=" + this.a + ")";
        }
    }

    public rx8(String str, String str2, UserPreferenceValue userPreferenceValue, String str3) {
        zq3.h(str, "source");
        zq3.h(str2, "preference");
        zq3.h(userPreferenceValue, "value");
        zq3.h(str3, "initialUIState");
        this.a = str;
        this.b = str2;
        this.c = userPreferenceValue;
        this.d = str3;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(sx8.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        ux8.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx8)) {
            return false;
        }
        rx8 rx8Var = (rx8) obj;
        return zq3.c(this.a, rx8Var.a) && zq3.c(this.b, rx8Var.b) && this.c == rx8Var.c && zq3.c(this.d, rx8Var.d);
    }

    public final String f() {
        return this.a;
    }

    public final UserPreferenceValue g() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "25aa0da070641663597059f0465a15b3a1ec6c28d6d610d325205925319aecab";
    }

    @Override // defpackage.ii5
    public String name() {
        return "UpdateEmailPref";
    }

    public String toString() {
        return "UpdateEmailPrefMutation(source=" + this.a + ", preference=" + this.b + ", value=" + this.c + ", initialUIState=" + this.d + ")";
    }
}
