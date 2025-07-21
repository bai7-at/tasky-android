package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, a> {
    private final Uri localUrl;
    private final ShareMedia.Type mediaType;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<ShareVideo> CREATOR = new b();

    public static final class a extends ShareMedia.a {
        private Uri c;

        public ShareVideo d() {
            return new ShareVideo(this, null);
        }

        public final Uri e() {
            return this.c;
        }

        public a f(ShareVideo shareVideo) {
            return shareVideo == null ? this : h(shareVideo.c());
        }

        public final a g(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return f((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        public final a h(Uri uri) {
            this.c = uri;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideo createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new ShareVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareVideo(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type b() {
        return this.mediaType;
    }

    public final Uri c() {
        return this.localUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.localUrl, 0);
    }

    private ShareVideo(a aVar) {
        super(aVar);
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = aVar.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "parcel");
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
