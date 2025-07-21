package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CameraEffectTextures implements Parcelable {
    private final Bundle textures;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new b();

    public static final class a {
        private final Bundle a = new Bundle();

        public CameraEffectTextures a() {
            return new CameraEffectTextures(this, null);
        }

        public final Bundle b() {
            return this.a;
        }

        public final a c(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return d((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        public a d(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.a.putAll(cameraEffectTextures.textures);
            }
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ CameraEffectTextures(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Bitmap b(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri c(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public final Set d() {
        Bundle bundle = this.textures;
        Set<String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? b0.e() : keySet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeBundle(this.textures);
    }

    private CameraEffectTextures(a aVar) {
        this.textures = aVar.b();
    }

    public CameraEffectTextures(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
