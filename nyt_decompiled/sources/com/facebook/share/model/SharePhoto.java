package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, a> {
    private final Bitmap bitmap;
    private final String caption;
    private final Uri imageUrl;
    private final ShareMedia.Type mediaType;
    private final boolean userGenerated;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<SharePhoto> CREATOR = new b();

    public static final class a extends ShareMedia.a {
        public static final C0172a g = new C0172a(null);
        private Bitmap c;
        private Uri d;
        private boolean e;
        private String f;

        /* renamed from: com.facebook.share.model.SharePhoto$a$a, reason: collision with other inner class name */
        public static final class C0172a {
            public /* synthetic */ C0172a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                zq3.h(parcel, "parcel");
                List a = ShareMedia.a.b.a(parcel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    if (obj instanceof SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final void b(Parcel parcel, int i, List list) {
                zq3.h(parcel, "out");
                zq3.h(list, "photos");
                Object[] array = list.toArray(new SharePhoto[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                parcel.writeParcelableArray((SharePhoto[]) array, i);
            }

            private C0172a() {
            }
        }

        public SharePhoto d() {
            return new SharePhoto(this, null);
        }

        public final Bitmap e() {
            return this.c;
        }

        public final String f() {
            return this.f;
        }

        public final Uri g() {
            return this.d;
        }

        public final boolean h() {
            return this.e;
        }

        public a i(SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((a) super.b(sharePhoto)).k(sharePhoto.c()).m(sharePhoto.e()).n(sharePhoto.f()).l(sharePhoto.d());
        }

        public final a j(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return i((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        public final a k(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public final a l(String str) {
            this.f = str;
            return this;
        }

        public final a m(Uri uri) {
            this.d = uri;
            return this;
        }

        public final a n(boolean z) {
            this.e = z;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ SharePhoto(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type b() {
        return this.mediaType;
    }

    public final Bitmap c() {
        return this.bitmap;
    }

    public final String d() {
        return this.caption;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Uri e() {
        return this.imageUrl;
    }

    public final boolean f() {
        return this.userGenerated;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        parcel.writeString(this.caption);
    }

    private SharePhoto(a aVar) {
        super(aVar);
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = aVar.e();
        this.imageUrl = aVar.g();
        this.userGenerated = aVar.h();
        this.caption = aVar.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "parcel");
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }
}
