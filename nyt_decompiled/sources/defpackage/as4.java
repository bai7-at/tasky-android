package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public interface as4 {

    public static final class a implements as4 {
        private final String a;

        public a(String str) {
            zq3.h(str, "destination");
            this.a = str;
        }

        @Override // defpackage.as4
        public MessageProperties a() {
            return new MessageProperties("navigation", t.f(du8.a("destination", this.a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Navigation(destination=" + this.a + ")";
        }
    }

    MessageProperties a();
}
