package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShowDataSaleOptOutDirectiveV2 extends UserPrivacyDirective {
    private final DataSaleOptOutDirectiveValueV2 value;

    public ShowDataSaleOptOutDirectiveV2(DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2) {
        zq3.h(dataSaleOptOutDirectiveValueV2, "value");
        this.value = dataSaleOptOutDirectiveValueV2;
    }

    public static /* synthetic */ ShowDataSaleOptOutDirectiveV2 copy$default(ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2, DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2, int i, Object obj) {
        if ((i & 1) != 0) {
            dataSaleOptOutDirectiveValueV2 = showDataSaleOptOutDirectiveV2.value;
        }
        return showDataSaleOptOutDirectiveV2.copy(dataSaleOptOutDirectiveValueV2);
    }

    public final DataSaleOptOutDirectiveValueV2 component1() {
        return this.value;
    }

    public final ShowDataSaleOptOutDirectiveV2 copy(DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2) {
        zq3.h(dataSaleOptOutDirectiveValueV2, "value");
        return new ShowDataSaleOptOutDirectiveV2(dataSaleOptOutDirectiveValueV2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowDataSaleOptOutDirectiveV2) && this.value == ((ShowDataSaleOptOutDirectiveV2) obj).value;
    }

    public final DataSaleOptOutDirectiveValueV2 getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ShowDataSaleOptOutDirectiveV2(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrDataSaleOptOutDirectiveV2 toPublic$subauth_core_release() {
        return new PurrDataSaleOptOutDirectiveV2(this.value);
    }
}
