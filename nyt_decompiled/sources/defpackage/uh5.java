package defpackage;

import com.facebook.AuthenticationTokenClaims;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.OnsiteMessagingInput;

/* loaded from: classes3.dex */
public final class uh5 implements hb6 {
    public static final a Companion = new a(null);
    private final OnsiteMessagingInput a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query OnsiteMessagingQuery($data: OnsiteMessagingInput!) { onsiteMessaging(data: $data) { units { name canShow messages { name audience canShow reason content { __typename ...MessageContent } } } } }  fragment MessageProperties on StaticContentMobileNewsProperties { name properties { key value } }  fragment MessageContent on OnsiteMessagingStaticContentMobileNewsContent { historyId action { __typename ...MessageProperties } analytics { moduleName label } body { text style } cadence cancelable kicker mediaResource { __typename ...MessageProperties } placement { __typename ...MessageProperties } presentationRule { __typename ...MessageProperties } sequenceInfo { next canSkip } weight }";
        }

        private a() {
        }
    }

    public static final class b {
        private final String a;
        private final tq4 b;

        public b(String str, tq4 tq4Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = tq4Var;
        }

        public final tq4 a() {
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
            tq4 tq4Var = this.b;
            return hashCode + (tq4Var == null ? 0 : tq4Var.hashCode());
        }

        public String toString() {
            return "Content(__typename=" + this.a + ", messageContent=" + this.b + ")";
        }
    }

    public static final class c implements ii5.a {
        private final e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Data(onsiteMessaging=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;
        private final boolean c;
        private final String d;
        private final b e;

        public d(String str, String str2, boolean z, String str3, b bVar) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str3, "reason");
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = bVar;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final b c() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && this.c == dVar.c && zq3.c(this.d, dVar.d) && zq3.c(this.e, dVar.e);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode()) * 31;
            b bVar = this.e;
            return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "Message(name=" + this.a + ", audience=" + this.b + ", canShow=" + this.c + ", reason=" + this.d + ", content=" + this.e + ")";
        }
    }

    public static final class e {
        private final List a;

        public e(List list) {
            zq3.h(list, "units");
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "OnsiteMessaging(units=" + this.a + ")";
        }
    }

    public static final class f {
        private final String a;
        private final boolean b;
        private final List c;

        public f(String str, boolean z, List list) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(list, "messages");
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean a() {
            return this.b;
        }

        public final List b() {
            return this.c;
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
            return zq3.c(this.a, fVar.a) && this.b == fVar.b && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Unit(name=" + this.a + ", canShow=" + this.b + ", messages=" + this.c + ")";
        }
    }

    public uh5(OnsiteMessagingInput onsiteMessagingInput) {
        zq3.h(onsiteMessagingInput, "data");
        this.a = onsiteMessagingInput;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(wh5.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        ai5.a.a(lu3Var, this, w41Var, z);
    }

    public final OnsiteMessagingInput d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh5) && zq3.c(this.a, ((uh5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "4eac201479246a088d4a8c8f25a81b4c2e7e4a78ce71aef16b38f1d6759555eb";
    }

    @Override // defpackage.ii5
    public String name() {
        return "OnsiteMessagingQuery";
    }

    public String toString() {
        return "OnsiteMessagingQuery(data=" + this.a + ")";
    }
}
