package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CameraEffectArguments implements Parcelable {
    private final Bundle params;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new b();

    public static final class a {
        private final Bundle a = new Bundle();

        public CameraEffectArguments a() {
            return new CameraEffectArguments(this, null);
        }

        public final Bundle b() {
            return this.a;
        }

        public final a c(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return d((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        public a d(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.a.putAll(cameraEffectArguments.params);
            }
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ CameraEffectArguments(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Object b(String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    public final Set c() {
        Bundle bundle = this.params;
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
        parcel.writeBundle(this.params);
    }

    private CameraEffectArguments(a aVar) {
        this.params = aVar.b();
    }

    public CameraEffectArguments(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
