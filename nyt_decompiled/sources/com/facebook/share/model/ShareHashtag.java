package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ShareHashtag implements Parcelable {
    private final String hashtag;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new b();

    public static final class a {
        private String a;

        public ShareHashtag a() {
            return new ShareHashtag(this, null);
        }

        public final String b() {
            return this.a;
        }

        public a c(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : e(shareHashtag.a());
        }

        public final a d(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return c((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public final a e(String str) {
            this.a = str;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareHashtag(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final String a() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeString(this.hashtag);
    }

    private ShareHashtag(a aVar) {
        this.hashtag = aVar.b();
    }

    public ShareHashtag(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.hashtag = parcel.readString();
    }
}
