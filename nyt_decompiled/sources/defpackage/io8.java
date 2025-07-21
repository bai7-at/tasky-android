package defpackage;

import android.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;

/* loaded from: classes.dex */
public final class io8 extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io8(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            defpackage.zq3.h(r2, r0)
            java.lang.Class r0 = defpackage.bo8.a()
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            defpackage.zq3.g(r2, r0)
            android.adservices.topics.TopicsManager r2 = defpackage.co8.a(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io8.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public GetTopicsRequest c(zy2 zy2Var) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        zq3.h(zy2Var, "request");
        adsSdkName = eo8.a().setAdsSdkName(zy2Var.a());
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(zy2Var.b());
        build = shouldRecordObservation.build();
        zq3.g(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
