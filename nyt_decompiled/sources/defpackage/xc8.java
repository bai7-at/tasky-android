package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class xc8 {
    public static final a Companion = new a(null);
    private final s7 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends xc8 {
        public static final b b = new b();

        private b() {
            super(new s7(970, 90), null);
        }
    }

    public static final class c extends xc8 {
        public static final c b = new c();

        private c() {
            super(new s7(970, 250), null);
        }
    }

    public static final class d extends xc8 {
        public static final d b = new d();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private d() {
            /*
                r2 = this;
                s7 r0 = defpackage.s7.i
                java.lang.String r1 = "BANNER"
                defpackage.zq3.g(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xc8.d.<init>():void");
        }
    }

    public static final class e extends xc8 {
        public static final e b = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e() {
            /*
                r2 = this;
                s7 r0 = defpackage.s7.m
                java.lang.String r1 = "MEDIUM_RECTANGLE"
                defpackage.zq3.g(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xc8.e.<init>():void");
        }
    }

    public /* synthetic */ xc8(s7 s7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(s7Var);
    }

    public final s7 a() {
        return this.a;
    }

    private xc8(s7 s7Var) {
        this.a = s7Var;
    }
}
