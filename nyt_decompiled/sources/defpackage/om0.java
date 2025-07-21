package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class om0 {
    private final String a;
    private final String b;

    public static final class a extends om0 {
        public static final a c = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a() {
            /*
                r2 = this;
                java.lang.String r0 = "cmp_layer_1"
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: om0.a.<init>():void");
        }
    }

    public static final class b extends om0 {
        public static final b c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private b() {
            /*
                r2 = this;
                java.lang.String r0 = "cmp_layer_2"
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: om0.b.<init>():void");
        }
    }

    public /* synthetic */ om0(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    private om0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
