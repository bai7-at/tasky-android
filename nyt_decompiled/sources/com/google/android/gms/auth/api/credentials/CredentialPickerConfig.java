package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
/* loaded from: classes2.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new c();

    @SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean mShowCancelButton;

    @SafeParcelable.Field(id = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT)
    private final int zzv;

    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zzw;

    @SafeParcelable.Field(getter = "isForNewAccount", id = 3)
    @Deprecated
    private final boolean zzx;

    @SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int zzy;

    public static class a {
        private boolean a = false;
        private boolean b = true;
        private int c = 1;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(this);
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.zzv = i;
        this.zzw = z;
        this.mShowCancelButton = z2;
        if (i < 2) {
            this.zzx = z3;
            this.zzy = z3 ? 3 : 1;
        } else {
            this.zzx = i2 == 3;
            this.zzy = i2;
        }
    }

    public final boolean G0() {
        return this.zzw;
    }

    public final boolean H0() {
        return this.mShowCancelButton;
    }

    public final boolean t0() {
        return this.zzy == 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, G0());
        SafeParcelWriter.writeBoolean(parcel, 2, H0());
        SafeParcelWriter.writeBoolean(parcel, 3, t0());
        SafeParcelWriter.writeInt(parcel, 4, this.zzy);
        SafeParcelWriter.writeInt(parcel, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CredentialPickerConfig(a aVar) {
        this(2, aVar.a, aVar.b, false, aVar.c);
    }
}
