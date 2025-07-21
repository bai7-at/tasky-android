package defpackage;

import android.content.Intent;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class wt6 extends ue4 {
    public static final a Companion = new a(null);
    private final String b;
    private final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wt6 a(Intent intent) {
            zq3.h(intent, "intent");
            String stringExtra = intent.getStringExtra("et2_referring_source_type");
            if (stringExtra != null) {
                return new wt6(stringExtra, intent.getStringExtra("et2_referring_source_detail"), new Pair[0]);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ wt6(String str, String str2, Pair[] pairArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, pairArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wt6(java.lang.String r4, java.lang.String r5, kotlin.Pair... r6) {
        /*
            r3 = this;
            java.lang.String r0 = "type"
            defpackage.zq3.h(r4, r0)
            java.lang.String r1 = "pairs"
            defpackage.zq3.h(r6, r1)
            mz7 r1 = new mz7
            r2 = 3
            r1.<init>(r2)
            kotlin.Pair r0 = defpackage.du8.a(r0, r4)
            r1.a(r0)
            java.lang.String r0 = "detail"
            kotlin.Pair r0 = defpackage.du8.a(r0, r5)
            r1.a(r0)
            r1.b(r6)
            int r6 = r1.c()
            kotlin.Pair[] r6 = new kotlin.Pair[r6]
            java.lang.Object[] r6 = r1.d(r6)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            r3.<init>(r6)
            r3.b = r4
            r3.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt6.<init>(java.lang.String, java.lang.String, kotlin.Pair[]):void");
    }
}
