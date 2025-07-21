package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class dc5 extends bq0 {
    private final List b;
    private final List c;
    private final List d;

    public static final class a {
        private final String a;
        private List b;
        private List c;
        private List d;

        public a(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = i.l();
            this.c = i.l();
            this.d = i.l();
        }

        public final dc5 a() {
            return new dc5(this.a, this.b, this.c, this.d);
        }

        public final a b(List list) {
            zq3.h(list, "implements");
            this.c = list;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc5(String str, List list, List list2, List list3) {
        super(str, null);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "keyFields");
        zq3.h(list2, "implements");
        zq3.h(list3, "embeddedFields");
        this.b = list;
        this.c = list2;
        this.d = list3;
    }
}
