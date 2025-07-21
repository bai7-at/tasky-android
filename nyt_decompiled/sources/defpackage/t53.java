package defpackage;

/* loaded from: classes4.dex */
public final class t53 {
    private final w43 a;
    private final w43 b;
    private final u53 c;

    public t53(w43 w43Var, w43 w43Var2, u53 u53Var) {
        zq3.h(w43Var, "darkColorPalette");
        zq3.h(w43Var2, "lightColorPalette");
        zq3.h(u53Var, "typography");
        this.a = w43Var;
        this.b = w43Var2;
        this.c = u53Var;
    }

    public final w43 a() {
        return this.a;
    }

    public final w43 b() {
        return this.b;
    }

    public final u53 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t53)) {
            return false;
        }
        t53 t53Var = (t53) obj;
        return zq3.c(this.a, t53Var.a) && zq3.c(this.b, t53Var.b) && zq3.c(this.c, t53Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "GrowthUITheme(darkColorPalette=" + this.a + ", lightColorPalette=" + this.b + ", typography=" + this.c + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ t53(defpackage.w43 r29, defpackage.w43 r30, defpackage.u53 r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r28 = this;
            r0 = r32 & 1
            if (r0 == 0) goto L9
            w43 r0 = com.nytimes.android.growthui.common.theme.ColorsKt.a()
            goto Lb
        L9:
            r0 = r29
        Lb:
            r1 = r32 & 2
            if (r1 == 0) goto L14
            w43 r1 = com.nytimes.android.growthui.common.theme.ColorsKt.b()
            goto L16
        L14:
            r1 = r30
        L16:
            r2 = r32 & 4
            if (r2 == 0) goto L48
            u53 r2 = new u53
            r3 = r2
            r26 = 4194303(0x3fffff, float:5.87747E-39)
            r27 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = r28
            goto L4c
        L48:
            r3 = r28
            r2 = r31
        L4c:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.<init>(w43, w43, u53, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
