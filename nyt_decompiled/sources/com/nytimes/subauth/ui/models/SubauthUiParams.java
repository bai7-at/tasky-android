package com.nytimes.subauth.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SubauthUiParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SubauthUiParams> CREATOR = new a();
    private final DeleteAccountStatusOverride deleteAccountStateOverride;
    private final boolean enableLIRENetworkDelay;
    private final boolean isForceLogin;
    private final boolean isOfferCheckboxChecked;
    private final LIREErrorStateOverride lireErrorStateOverride;
    private final RegiInterface regiInterface;
    private final boolean shouldShowEmailSupportButton;
    private final boolean showCaliforniaNotices;
    private final boolean showOfferCheckbox;
    private final SubauthUserUIDebugAPI.SSOActionOverrideState ssoActionOverride;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SubauthUiParams createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new SubauthUiParams(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : RegiInterface.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, LIREErrorStateOverride.valueOf(parcel.readString()), DeleteAccountStatusOverride.valueOf(parcel.readString()), SubauthUserUIDebugAPI.SSOActionOverrideState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SubauthUiParams[] newArray(int i) {
            return new SubauthUiParams[i];
        }
    }

    public SubauthUiParams(boolean z, boolean z2, boolean z3, boolean z4, RegiInterface regiInterface, boolean z5, boolean z6, LIREErrorStateOverride lIREErrorStateOverride, DeleteAccountStatusOverride deleteAccountStatusOverride, SubauthUserUIDebugAPI.SSOActionOverrideState sSOActionOverrideState) {
        zq3.h(lIREErrorStateOverride, "lireErrorStateOverride");
        zq3.h(deleteAccountStatusOverride, "deleteAccountStateOverride");
        zq3.h(sSOActionOverrideState, "ssoActionOverride");
        this.showCaliforniaNotices = z;
        this.isForceLogin = z2;
        this.showOfferCheckbox = z3;
        this.isOfferCheckboxChecked = z4;
        this.regiInterface = regiInterface;
        this.enableLIRENetworkDelay = z5;
        this.shouldShowEmailSupportButton = z6;
        this.lireErrorStateOverride = lIREErrorStateOverride;
        this.deleteAccountStateOverride = deleteAccountStatusOverride;
        this.ssoActionOverride = sSOActionOverrideState;
    }

    public final SubauthUiParams a(boolean z, boolean z2, boolean z3, boolean z4, RegiInterface regiInterface, boolean z5, boolean z6, LIREErrorStateOverride lIREErrorStateOverride, DeleteAccountStatusOverride deleteAccountStatusOverride, SubauthUserUIDebugAPI.SSOActionOverrideState sSOActionOverrideState) {
        zq3.h(lIREErrorStateOverride, "lireErrorStateOverride");
        zq3.h(deleteAccountStatusOverride, "deleteAccountStateOverride");
        zq3.h(sSOActionOverrideState, "ssoActionOverride");
        return new SubauthUiParams(z, z2, z3, z4, regiInterface, z5, z6, lIREErrorStateOverride, deleteAccountStatusOverride, sSOActionOverrideState);
    }

    public final DeleteAccountStatusOverride c() {
        return this.deleteAccountStateOverride;
    }

    public final boolean d() {
        return this.enableLIRENetworkDelay;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final LIREErrorStateOverride e() {
        return this.lireErrorStateOverride;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubauthUiParams)) {
            return false;
        }
        SubauthUiParams subauthUiParams = (SubauthUiParams) obj;
        return this.showCaliforniaNotices == subauthUiParams.showCaliforniaNotices && this.isForceLogin == subauthUiParams.isForceLogin && this.showOfferCheckbox == subauthUiParams.showOfferCheckbox && this.isOfferCheckboxChecked == subauthUiParams.isOfferCheckboxChecked && this.regiInterface == subauthUiParams.regiInterface && this.enableLIRENetworkDelay == subauthUiParams.enableLIRENetworkDelay && this.shouldShowEmailSupportButton == subauthUiParams.shouldShowEmailSupportButton && this.lireErrorStateOverride == subauthUiParams.lireErrorStateOverride && this.deleteAccountStateOverride == subauthUiParams.deleteAccountStateOverride && this.ssoActionOverride == subauthUiParams.ssoActionOverride;
    }

    public final RegiInterface f() {
        return this.regiInterface;
    }

    public final boolean g() {
        return this.shouldShowEmailSupportButton;
    }

    public final boolean h() {
        return this.showCaliforniaNotices;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.showCaliforniaNotices) * 31) + Boolean.hashCode(this.isForceLogin)) * 31) + Boolean.hashCode(this.showOfferCheckbox)) * 31) + Boolean.hashCode(this.isOfferCheckboxChecked)) * 31;
        RegiInterface regiInterface = this.regiInterface;
        return ((((((((((hashCode + (regiInterface == null ? 0 : regiInterface.hashCode())) * 31) + Boolean.hashCode(this.enableLIRENetworkDelay)) * 31) + Boolean.hashCode(this.shouldShowEmailSupportButton)) * 31) + this.lireErrorStateOverride.hashCode()) * 31) + this.deleteAccountStateOverride.hashCode()) * 31) + this.ssoActionOverride.hashCode();
    }

    public final boolean i() {
        return this.showOfferCheckbox;
    }

    public final SubauthUserUIDebugAPI.SSOActionOverrideState k() {
        return this.ssoActionOverride;
    }

    public final boolean l() {
        return this.isForceLogin;
    }

    public final boolean m() {
        return this.isOfferCheckboxChecked;
    }

    public String toString() {
        return "SubauthUiParams(showCaliforniaNotices=" + this.showCaliforniaNotices + ", isForceLogin=" + this.isForceLogin + ", showOfferCheckbox=" + this.showOfferCheckbox + ", isOfferCheckboxChecked=" + this.isOfferCheckboxChecked + ", regiInterface=" + this.regiInterface + ", enableLIRENetworkDelay=" + this.enableLIRENetworkDelay + ", shouldShowEmailSupportButton=" + this.shouldShowEmailSupportButton + ", lireErrorStateOverride=" + this.lireErrorStateOverride + ", deleteAccountStateOverride=" + this.deleteAccountStateOverride + ", ssoActionOverride=" + this.ssoActionOverride + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeInt(this.showCaliforniaNotices ? 1 : 0);
        parcel.writeInt(this.isForceLogin ? 1 : 0);
        parcel.writeInt(this.showOfferCheckbox ? 1 : 0);
        parcel.writeInt(this.isOfferCheckboxChecked ? 1 : 0);
        RegiInterface regiInterface = this.regiInterface;
        if (regiInterface == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(regiInterface.name());
        }
        parcel.writeInt(this.enableLIRENetworkDelay ? 1 : 0);
        parcel.writeInt(this.shouldShowEmailSupportButton ? 1 : 0);
        parcel.writeString(this.lireErrorStateOverride.name());
        parcel.writeString(this.deleteAccountStateOverride.name());
        parcel.writeString(this.ssoActionOverride.name());
    }

    public /* synthetic */ SubauthUiParams(boolean z, boolean z2, boolean z3, boolean z4, RegiInterface regiInterface, boolean z5, boolean z6, LIREErrorStateOverride lIREErrorStateOverride, DeleteAccountStatusOverride deleteAccountStatusOverride, SubauthUserUIDebugAPI.SSOActionOverrideState sSOActionOverrideState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : regiInterface, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? LIREErrorStateOverride.NoOverride : lIREErrorStateOverride, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? DeleteAccountStatusOverride.NoOverride : deleteAccountStatusOverride, (i & 512) != 0 ? SubauthUserUIDebugAPI.SSOActionOverrideState.NO_OVERRIDE : sSOActionOverrideState);
    }
}
