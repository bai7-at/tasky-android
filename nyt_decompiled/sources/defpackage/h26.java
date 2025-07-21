package defpackage;

/* loaded from: classes.dex */
public abstract class h26 {
    public static final Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            g26.a.a("Unable to find PreviewProvider '" + str + '\'', e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0019, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object[] b(java.lang.Class r8, int r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L48
            java.lang.reflect.Constructor[] r8 = r8.getConstructors()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            int r1 = r8.length     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            r2 = 0
            r3 = r0
            r4 = r2
        Lb:
            r5 = 1
            if (r0 >= r1) goto L20
            r6 = r8[r0]     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            int r7 = r7.length     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            if (r7 != 0) goto L1d
            if (r3 == 0) goto L1b
        L19:
            r4 = r2
            goto L23
        L1b:
            r3 = r5
            r4 = r6
        L1d:
            int r0 = r0 + 1
            goto Lb
        L20:
            if (r3 != 0) goto L23
            goto L19
        L23:
            if (r4 == 0) goto L38
            r4.setAccessible(r5)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            java.lang.Object r8 = r4.newInstance(r2)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>"
            defpackage.zq3.f(r8, r0)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            defpackage.lh4.a(r8)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            if (r9 >= 0) goto L37
            throw r2
        L37:
            throw r2
        L38:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            java.lang.String r9 = "PreviewParameterProvider constructor can not have parameters"
            r8.<init>(r9)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
            throw r8     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L40
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle."
            r8.<init>(r9)
            throw r8
        L48:
            java.lang.Object[] r8 = new java.lang.Object[r0]
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h26.b(java.lang.Class, int):java.lang.Object[]");
    }
}
