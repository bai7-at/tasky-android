package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, a> {
    private final List<SharePhoto> photos;
    public static final c Companion = new c(null);
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new b();

    public static final class a extends ShareContent.a {
        private final List g = new ArrayList();

        public final a n(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.g.add(new SharePhoto.a().i(sharePhoto).d());
            }
            return this;
        }

        public final a o(List list) {
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    n((SharePhoto) it2.next());
                }
            }
            return this;
        }

        public SharePhotoContent p() {
            return new SharePhotoContent(this, null);
        }

        public final List q() {
            return this.g;
        }

        public a r(SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((a) super.g(sharePhotoContent)).o(sharePhotoContent.h());
        }

        public final a s(List list) {
            this.g.clear();
            o(list);
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ SharePhotoContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List h() {
        return this.photos;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        super.writeToParcel(parcel, i);
        SharePhoto.a.g.b(parcel, i, this.photos);
    }

    private SharePhotoContent(a aVar) {
        super(aVar);
        this.photos = i.X0(aVar.q());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "parcel");
        this.photos = i.X0(SharePhoto.a.g.a(parcel));
    }
}
