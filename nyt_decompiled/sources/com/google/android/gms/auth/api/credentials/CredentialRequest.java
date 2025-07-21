package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

@SafeParcelable.Class(creator = "CredentialRequestCreator")
/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new e();

    @SafeParcelable.Field(getter = "isPasswordLoginSupported", id = 1)
    private final boolean zzaa;

    @SafeParcelable.Field(getter = "getAccountTypes", id = 2)
    private final String[] zzab;

    @SafeParcelable.Field(getter = "getCredentialPickerConfig", id = 3)
    private final CredentialPickerConfig zzac;

    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", id = 4)
    private final CredentialPickerConfig zzad;

    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzae;

    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    private final String zzaf;

    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    private final String zzag;

    @SafeParcelable.Field(getter = "getRequireUserMediation", id = 8)
    private final boolean zzah;

    @SafeParcelable.Field(id = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT)
    private final int zzv;

    public static final class a {
        private boolean a;
        private String[] b;
        private CredentialPickerConfig c;
        private CredentialPickerConfig d;
        private boolean e = false;
        private boolean f = false;
        private String g = null;
        private String h;

        public final CredentialRequest a() {
            if (this.b == null) {
                this.b = new String[0];
            }
            if (this.a || this.b.length != 0) {
                return new CredentialRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final a b(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.b = strArr;
            return this;
        }

        public final a c(boolean z) {
            this.a = z;
            return this;
        }
    }

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.zzv = i;
        this.zzaa = z;
        this.zzab = (String[]) Preconditions.checkNotNull(strArr);
        this.zzac = credentialPickerConfig == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig;
        this.zzad = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig2;
        if (i < 3) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
        } else {
            this.zzae = z2;
            this.zzaf = str;
            this.zzag = str2;
        }
        this.zzah = z3;
    }

    public final CredentialPickerConfig G0() {
        return this.zzad;
    }

    public final CredentialPickerConfig H0() {
        return this.zzac;
    }

    public final String K0() {
        return this.zzag;
    }

    public final String X0() {
        return this.zzaf;
    }

    public final String[] t0() {
        return this.zzab;
    }

    public final boolean u1() {
        return this.zzae;
    }

    public final boolean v1() {
        return this.zzaa;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, v1());
        SafeParcelWriter.writeStringArray(parcel, 2, t0(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, H0(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, G0(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, u1());
        SafeParcelWriter.writeString(parcel, 6, X0(), false);
        SafeParcelWriter.writeString(parcel, 7, K0(), false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzah);
        SafeParcelWriter.writeInt(parcel, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CredentialRequest(a aVar) {
        this(4, aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.g, aVar.h, false);
    }
}
