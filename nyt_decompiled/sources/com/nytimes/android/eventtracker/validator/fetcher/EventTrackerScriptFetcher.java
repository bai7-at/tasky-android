package com.nytimes.android.eventtracker.validator.fetcher;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.lc7;
import defpackage.zq3;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class EventTrackerScriptFetcher implements lc7 {
    private final lc7 a;
    private final lc7 b;

    public static final class Script implements Serializable {
        public static final a Companion = new a(null);
        private static final Script a = new Script("ET2", "VALIDATOR");
        private final String key;
        private final String value;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Script a() {
                return Script.a;
            }

            private a() {
            }
        }

        public Script(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(str2, "value");
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Script)) {
                return false;
            }
            Script script = (Script) obj;
            return zq3.c(this.key, script.key) && zq3.c(this.value, script.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Script(key=" + this.key + ", value=" + this.value + ")";
        }
    }

    public EventTrackerScriptFetcher(lc7 lc7Var, lc7 lc7Var2) {
        zq3.h(lc7Var, "storeFetcher");
        zq3.h(lc7Var2, "resourceFetcher");
        this.a = lc7Var;
        this.b = lc7Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(1:25))|19|21))|30|6|7|(0)(0)|19|21) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        defpackage.ul8.a.z("ET2").f(r7, "Failed to fetch validation script, returning local", new java.lang.Object[0]);
        r6 = r6.b;
        r0.L$0 = null;
        r0.label = 2;
        r7 = r6.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.lc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher$fetchValidationScript$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher$fetchValidationScript$1 r0 = (com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher$fetchValidationScript$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher$fetchValidationScript$1 r0 = new com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher$fetchValidationScript$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher r6 = (com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher) r6
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L3c
            goto L4e
        L3c:
            r7 = move-exception
            goto L51
        L3e:
            kotlin.f.b(r7)
            lc7 r7 = r6.a     // Catch: java.lang.Exception -> L3c
            r0.L$0 = r6     // Catch: java.lang.Exception -> L3c
            r0.label = r4     // Catch: java.lang.Exception -> L3c
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Exception -> L3c
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L3c
            goto L71
        L51:
            ul8$b r2 = defpackage.ul8.a
            java.lang.String r4 = "ET2"
            ul8$c r2 = r2.z(r4)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "Failed to fetch validation script, returning local"
            r2.f(r7, r5, r4)
            lc7 r6 = r6.b
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            java.lang.String r7 = (java.lang.String) r7
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher.a(by0):java.lang.Object");
    }
}
