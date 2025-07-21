package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class pb8 {
    private final nb8 a;

    public static final class a extends pb8 {
        private final b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nb8 nb8Var, b bVar) {
            super(nb8Var, null);
            zq3.h(nb8Var, "period");
            zq3.h(bVar, "fullPrice");
            this.b = bVar;
        }

        public final b b() {
            return this.b;
        }
    }

    public static final class b extends pb8 {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nb8 nb8Var, String str) {
            super(nb8Var, null);
            zq3.h(nb8Var, "period");
            zq3.h(str, "price");
            this.b = str;
        }

        public final String b() {
            return this.b;
        }
    }

    public static final class c extends pb8 {
        private final String b;
        private final b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nb8 nb8Var, String str, b bVar) {
            super(nb8Var, null);
            zq3.h(nb8Var, "period");
            zq3.h(str, "discountedPrice");
            zq3.h(bVar, "fullPrice");
            this.b = str;
            this.c = bVar;
        }

        public final String b() {
            return this.b;
        }

        public final b c() {
            return this.c;
        }
    }

    public /* synthetic */ pb8(nb8 nb8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nb8Var);
    }

    public final nb8 a() {
        return this.a;
    }

    private pb8(nb8 nb8Var) {
        this.a = nb8Var;
    }
}
