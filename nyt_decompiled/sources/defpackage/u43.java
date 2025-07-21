package defpackage;

import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class u43 {
    private final Set a;

    public static final class a extends u43 {
        public static final a b = new a();

        private a() {
            super(b0.e(), null);
        }
    }

    public static final class b extends u43 {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Set set) {
            super(set, null);
            zq3.h(set, "subscriptions");
            this.b = str;
        }

        public final String b() {
            return this.b;
        }
    }

    public /* synthetic */ u43(Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(set);
    }

    public final Set a() {
        return this.a;
    }

    private u43(Set set) {
        this.a = set;
    }
}
