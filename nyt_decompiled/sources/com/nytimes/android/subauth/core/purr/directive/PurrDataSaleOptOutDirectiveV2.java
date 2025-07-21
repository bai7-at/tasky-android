package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrDataSaleOptOutDirectiveV2 extends PurrPrivacyDirective {
    private final DataSaleOptOutDirectiveValueV2 value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrDataSaleOptOutDirectiveV2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrDataSaleOptOutDirectiveV2 copy$default(PurrDataSaleOptOutDirectiveV2 purrDataSaleOptOutDirectiveV2, DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2, int i, Object obj) {
        if ((i & 1) != 0) {
            dataSaleOptOutDirectiveValueV2 = purrDataSaleOptOutDirectiveV2.value;
        }
        return purrDataSaleOptOutDirectiveV2.copy(dataSaleOptOutDirectiveValueV2);
    }

    public final DataSaleOptOutDirectiveValueV2 component1() {
        return this.value;
    }

    public final PurrDataSaleOptOutDirectiveV2 copy(DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2) {
        zq3.h(dataSaleOptOutDirectiveValueV2, "value");
        return new PurrDataSaleOptOutDirectiveV2(dataSaleOptOutDirectiveValueV2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrDataSaleOptOutDirectiveV2) && this.value == ((PurrDataSaleOptOutDirectiveV2) obj).value;
    }

    public final DataSaleOptOutDirectiveValueV2 getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrDataSaleOptOutDirectiveV2(value=" + this.value + ")";
    }

    public /* synthetic */ PurrDataSaleOptOutDirectiveV2(DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DataSaleOptOutDirectiveValueV2.HIDE : dataSaleOptOutDirectiveValueV2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrDataSaleOptOutDirectiveV2(DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2) {
        super(null);
        zq3.h(dataSaleOptOutDirectiveValueV2, "value");
        this.value = dataSaleOptOutDirectiveValueV2;
    }
}
