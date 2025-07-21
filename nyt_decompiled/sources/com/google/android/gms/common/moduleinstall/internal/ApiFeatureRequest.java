package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@KeepForSdk
@SafeParcelable.Class(creator = "ApiFeatureRequestCreator")
/* loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();
    private static final Comparator zaa = new Comparator() { // from class: com.google.android.gms.common.moduleinstall.internal.zab
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.getVersion() > feature2.getVersion() ? 1 : (feature.getVersion() == feature2.getVersion() ? 0 : -1));
        }
    };

    @SafeParcelable.Field(getter = "getApiFeatures", id = 1)
    private final List zab;

    @SafeParcelable.Field(getter = "getIsUrgent", id = 2)
    private final boolean zac;

    @SafeParcelable.Field(getter = "getFeatureRequestSessionId", id = 3)
    private final String zad;

    @SafeParcelable.Field(getter = "getCallingPackage", id = 4)
    private final String zae;

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        Preconditions.checkNotNull(list);
        this.zab = list;
        this.zac = z;
        this.zad = str;
        this.zae = str2;
    }

    @KeepForSdk
    public static ApiFeatureRequest fromModuleInstallRequest(ModuleInstallRequest moduleInstallRequest) {
        return zaa(moduleInstallRequest.getApis(), true);
    }

    static ApiFeatureRequest zaa(List list, boolean z) {
        TreeSet treeSet = new TreeSet(zaa);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Collections.addAll(treeSet, ((OptionalModuleApi) it2.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.zac == apiFeatureRequest.zac && Objects.equal(this.zab, apiFeatureRequest.zab) && Objects.equal(this.zad, apiFeatureRequest.zad) && Objects.equal(this.zae, apiFeatureRequest.zae);
    }

    @KeepForSdk
    public List<Feature> getApiFeatures() {
        return this.zab;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zac), this.zab, this.zad, this.zae);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getApiFeatures(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zac);
        SafeParcelWriter.writeString(parcel, 3, this.zad, false);
        SafeParcelWriter.writeString(parcel, 4, this.zae, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
