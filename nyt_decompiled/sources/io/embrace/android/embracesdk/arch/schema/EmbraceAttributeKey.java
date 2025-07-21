package io.embrace.android.embracesdk.arch.schema;

import defpackage.dv;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceAttributeKey implements EmbraceAttribute {
    private final dv attributeKey;
    private final String id;
    private final String name;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EmbraceAttributeKey(java.lang.String r2, defpackage.dv r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            java.lang.String r0 = "id"
            defpackage.zq3.h(r2, r0)
            r1.<init>()
            r1.id = r2
            if (r4 != 0) goto L20
            if (r3 == 0) goto L13
            java.lang.String r2 = r3.getKey()
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L20
            java.lang.String r2 = r3.getKey()
            java.lang.String r4 = "otelAttributeKey.key"
            defpackage.zq3.g(r2, r4)
            goto L28
        L20:
            java.lang.String r2 = r1.getId()
            java.lang.String r2 = io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt.toEmbraceAttributeName(r2, r5)
        L28:
            r1.name = r2
            if (r3 != 0) goto L39
            java.lang.String r2 = r1.getName()
            dv r3 = defpackage.dv.a(r2)
            java.lang.String r2 = "AttributeKey.stringKey(name)"
            defpackage.zq3.g(r3, r2)
        L39:
            r1.attributeKey = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey.<init>(java.lang.String, dv, boolean, boolean):void");
    }

    public final dv getAttributeKey() {
        return this.attributeKey;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.EmbraceAttribute
    public String getId() {
        return this.id;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.EmbraceAttribute
    public String getName() {
        return this.name;
    }

    public /* synthetic */ EmbraceAttributeKey(String str, dv dvVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : dvVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
