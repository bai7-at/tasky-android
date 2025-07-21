package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.a, 1);
        versionedParcel.F(audioAttributesImplBase.b, 2);
        versionedParcel.F(audioAttributesImplBase.c, 3);
        versionedParcel.F(audioAttributesImplBase.d, 4);
    }
}
