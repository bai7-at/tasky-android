package com.nytimes.android.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.n;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.LegacyCollectionAsset;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AssetArgs implements Parcelable {
    public static final int $stable = 0;
    private static final String BUNDLE_KEY = "AssetDataBundleKey";
    private final String assetType;
    private final boolean forceLoadInApp;
    private final boolean hybrid;
    private final Long lastModified;
    private final boolean overrideMeter;
    private final boolean showSharing;
    private final int slideshowSlotIndex;
    private final String stringExtra;
    private final String uri;
    private final String url;
    private final String urlWithQueryParameters;
    public static final a Companion = new a(null);
    public static final Parcelable.Creator<AssetArgs> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(Asset asset) {
            return asset instanceof InteractiveAsset ? ((InteractiveAsset) asset).getInteractiveUrl() : asset instanceof LegacyCollectionAsset ? ((LegacyCollectionAsset) asset).getInteractiveUrl() : asset.getUrlOrEmpty();
        }

        private final String c(String str, String str2) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            Uri parse = Uri.parse("?" + str2);
            for (String str3 : parse.getQueryParameterNames()) {
                buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
            String uri = buildUpon.build().toString();
            zq3.g(uri, "toString(...)");
            return uri;
        }

        public final AssetArgs a(n nVar) {
            zq3.h(nVar, "savedStateHandle");
            Object d = nVar.d(AssetArgs.BUNDLE_KEY);
            zq3.e(d);
            return (AssetArgs) d;
        }

        public final AssetArgs d(Asset asset, String str, String str2) {
            zq3.h(asset, "asset");
            String b = b(asset);
            if (str != null) {
                b = c(b, str);
            }
            String str3 = b;
            String url = str2 == null ? asset.getUrl() : str2;
            return new AssetArgs(asset.getSafeUri(), url, asset.getAssetType(), Long.valueOf(asset.getLastModified()), 0, str3, false, false, false, false, url, 976, null);
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssetArgs createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new AssetArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AssetArgs[] newArray(int i) {
            return new AssetArgs[i];
        }
    }

    public AssetArgs(String str, String str2, String str3, Long l, int i, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.uri = str;
        this.url = str2;
        this.assetType = str3;
        this.lastModified = l;
        this.slideshowSlotIndex = i;
        this.stringExtra = str4;
        this.forceLoadInApp = z;
        this.overrideMeter = z2;
        this.showSharing = z3;
        this.hybrid = z4;
        this.urlWithQueryParameters = str5;
    }

    public final String a() {
        return this.assetType;
    }

    public final boolean b() {
        return this.forceLoadInApp;
    }

    public final boolean c() {
        return this.hybrid;
    }

    public final Long d() {
        return this.lastModified;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.overrideMeter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetArgs)) {
            return false;
        }
        AssetArgs assetArgs = (AssetArgs) obj;
        return zq3.c(this.uri, assetArgs.uri) && zq3.c(this.url, assetArgs.url) && zq3.c(this.assetType, assetArgs.assetType) && zq3.c(this.lastModified, assetArgs.lastModified) && this.slideshowSlotIndex == assetArgs.slideshowSlotIndex && zq3.c(this.stringExtra, assetArgs.stringExtra) && this.forceLoadInApp == assetArgs.forceLoadInApp && this.overrideMeter == assetArgs.overrideMeter && this.showSharing == assetArgs.showSharing && this.hybrid == assetArgs.hybrid && zq3.c(this.urlWithQueryParameters, assetArgs.urlWithQueryParameters);
    }

    public final boolean f() {
        return this.showSharing;
    }

    public final int g() {
        return this.slideshowSlotIndex;
    }

    public final String h() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.assetType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.lastModified;
        int hashCode4 = (((hashCode3 + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.slideshowSlotIndex)) * 31;
        String str4 = this.stringExtra;
        int hashCode5 = (((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.forceLoadInApp)) * 31) + Boolean.hashCode(this.overrideMeter)) * 31) + Boolean.hashCode(this.showSharing)) * 31) + Boolean.hashCode(this.hybrid)) * 31;
        String str5 = this.urlWithQueryParameters;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.url;
    }

    public final String k() {
        return this.urlWithQueryParameters;
    }

    public final Bundle l() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_KEY, this);
        return bundle;
    }

    public String toString() {
        return "AssetArgs(uri=" + this.uri + ", url=" + this.url + ", assetType=" + this.assetType + ", lastModified=" + this.lastModified + ", slideshowSlotIndex=" + this.slideshowSlotIndex + ", stringExtra=" + this.stringExtra + ", forceLoadInApp=" + this.forceLoadInApp + ", overrideMeter=" + this.overrideMeter + ", showSharing=" + this.showSharing + ", hybrid=" + this.hybrid + ", urlWithQueryParameters=" + this.urlWithQueryParameters + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeString(this.uri);
        parcel.writeString(this.url);
        parcel.writeString(this.assetType);
        Long l = this.lastModified;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.slideshowSlotIndex);
        parcel.writeString(this.stringExtra);
        parcel.writeInt(this.forceLoadInApp ? 1 : 0);
        parcel.writeInt(this.overrideMeter ? 1 : 0);
        parcel.writeInt(this.showSharing ? 1 : 0);
        parcel.writeInt(this.hybrid ? 1 : 0);
        parcel.writeString(this.urlWithQueryParameters);
    }

    public /* synthetic */ AssetArgs(String str, String str2, String str3, Long l, int i, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? true : z3, (i2 & 512) == 0 ? z4 : false, (i2 & 1024) == 0 ? str5 : null);
    }
}
