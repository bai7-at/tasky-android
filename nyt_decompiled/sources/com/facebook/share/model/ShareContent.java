package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.a;
import com.facebook.share.model.ShareHashtag;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends a> implements Parcelable {
    private final Uri contentUrl;
    private final String pageId;
    private final List<String> peopleIds;
    private final String placeId;
    private final String ref;
    private final ShareHashtag shareHashtag;

    public static abstract class a {
        private Uri a;
        private List b;
        private String c;
        private String d;
        private String e;
        private ShareHashtag f;

        public final Uri a() {
            return this.a;
        }

        public final ShareHashtag b() {
            return this.f;
        }

        public final String c() {
            return this.d;
        }

        public final List d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.e;
        }

        public a g(ShareContent shareContent) {
            return shareContent == null ? this : h(shareContent.a()).j(shareContent.c()).k(shareContent.d()).i(shareContent.b()).l(shareContent.e()).m(shareContent.f());
        }

        public final a h(Uri uri) {
            this.a = uri;
            return this;
        }

        public final a i(String str) {
            this.d = str;
            return this;
        }

        public final a j(List list) {
            this.b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        public final a k(String str) {
            this.c = str;
            return this;
        }

        public final a l(String str) {
            this.e = str;
            return this;
        }

        public final a m(ShareHashtag shareHashtag) {
            this.f = shareHashtag;
            return this;
        }
    }

    protected ShareContent(a aVar) {
        zq3.h(aVar, "builder");
        this.contentUrl = aVar.a();
        this.peopleIds = aVar.d();
        this.placeId = aVar.e();
        this.pageId = aVar.c();
        this.ref = aVar.f();
        this.shareHashtag = aVar.b();
    }

    private final List g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Uri a() {
        return this.contentUrl;
    }

    public final String b() {
        return this.pageId;
    }

    public final List c() {
        return this.peopleIds;
    }

    public final String d() {
        return this.placeId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.ref;
    }

    public final ShareHashtag f() {
        return this.shareHashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.shareHashtag, 0);
    }

    protected ShareContent(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = g(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new ShareHashtag.a().d(parcel).a();
    }
}
