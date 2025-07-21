package androidx.datastore.core;

import defpackage.gt2;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class DataMigrationInitializer {
    public static final Companion a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:13:0x006c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:13:0x006c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(java.util.List r6, defpackage.vj3 r7, defpackage.by0 r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r5, r8)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r8 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r0.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L46
                if (r1 == r3) goto L3e
                if (r1 != r2) goto L36
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.L$0
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L34
                goto L6c
            L34:
                r5 = move-exception
                goto L85
            L36:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3e:
                java.lang.Object r6 = r0.L$0
                java.util.List r6 = (java.util.List) r6
                kotlin.f.b(r5)
                goto L60
            L46:
                kotlin.f.b(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L5f
                return r8
            L5f:
                r6 = r5
            L60:
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L6c:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L97
                java.lang.Object r5 = r6.next()
                ss2 r5 = (defpackage.ss2) r5
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L34
                r0.L$1 = r6     // Catch: java.lang.Throwable -> L34
                r0.label = r2     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r5 != r8) goto L6c
                return r8
            L85:
                T r1 = r7.element
                if (r1 != 0) goto L8c
                r7.element = r5
                goto L6c
            L8c:
                defpackage.zq3.e(r1)
                T r1 = r7.element
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                defpackage.g62.a(r1, r5)
                goto L6c
            L97:
                T r5 = r7.element
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto La0
                ww8 r5 = defpackage.ww8.a
                return r5
            La0:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.c(java.util.List, vj3, by0):java.lang.Object");
        }

        public final gt2 b(List list) {
            zq3.h(list, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(list, null);
        }

        private Companion() {
        }
    }
}
