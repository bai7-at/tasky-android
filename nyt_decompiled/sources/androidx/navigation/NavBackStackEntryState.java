package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {
    private final Bundle args;
    private final int destinationId;
    private final String id;
    private final Bundle savedState;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            zq3.h(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        zq3.h(navBackStackEntry, "entry");
        this.id = navBackStackEntry.f();
        this.destinationId = navBackStackEntry.e().q();
        this.args = navBackStackEntry.c();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        navBackStackEntry.i(bundle);
    }

    public final int a() {
        return this.destinationId;
    }

    public final String b() {
        return this.id;
    }

    public final NavBackStackEntry c(Context context, NavDestination navDestination, Lifecycle.State state, c cVar) {
        zq3.h(context, "context");
        zq3.h(navDestination, "destination");
        zq3.h(state, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.r.a(context, navDestination, bundle, state, cVar, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public NavBackStackEntryState(Parcel parcel) {
        zq3.h(parcel, "inParcel");
        String readString = parcel.readString();
        zq3.e(readString);
        this.id = readString;
        this.destinationId = parcel.readInt();
        this.args = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        zq3.e(readBundle);
        this.savedState = readBundle;
    }
}
