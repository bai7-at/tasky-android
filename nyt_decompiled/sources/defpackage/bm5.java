package defpackage;

import com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class bm5 {
    private final String a;
    private final VerifyPurchaseResponse b;

    public static final class a extends bm5 {
        public static final a c = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a() {
            /*
                r6 = this;
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse r0 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseData r1 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseData
                r2 = 0
                r1.<init>(r2)
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseMetadata r3 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseMetadata
                r4 = 406(0x196, float:5.69E-43)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r5 = "invalid receipt"
                r3.<init>(r4, r5)
                r0.<init>(r1, r3)
                java.lang.String r1 = "InvalidReceipt"
                r6.<init>(r1, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bm5.a.<init>():void");
        }
    }

    public static final class b extends bm5 {
        public static final b c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private b() {
            /*
                r6 = this;
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse r0 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseData r1 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseData
                r2 = 0
                r1.<init>(r2)
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseMetadata r3 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseMetadata
                r4 = 500(0x1f4, float:7.0E-43)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r5 = "invalid receipt"
                r3.<init>(r4, r5)
                r0.<init>(r1, r3)
                java.lang.String r1 = "ServerError"
                r6.<init>(r1, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bm5.b.<init>():void");
        }
    }

    public static final class c extends bm5 {
        public static final c c = new c();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private c() {
            /*
                r6 = this;
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse r0 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseData r1 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseData
                r2 = 0
                r1.<init>(r2)
                com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseMetadata r3 = new com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseMetadata
                r4 = 500(0x1f4, float:7.0E-43)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r5 = "Fake response"
                r3.<init>(r4, r5)
                r0.<init>(r1, r3)
                java.lang.String r1 = "Mock Success (Creates Temp Entitlement)"
                r6.<init>(r1, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bm5.c.<init>():void");
        }
    }

    public /* synthetic */ bm5(String str, VerifyPurchaseResponse verifyPurchaseResponse, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, verifyPurchaseResponse);
    }

    public final String a() {
        return this.a;
    }

    public final VerifyPurchaseResponse b() {
        return this.b;
    }

    private bm5(String str, VerifyPurchaseResponse verifyPurchaseResponse) {
        this.a = str;
        this.b = verifyPurchaseResponse;
    }
}
