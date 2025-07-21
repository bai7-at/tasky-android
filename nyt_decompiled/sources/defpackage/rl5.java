package defpackage;

import defpackage.w28;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class rl5 {
    private final String a;
    private final w28 b;

    public static final class a extends rl5 {
        public static final a c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super("No Override", null, 0 == true ? 1 : 0);
        }
    }

    public static final class b extends rl5 {
        public static final b c = new b();

        private b() {
            super("Product Not found", w28.a.b.a, null);
        }
    }

    public /* synthetic */ rl5(String str, w28 w28Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, w28Var);
    }

    public final String a() {
        return this.a;
    }

    public final w28 b() {
        return this.b;
    }

    private rl5(String str, w28 w28Var) {
        this.a = str;
        this.b = w28Var;
    }
}
