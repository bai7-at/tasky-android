package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.a;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends a> implements Parcelable {
    private final Bundle params;

    public enum Type {
        PHOTO,
        VIDEO;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static abstract class a {
        public static final C0171a b = new C0171a(null);
        private Bundle a = new Bundle();

        /* renamed from: com.facebook.share.model.ShareMedia$a$a, reason: collision with other inner class name */
        public static final class C0171a {
            public /* synthetic */ C0171a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                zq3.h(parcel, "parcel");
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (readParcelableArray == null) {
                    return i.l();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            private C0171a() {
            }
        }

        public final Bundle a() {
            return this.a;
        }

        public a b(ShareMedia shareMedia) {
            return shareMedia == null ? this : c(shareMedia.params);
        }

        public final a c(Bundle bundle) {
            zq3.h(bundle, "parameters");
            this.a.putAll(bundle);
            return this;
        }
    }

    protected ShareMedia(a aVar) {
        zq3.h(aVar, "builder");
        this.params = new Bundle(aVar.a());
    }

    public abstract Type b();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeBundle(this.params);
    }

    public ShareMedia(Parcel parcel) {
        zq3.h(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.params = readBundle == null ? new Bundle() : readBundle;
    }
}
