package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.r;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    private static final String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final ArrayList<String> mFragmentWhos;
    final int mIndex;
    final String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.mOps = new int[size * 6];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.mFragmentWhos = new ArrayList<>(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            r.a aVar2 = (r.a) aVar.c.get(i2);
            int i3 = i + 1;
            this.mOps[i] = aVar2.a;
            ArrayList<String> arrayList = this.mFragmentWhos;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.mOps;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.mOldMaxLifecycleStates[i2] = aVar2.h.ordinal();
            this.mCurrentMaxLifecycleStates[i2] = aVar2.i.ordinal();
        }
        this.mTransition = aVar.h;
        this.mName = aVar.k;
        this.mIndex = aVar.v;
        this.mBreadCrumbTitleRes = aVar.l;
        this.mBreadCrumbTitleText = aVar.m;
        this.mBreadCrumbShortTitleRes = aVar.n;
        this.mBreadCrumbShortTitleText = aVar.o;
        this.mSharedElementSourceNames = aVar.p;
        this.mSharedElementTargetNames = aVar.q;
        this.mReorderingAllowed = aVar.r;
    }

    private void a(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.mOps.length) {
                aVar.h = this.mTransition;
                aVar.k = this.mName;
                aVar.i = true;
                aVar.l = this.mBreadCrumbTitleRes;
                aVar.m = this.mBreadCrumbTitleText;
                aVar.n = this.mBreadCrumbShortTitleRes;
                aVar.o = this.mBreadCrumbShortTitleText;
                aVar.p = this.mSharedElementSourceNames;
                aVar.q = this.mSharedElementTargetNames;
                aVar.r = this.mReorderingAllowed;
                return;
            }
            r.a aVar2 = new r.a();
            int i3 = i + 1;
            aVar2.a = this.mOps[i];
            if (FragmentManager.L0(2)) {
                Log.v(TAG, "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.mOps[i3]);
            }
            aVar2.h = Lifecycle.State.values()[this.mOldMaxLifecycleStates[i2]];
            aVar2.i = Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i2]];
            int[] iArr = this.mOps;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i5 = iArr[i4];
            aVar2.d = i5;
            int i6 = iArr[i + 3];
            aVar2.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar2.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar2.g = i9;
            aVar.d = i5;
            aVar.e = i6;
            aVar.f = i8;
            aVar.g = i9;
            aVar.f(aVar2);
            i2++;
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.v = this.mIndex;
        for (int i = 0; i < this.mFragmentWhos.size(); i++) {
            String str = this.mFragmentWhos.get(i);
            if (str != null) {
                ((r.a) aVar.c.get(i)).b = fragmentManager.g0(str);
            }
        }
        aVar.w(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mBreadCrumbTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }
}
